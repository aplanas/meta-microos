SUMMARY = "Microsoft Azure Container Registry Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Registry Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python39-azure-mgmt-containerregistry-10.1.0-1.2.noarch.rpm"
RPM_HASH = "4e30a20af0de74efbdaaf79f62fa8ec62bbd38cc5f9e8b77bf3c50f7170b230e5e408364194163ac2d539ee9d54200c959ff8b07cfe46bfcce3f41a3b773ed2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-containerregistry) \
python39-azure-mgmt-containerregistry \
python3dist(azure-mgmt-containerregistry)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
