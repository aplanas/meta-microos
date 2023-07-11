SUMMARY = "Microsoft Azure API Management Client Library"
DESCRIPTION = "This is the Microsoft Azure API Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-azure-mgmt-apimanagement-4.0.0-1.2.noarch.rpm"
RPM_HASH = "14287731900c5a6a7fa7954a39796e757e61bde9d869a2a303a1de193b6c3756da14498c3cae7dd4ec7dd73717862f338594a975a70d15c93ef84dc59d69047e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-apimanagement \
python39-azure-mgmt-apimanagement \
python3dist-azure-mgmt-apimanagement"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
