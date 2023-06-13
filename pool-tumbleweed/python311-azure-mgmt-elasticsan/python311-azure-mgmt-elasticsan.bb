SUMMARY = "Microsoft Azure Elasticsan Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elasticsan Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python311-azure-mgmt-elasticsan-1.0.0b1-1.3.noarch.rpm"
RPM_HASH = "c513e4f643baaff7ff3ae67fe0f5a31f50f6a04002e4409e6e1322f5a470c3519c38235b47e936a831219f6c87189f0fc47c17334e24c3097e68b2eaa1c3f1e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-elasticsan) \
python311-azure-mgmt-elasticsan \
python3dist(azure-mgmt-elasticsan)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
