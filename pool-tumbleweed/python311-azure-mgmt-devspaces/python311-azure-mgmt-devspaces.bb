SUMMARY = "Microsoft Azure Dev Spaces Client Library"
DESCRIPTION = "This is the Microsoft Azure Dev Spaces Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-mgmt-devspaces-1.0.0b2-1.4.noarch.rpm"
RPM_HASH = "e4723c260d06be8363360d5dbda125c8d8909509773f17eef487e508a3316f2a552228552c635865784f899836db4e8feadcee01b7eb7d128bb4b86e2a2f9e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-devspaces \
python3.11dist-azure-mgmt-devspaces \
python311-azure-mgmt-devspaces \
python3dist-azure-mgmt-devspaces"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
