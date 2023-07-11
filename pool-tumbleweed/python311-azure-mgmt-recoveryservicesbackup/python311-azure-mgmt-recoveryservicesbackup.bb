SUMMARY = "Microsoft Azure Recovery Services Backup Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Backup Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python311-azure-mgmt-recoveryservicesbackup-6.0.0-1.2.noarch.rpm"
RPM_HASH = "cbb22d5c50a72dc437a4d625d73af7d94ef5e092032ae4a74d43d1bd705ba478bb423840996335a142ceef8a2384ba400150d095b0d430d9983f29fbdca29cae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-recoveryservicesbackup \
python3.11dist-azure-mgmt-recoveryservicesbackup \
python311-azure-mgmt-recoveryservicesbackup \
python3dist-azure-mgmt-recoveryservicesbackup"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
