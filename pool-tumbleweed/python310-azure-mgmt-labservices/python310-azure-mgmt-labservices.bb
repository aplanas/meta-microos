SUMMARY = "Microsoft Azure Lab Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Lab Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-labservices-2.0.0-1.3.noarch.rpm"
RPM_HASH = "d4192666a1acf8a8689b450f34ff7b8d4d06b2b78a4f1135054701700b61cff6b68ee5ce0a435614c8dfd249cd82dc892f509b705fe2ef628e152d4a4d5ab5c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-labservices \
python3.10dist(azure-mgmt-labservices) \
python310-azure-mgmt-labservices \
python3dist(azure-mgmt-labservices)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
