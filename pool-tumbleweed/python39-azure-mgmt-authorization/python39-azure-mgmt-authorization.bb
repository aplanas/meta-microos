SUMMARY = "Microsoft Azure Authorization Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Authorization Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-azure-mgmt-authorization-3.0.0-1.3.noarch.rpm"
RPM_HASH = "e770ae77c07c028978dfc51e6a1c9e8fddc5bd6d033f01d80b59da927b39b9b3085fa7e5568010ed86976f9a8293b77521d36395cd5c9e086bd12a2b06efe557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-authorization) \
python39-azure-mgmt-authorization \
python3dist(azure-mgmt-authorization)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-nspkg \
python39-msrest"

inherit rpm
