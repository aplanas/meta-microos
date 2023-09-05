SUMMARY = "Microsoft Azure SQL Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0b11"

RPM_NAME = "python39-azure-mgmt-sql-4.0.0b11-1.1.noarch.rpm"
RPM_HASH = "06903003c8c16bc12a4c69f4d3feb16e3645f158122e1575e131393849f1324a80c6df7f5472f4a343428a80ab70ca5a1699581948a12aab8ef71c39e7b5d6cb"
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
