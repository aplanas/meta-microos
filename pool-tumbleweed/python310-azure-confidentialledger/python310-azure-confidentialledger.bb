SUMMARY = "Microsoft Azure Confidential Ledger client library"
DESCRIPTION = "Azure Confidential Ledger provides a service for logging to an immutable, tamper-proof \
ledger. As part of the Azure Confidential Computing portfolio, Azure Confidential Ledger \
runs in secure, hardware-based trusted execution environments, also known as enclaves. \
It is built on Microsoft Research's Confidential Consortium Framework."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-confidentialledger-1.1.0-1.1.noarch.rpm"
RPM_HASH = "c0e614cdf1801a1a7bea207e43ea8112512105f04ac619da112bcf37e3a62ac67fa1d5b612ffbe10b3c7ee5c65904a9ed5c7e2446bf02e705612bb49de86b0e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-confidentialledger \
python3.10dist(azure-confidentialledger) \
python310-azure-confidentialledger \
python3dist(azure-confidentialledger)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-core \
python310-azure-nspkg \
python310-cryptography \
python310-isodate"

inherit rpm
