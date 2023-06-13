SUMMARY = "Microsoft Azure CDN Management Client Library"
DESCRIPTION = "This is the Microsoft Azure CDN Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "12.0.0"

RPM_NAME = "python310-azure-mgmt-cdn-12.0.0-1.6.noarch.rpm"
RPM_HASH = "a1657e5b3a07ca45e416c8cbaef24bad9664ff774844c84ac6d656503cfccbf23bea36c63ff53f6063bd549861d350ba564348335f75b5b46564ca90dd1ca2b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-cdn \
python3.10dist(azure-mgmt-cdn) \
python310-azure-mgmt-cdn \
python3dist(azure-mgmt-cdn)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
