SUMMARY = "Microsoft Azure Recovery Services Backup Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Backup Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python39-azure-mgmt-recoveryservicesbackup-6.0.0-1.2.noarch.rpm"
RPM_HASH = "ed36f96ca575076fdad23ac5c2ef973fb7e2396aceba14a51288ea66f8879035114e9c85a930dbfca7f20b8ad3cdc3aaeff5db0ba25289d3ba88acfda9f37ff3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-recoveryservicesbackup \
python39-azure-mgmt-recoveryservicesbackup \
python3dist-azure-mgmt-recoveryservicesbackup"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
