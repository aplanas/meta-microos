SUMMARY = "Microsoft Azure Authorization Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Authorization Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-azure-mgmt-authorization-4.0.0-1.1.noarch.rpm"
RPM_HASH = "deb52d435883e8475989280e07262871abc2f46bd1cbf08e3bac5d0ba98aa5ecd680292b550948117e0f8ab1a349a2d3cd91d4dab8bbc1b7f7aa5e4f1e14a868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-authorization \
python39-azure-mgmt-authorization \
python3dist-azure-mgmt-authorization"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-nspkg \
python39-isodate"

inherit rpm
