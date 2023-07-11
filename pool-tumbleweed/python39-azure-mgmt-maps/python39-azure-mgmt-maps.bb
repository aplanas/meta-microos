SUMMARY = "Microsoft Azure Maps Client Library"
DESCRIPTION = "This is the Microsoft Azure Maps Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-maps-2.0.0-1.9.noarch.rpm"
RPM_HASH = "5c931cf734c853f3b9a02467b9c3cb4d4f86191755d986a4c2b93d1406db0636a252647ba8c5a7e4497e2d3d3e02a40ac8ccfd1addf0830dc7642d37585a671b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-maps \
python39-azure-mgmt-maps \
python3dist-azure-mgmt-maps"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
