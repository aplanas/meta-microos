SUMMARY = "Microsoft Azure EventGrid Management Client Library"
DESCRIPTION = "This is the Microsoft Azure EventGrid Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0"

RPM_NAME = "python311-azure-mgmt-eventgrid-10.2.0-1.4.noarch.rpm"
RPM_HASH = "fcd9a3f69ef76167cd6bd023fb402d9c257e5fe1aedd72968888a05acc3b5eddd2ea88bf890041f81d8fd187aa5a3badb2206128f344112ad3c327f07fe75eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-eventgrid) \
python311-azure-mgmt-eventgrid \
python3dist(azure-mgmt-eventgrid)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
