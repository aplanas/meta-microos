SUMMARY = "Microsoft Azure Confidential Ledger client library"
DESCRIPTION = "Azure Confidential Ledger provides a service for logging to an immutable, tamper-proof \
ledger. As part of the Azure Confidential Computing portfolio, Azure Confidential Ledger \
runs in secure, hardware-based trusted execution environments, also known as enclaves. \
It is built on Microsoft Research's Confidential Consortium Framework."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-confidentialledger-1.1.0-1.2.noarch.rpm"
RPM_HASH = "d94c6edcd3df14d219f075d74d7209f72efc11b06afc88fcfa016fcce914550004f878f7e3abd3f14db2da4480c0704620335c4aefba13440976365ac1503235"
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
