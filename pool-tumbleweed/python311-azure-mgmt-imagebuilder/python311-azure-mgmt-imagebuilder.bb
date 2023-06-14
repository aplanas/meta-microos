SUMMARY = "Microsoft Azure Image Builder Client Library"
DESCRIPTION = "This is the Microsoft Azure Image Builder Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-azure-mgmt-imagebuilder-1.2.0-1.1.noarch.rpm"
RPM_HASH = "7fa725b119386eca58f7fba840ad9a7f86c764a8f6e2276873a9359378f604c8114f1130a8f3621ab881055a9d4a4530ed7c7c931a31c09bbc5a37e92a5b3339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-imagebuilder \
python311-azure-mgmt-imagebuilder \
python3dist-azure-mgmt-imagebuilder"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
