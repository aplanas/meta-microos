SUMMARY = "Microsoft Azure Managednetworkfabric Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Managednetworkfabric Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-mgmt-managednetworkfabric-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "bf5fd7138a3142023d14c4c8b4359801bbd1a677663d600caf2be5b495b852acb84f94c763edb96aefe06fc2c4e2ec156e80df5ecf74744eb4cc28d43e6eac8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-managednetworkfabric \
python39-azure-mgmt-managednetworkfabric \
python3dist-azure-mgmt-managednetworkfabric"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
