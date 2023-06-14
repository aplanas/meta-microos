SUMMARY = "Microsoft Azure EventGrid Management Client Library"
DESCRIPTION = "This is the Microsoft Azure EventGrid Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0"

RPM_NAME = "python310-azure-mgmt-eventgrid-10.2.0-1.4.noarch.rpm"
RPM_HASH = "6c6ea1b52aa19d5d8e194f8de1b43f6180881f0d037eedbd484bf2555259100b2eed5e108fc954e109d3037446a9643fb5f7e13f5b6ce92bf8f56ca4511e1751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-eventgrid \
python3.10dist-azure-mgmt-eventgrid \
python310-azure-mgmt-eventgrid \
python3dist-azure-mgmt-eventgrid"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
