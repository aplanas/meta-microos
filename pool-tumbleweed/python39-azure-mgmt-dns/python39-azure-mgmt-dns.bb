SUMMARY = "Microsoft Azure DNS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0.0"

RPM_NAME = "python39-azure-mgmt-dns-8.0.0.0-1.3.noarch.rpm"
RPM_HASH = "b97edb09ecfb02805cf40423e6220e05d0a5d158a74d1367d87f352354d6ed3d19417f7d18f6155f2716e35d42d07f4734e96729124120f27532a708c84d8d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-dns) \
python39-azure-mgmt-dns \
python3dist(azure-mgmt-dns)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
