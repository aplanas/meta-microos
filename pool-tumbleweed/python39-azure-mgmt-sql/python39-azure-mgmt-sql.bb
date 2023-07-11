SUMMARY = "Microsoft Azure SQL Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0b10"

RPM_NAME = "python39-azure-mgmt-sql-4.0.0b10-1.2.noarch.rpm"
RPM_HASH = "07dc949727af7eb33c636432dfcce8f91f189f0e42b4a5f0205cb0c0169a9b1a497b63a18538f6fb5df65b97eec23a9b7fb58a07c83313757088003f8864debb"
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
