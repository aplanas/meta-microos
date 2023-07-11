SUMMARY = "Microsoft Azure Lab Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Lab Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-labservices-2.0.0-1.4.noarch.rpm"
RPM_HASH = "06447d04402ee32b05f9fdb082a35cebadafbbc483a39eaa8a91284f527490b47bb8afc671bedf102848bee8f5b36b3087c94016957201bc469c1b4e209b935d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-labservices \
python310-azure-mgmt-labservices \
python3dist-azure-mgmt-labservices"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
