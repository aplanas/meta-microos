SUMMARY = "Microsoft Azure Confidential Ledger client library"
DESCRIPTION = "Azure Confidential Ledger provides a service for logging to an immutable, tamper-proof \
ledger. As part of the Azure Confidential Computing portfolio, Azure Confidential Ledger \
runs in secure, hardware-based trusted execution environments, also known as enclaves. \
It is built on Microsoft Research's Confidential Consortium Framework."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-azure-confidentialledger-1.1.1-1.1.noarch.rpm"
RPM_HASH = "b3505b73d10d8c703b89f0a47e82e2015742ac28205bdc95c4c12f5e39456189a5b476f797de36ae4e5e625cfb6459013b95822d40b63ccf50511ac1c8b5c843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-confidentialledger \
python310-azure-confidentialledger \
python3dist-azure-confidentialledger"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-cryptography \
python310-isodate"

inherit rpm
