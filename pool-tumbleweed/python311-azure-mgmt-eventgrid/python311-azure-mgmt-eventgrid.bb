SUMMARY = "Microsoft Azure EventGrid Management Client Library"
DESCRIPTION = "This is the Microsoft Azure EventGrid Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0"

RPM_NAME = "python311-azure-mgmt-eventgrid-10.2.0-1.5.noarch.rpm"
RPM_HASH = "f274bdfe2a1a6db6f40cc788f53ae618dc7345bfef5da798e20b2276d97f6fc1ea759f2f28ad2717116c636c717451fafa7ba6d1ce13a528802431a70aa9c375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-eventgrid \
python3.11dist-azure-mgmt-eventgrid \
python311-azure-mgmt-eventgrid \
python3dist-azure-mgmt-eventgrid"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
