SUMMARY = "Microsoft Azure Cost Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cost Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-azure-mgmt-costmanagement-4.0.0-1.1.noarch.rpm"
RPM_HASH = "9ed7f4ccf28db325d42b643dfeb3490f4f53a21391cb528a3d14d9bae0b99dffbca4f363b78728833285223b8f71778fcee576f90dfe4bfb263817292fb3d9b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-costmanagement \
python3.10dist-azure-mgmt-costmanagement \
python310-azure-mgmt-costmanagement \
python3dist-azure-mgmt-costmanagement"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
