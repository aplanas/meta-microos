SUMMARY = "Microsoft Azure Traffic Manager Client Library"
DESCRIPTION = "This is the Microsoft Azure Traffic Manager Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-trafficmanager-1.1.0-1.1.noarch.rpm"
RPM_HASH = "a021ea44f86779f54ab240f5a39a0754d1981b387516bb999f6684d41c75446f2f117c0e89a9ec8c5e19d91f7a0fd55ba9e8c182b3887db60c253ba845043ae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-trafficmanager \
python39-azure-mgmt-trafficmanager \
python3dist-azure-mgmt-trafficmanager"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
