SUMMARY = "Microsoft Azure Confidential Ledger client library"
DESCRIPTION = "Azure Confidential Ledger provides a service for logging to an immutable, tamper-proof \
ledger. As part of the Azure Confidential Computing portfolio, Azure Confidential Ledger \
runs in secure, hardware-based trusted execution environments, also known as enclaves. \
It is built on Microsoft Research's Confidential Consortium Framework."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-azure-confidentialledger-1.1.1-1.1.noarch.rpm"
RPM_HASH = "d1db9b2ffde6c9e5b09c025963315fbbde7469bcc379f68b6713f8e2bad659e9b9e57ea870761d535b89334091f3601b08dd69eba409256fd95e6dee0fd3ed71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-confidentialledger \
python39-azure-confidentialledger \
python3dist-azure-confidentialledger"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-cryptography \
python39-isodate"

inherit rpm
