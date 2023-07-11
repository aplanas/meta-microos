SUMMARY = "Microsoft Azure Mixed Reality Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Mixed Reality Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python311-azure-mgmt-mixedreality-1.0.0b1-2.9.noarch.rpm"
RPM_HASH = "160a5d3d1c98f236d122032a56b2a9d53b3c6f4bce2ff43f8dd26d64c332ab0c10b5128e0b1f20f461d200c49d1907c9d82c120950de4a71f6e1e27ddc4355f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-mixedreality \
python3.11dist-azure-mgmt-mixedreality \
python311-azure-mgmt-mixedreality \
python3dist-azure-mgmt-mixedreality"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
