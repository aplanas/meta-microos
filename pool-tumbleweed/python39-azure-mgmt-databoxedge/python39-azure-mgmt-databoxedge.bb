SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-databoxedge-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "05a58f97d221b53eeeaa1023ff080b58e523ac825def3981fc6b1291ff8e9691317ba73cf3f68c367996972ee1206f4df20a98dc341684e839d879dda7ff2984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-databoxedge) \
python39-azure-mgmt-databoxedge \
python3dist(azure-mgmt-databoxedge)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
