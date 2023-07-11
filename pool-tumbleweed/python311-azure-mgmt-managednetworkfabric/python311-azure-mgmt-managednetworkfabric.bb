SUMMARY = "Microsoft Azure Managednetworkfabric Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Managednetworkfabric Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-mgmt-managednetworkfabric-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "e18b8f0d20fb9a03d9fe7e9ba8cf0026c36a0db72952c127087b23c2d5f577477ba1b445a64d520fe393b07bac009cf74d7d8f47cbfee8abc100f02daecb7459"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-managednetworkfabric \
python3.11dist-azure-mgmt-managednetworkfabric \
python311-azure-mgmt-managednetworkfabric \
python3dist-azure-mgmt-managednetworkfabric"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
