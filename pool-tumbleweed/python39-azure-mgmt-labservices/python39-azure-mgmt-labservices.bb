SUMMARY = "Microsoft Azure Lab Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Lab Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-labservices-2.0.0-1.4.noarch.rpm"
RPM_HASH = "48187ead596146c12d549bf5cab043af668ac01aeca54cd5712007509c398180511ba9c4a06b9c3785539ec9939274bf6795abb50a255de5eaa4eae1ab278a09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-labservices \
python39-azure-mgmt-labservices \
python3dist-azure-mgmt-labservices"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
