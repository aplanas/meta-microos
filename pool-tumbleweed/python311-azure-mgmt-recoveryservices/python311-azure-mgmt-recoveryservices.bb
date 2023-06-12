SUMMARY = "Microsoft Azure Recovery Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python311-azure-mgmt-recoveryservices-2.4.0-1.1.noarch.rpm"
RPM_HASH = "c17226cc60187efce376d7268d395a9e07c2dba688f775d57b8577a6f9a925e0d857b4e10577fcaf32b45e33d185b381ce8aff6b58a7421092b3f26a0c2fce38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-recoveryservices) \
python311-azure-mgmt-recoveryservices \
python3dist(azure-mgmt-recoveryservices)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
