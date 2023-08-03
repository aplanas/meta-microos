SUMMARY = "Microsoft Azure Managednetworkfabric Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Managednetworkfabric Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-managednetworkfabric-1.0.0-1.1.noarch.rpm"
RPM_HASH = "329dac818403bb73a10c08a1b711cb13ccb245753620086664e483a43c310b4eb5b04c7850305496f4fb1d8a6a0b55ed38e2fd785197339ce5cb7f9d8b46186d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-managednetworkfabric \
python310-azure-mgmt-managednetworkfabric \
python3dist-azure-mgmt-managednetworkfabric"

RDEPENDS:${PN} += "-python310-azure-common >= 1.1 with python310-azure-common < 2.0.0 \
-python310-azure-mgmt-core >= 1.3.2 with python310-azure-mgmt-core < 2.0.0 \
-python310-isodate >= 0.6.1 with python310-isodate < 1.0.0 \
python-abi \
python310-azure-mgmt-nspkg \
python310-azure-nspkg"

inherit rpm
