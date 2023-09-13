SUMMARY = "Microsoft Azure Recovery Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python310-azure-mgmt-recoveryservices-2.5.0-1.1.noarch.rpm"
RPM_HASH = "621b3ec895a745d0d303e1f624e604c203a12278f243b26c72f6bab1cc2c881d59b2259b0a1f37f139b720caf8f8089d8d123ff6a3faf8ce5a5c723d5657101b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-recoveryservices \
python310-azure-mgmt-recoveryservices \
python3dist-azure-mgmt-recoveryservices"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
