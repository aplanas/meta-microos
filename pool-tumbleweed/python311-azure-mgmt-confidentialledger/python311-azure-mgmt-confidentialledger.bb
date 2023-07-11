SUMMARY = "Microsoft Azure Confidential Ledger Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Confidential Ledger Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-confidentialledger-1.0.0-1.6.noarch.rpm"
RPM_HASH = "18ad8537b534f4ad2c61168db35a0eb90459a156cdeb92197b40fb38320fb175d1a25699c338410afcb3ca3b23c107dae496a96b6b5c688f596d9e5d4df4d9d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-confidentialledger \
python3.11dist-azure-mgmt-confidentialledger \
python311-azure-mgmt-confidentialledger \
python3dist-azure-mgmt-confidentialledger"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
