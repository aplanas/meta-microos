SUMMARY = "Microsoft Azure Dev Spaces Client Library"
DESCRIPTION = "This is the Microsoft Azure Dev Spaces Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python39-azure-mgmt-devspaces-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "9ed32908fc974035dbed6e5987a0bf0e0feed6c65750589c8075bd6e9a3c2c8dfba7118e3c76d6bcc9fa54a4d1fe8189c47e0d32952775cd34798c8a5a0aa25a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-devspaces \
python39-azure-mgmt-devspaces \
python3dist-azure-mgmt-devspaces"

RDEPENDS:${PN} += "-python39-typing-extensions >= 4.3.0 if python39-base < 3.8 \
python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
