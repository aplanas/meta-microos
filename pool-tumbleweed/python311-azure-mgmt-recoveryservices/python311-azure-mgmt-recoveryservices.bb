SUMMARY = "Microsoft Azure Recovery Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python311-azure-mgmt-recoveryservices-2.5.0-1.1.noarch.rpm"
RPM_HASH = "b14b8842d5b94cf15021496d2b0d8dacb0d228e45ebd06fe2babcfb6c8912cc5ac2b2235243d1352539f57da4e727509ec8ecbd765920fd5093889a5f8b3ca72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-recoveryservices \
python3.11dist-azure-mgmt-recoveryservices \
python311-azure-mgmt-recoveryservices \
python3dist-azure-mgmt-recoveryservices"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
