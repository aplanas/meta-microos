SUMMARY = "Microsoft Azure MSI Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MSI Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python39-azure-mgmt-msi-7.0.0-1.3.noarch.rpm"
RPM_HASH = "0ee57eec30a4a438f9633f905c990aa7012a44f24b12e1075181124865524179e7515b67d911e4747b8b748da3cd87eb71bb5369fd54ffcfaf658aef9599e6b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-msi \
python39-azure-mgmt-msi \
python3dist-azure-mgmt-msi"

RDEPENDS:${PN} += "-python39-typing-extensions >= 4.3.0 if python39-base < 3.8 \
python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
