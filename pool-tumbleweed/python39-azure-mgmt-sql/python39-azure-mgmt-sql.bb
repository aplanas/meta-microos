SUMMARY = "Microsoft Azure SQL Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0b12"

RPM_NAME = "python39-azure-mgmt-sql-4.0.0b12-1.1.noarch.rpm"
RPM_HASH = "1edc10506dffdf01f01821c197d1c61ffbbc752e0e2c06070f4b294f046d7cc6218f62908b99a22d1379dd665842b27c6cb92cf04447b38c39979b468f08b2cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-sql \
python39-azure-mgmt-sql \
python3dist-azure-mgmt-sql"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
