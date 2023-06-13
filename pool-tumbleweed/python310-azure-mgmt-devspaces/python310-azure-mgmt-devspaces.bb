SUMMARY = "Microsoft Azure Dev Spaces Client Library"
DESCRIPTION = "This is the Microsoft Azure Dev Spaces Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python310-azure-mgmt-devspaces-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "e099623fe5f8704b0aa3754112d1d3f1bac15e27c1c74a818fee2a70edbdba4664b53e676d8a7147ebef4f0aab4e2e738b2a72d1cedc1223510f41d213867546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-devspaces \
python3.10dist(azure-mgmt-devspaces) \
python310-azure-mgmt-devspaces \
python3dist(azure-mgmt-devspaces)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
