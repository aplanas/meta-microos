SUMMARY = "Microsoft Azure Recovery Services Backup Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Backup Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python311-azure-mgmt-recoveryservicesbackup-6.0.0-1.1.noarch.rpm"
RPM_HASH = "8a7fe75e0c2f5c2da171f227a53230e96a1088488fe98521e126f318cf4ebbdde1f53eff655d71eef3a62a3ba1268626371a06393a7831f59ce96b980ead8743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-recoveryservicesbackup \
python311-azure-mgmt-recoveryservicesbackup \
python3dist-azure-mgmt-recoveryservicesbackup"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
