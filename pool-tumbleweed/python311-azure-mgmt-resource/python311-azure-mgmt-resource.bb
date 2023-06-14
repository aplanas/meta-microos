SUMMARY = "Microsoft Azure Resource Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "23.0.1"

RPM_NAME = "python311-azure-mgmt-resource-23.0.1-1.1.noarch.rpm"
RPM_HASH = "fb1a69deabb1f28ab63a500f5dafa92afc062fce8baa3363e3a5b2b112114bdaca7b4b28916b4e5a00aaf55011055fe027ae96ed8e527f2cebccefe473967a64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-resource \
python311-azure-mgmt-resource \
python3dist-azure-mgmt-resource"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
