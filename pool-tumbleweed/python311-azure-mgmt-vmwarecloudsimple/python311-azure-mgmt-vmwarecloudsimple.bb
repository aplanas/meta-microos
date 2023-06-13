SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-azure-mgmt-vmwarecloudsimple-0.2.0-2.11.noarch.rpm"
RPM_HASH = "39db01ff3457747d1691d8d9d7b6017b8e8d7e5498c5ba66a7b1f7bb1f0929a0a9c85a34bf7e3caf90f31f13d112c9bcde486aadf092e06a82ccfbec94c81204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-vmwarecloudsimple) \
python311-azure-mgmt-vmwarecloudsimple \
python3dist(azure-mgmt-vmwarecloudsimple)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest \
python311-msrestazure"

inherit rpm
