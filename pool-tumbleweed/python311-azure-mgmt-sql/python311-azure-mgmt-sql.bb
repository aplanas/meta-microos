SUMMARY = "Microsoft Azure SQL Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0b11"

RPM_NAME = "python311-azure-mgmt-sql-4.0.0b11-1.1.noarch.rpm"
RPM_HASH = "26bff503e2264b1e3f8df001092da9cbab29ed839367126d80722095a2d0d4c0d00e0a2be67c7b6eaed2a5bd79a5163a4c8bbe3141497e84a3d694dc1741eb17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-sql \
python3.11dist-azure-mgmt-sql \
python311-azure-mgmt-sql \
python3dist-azure-mgmt-sql"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
