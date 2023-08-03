SUMMARY = "Microsoft Azure Managednetworkfabric Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Managednetworkfabric Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-managednetworkfabric-1.0.0-1.1.noarch.rpm"
RPM_HASH = "a2c7d8964a320ac23bc6a4b87f864bdc22e2b83ea3935310cd8fb7a3a942b42a6c9a06dfe35cf918663cb91248a7267dd54ac9badf0e457bcaf019d7de702d06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-managednetworkfabric \
python39-azure-mgmt-managednetworkfabric \
python3dist-azure-mgmt-managednetworkfabric"

RDEPENDS:${PN} += "-python39-azure-common >= 1.1 with python39-azure-common < 2.0.0 \
-python39-azure-mgmt-core >= 1.3.2 with python39-azure-mgmt-core < 2.0.0 \
-python39-isodate >= 0.6.1 with python39-isodate < 1.0.0 \
python-abi \
python39-azure-mgmt-nspkg \
python39-azure-nspkg"

inherit rpm
