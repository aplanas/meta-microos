SUMMARY = "Microsoft Azure Container Registry Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Registry Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python310-azure-mgmt-containerregistry-10.1.0-1.2.noarch.rpm"
RPM_HASH = "9d0000d936bd64e29b67176179c7317b941b98b102bd8f77de39c66df65cf3ddca6baa457a9f57a48d6481e44fe9bbbc32431c300a74360f05db44d4917f7d04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-containerregistry \
python3.10dist-azure-mgmt-containerregistry \
python310-azure-mgmt-containerregistry \
python3dist-azure-mgmt-containerregistry"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
