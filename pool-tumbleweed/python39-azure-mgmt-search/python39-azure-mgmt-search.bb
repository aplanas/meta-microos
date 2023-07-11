SUMMARY = "Microsoft Azure Search Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Search Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python39-azure-mgmt-search-9.0.0-1.4.noarch.rpm"
RPM_HASH = "21db4358b7610a78d72d45f9b38de98abb1b6bbc89da69f0decb5b15d562a2f933337844b36328ece26196c23f9fd7a663087b748528c2b2e731489769408d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-search \
python39-azure-mgmt-search \
python3dist-azure-mgmt-search"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
