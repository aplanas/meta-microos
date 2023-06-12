SUMMARY = "Microsoft Azure Maps Client Library"
DESCRIPTION = "This is the Microsoft Azure Maps Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-maps-2.0.0-1.8.noarch.rpm"
RPM_HASH = "0312bf43a3cb401c578366b7638c649076bec7cbc53b6db5943a000a658a909564bbe26bc47552fcfa3847ce95be1de12045bdd9ef6d638419a103f2a57ef0d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-maps) \
python311-azure-mgmt-maps \
python3dist(azure-mgmt-maps)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
