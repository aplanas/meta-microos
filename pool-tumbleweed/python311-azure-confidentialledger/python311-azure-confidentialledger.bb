SUMMARY = "Microsoft Azure Confidential Ledger client library"
DESCRIPTION = "Azure Confidential Ledger provides a service for logging to an immutable, tamper-proof \
ledger. As part of the Azure Confidential Computing portfolio, Azure Confidential Ledger \
runs in secure, hardware-based trusted execution environments, also known as enclaves. \
It is built on Microsoft Research's Confidential Consortium Framework."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-azure-confidentialledger-1.1.1-1.1.noarch.rpm"
RPM_HASH = "98763bb6a3e63639aaa227ed7258186a501f8a3cc4bfd323e7a6feeb13361aaf4a6f7ed7c05c613de32f6082e18735d7ca85d5bded37f4879780ef5217b17c2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-confidentialledger \
python3.11dist-azure-confidentialledger \
python311-azure-confidentialledger \
python3dist-azure-confidentialledger"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-cryptography \
python311-isodate"

inherit rpm
