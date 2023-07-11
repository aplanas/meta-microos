SUMMARY = "Microsoft Azure Confidential Ledger client library"
DESCRIPTION = "Azure Confidential Ledger provides a service for logging to an immutable, tamper-proof \
ledger. As part of the Azure Confidential Computing portfolio, Azure Confidential Ledger \
runs in secure, hardware-based trusted execution environments, also known as enclaves. \
It is built on Microsoft Research's Confidential Consortium Framework."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-confidentialledger-1.1.0-1.2.noarch.rpm"
RPM_HASH = "ce87e610f608eae24a2f30407d116d6eb65610727eb5efdff6ff4d5a91d1fe8e5429ba086de2c5534484d085b7841a121bed189868f323f04bd5110e5b186f7a"
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
