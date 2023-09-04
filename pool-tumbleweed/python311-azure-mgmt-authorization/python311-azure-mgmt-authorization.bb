SUMMARY = "Microsoft Azure Authorization Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Authorization Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-azure-mgmt-authorization-4.0.0-1.1.noarch.rpm"
RPM_HASH = "d83871668438f67b9aa8251856e2e3b0198e35cef33ffe62accf2fd9c6056eae7e89647b859abbc93f4201d5d57a3a1011d8d169ea8ab6f3d0c8a814639b8db3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-authorization \
python3.11dist-azure-mgmt-authorization \
python311-azure-mgmt-authorization \
python3dist-azure-mgmt-authorization"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-nspkg \
python311-isodate"

inherit rpm
