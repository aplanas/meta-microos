SUMMARY = "Microsoft Azure Subscription Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Subscription Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python311-azure-mgmt-subscription-3.1.1-1.3.noarch.rpm"
RPM_HASH = "a860a5dfe760034f00077f528767bba649c52f9249bfaa29988e29945931fee69ce63aded11003a17f9245377cb9acde76022fa5c6375ae618c018978317637b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-subscription \
python311-azure-mgmt-subscription \
python3dist-azure-mgmt-subscription"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
