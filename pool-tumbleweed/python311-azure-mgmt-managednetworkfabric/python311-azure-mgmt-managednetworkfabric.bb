SUMMARY = "Microsoft Azure Managednetworkfabric Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Managednetworkfabric Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-managednetworkfabric-1.0.0-1.1.noarch.rpm"
RPM_HASH = "5ae47eebbd27217e7eec968ea5f2354a8331e8c44630346903ee86ac11388ca431cda9797cb9d0916e985236803b68109dd52762e9d67725ffe4ab6685fd30a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-managednetworkfabric \
python3.11dist-azure-mgmt-managednetworkfabric \
python311-azure-mgmt-managednetworkfabric \
python3dist-azure-mgmt-managednetworkfabric"

RDEPENDS:${PN} += "-python311-azure-common >= 1.1 with python311-azure-common < 2.0.0 \
-python311-azure-mgmt-core >= 1.3.2 with python311-azure-mgmt-core < 2.0.0 \
-python311-isodate >= 0.6.1 with python311-isodate < 1.0.0 \
python-abi \
python311-azure-mgmt-nspkg \
python311-azure-nspkg"

inherit rpm
