SUMMARY = "Microsoft Azure SQL Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0b10"

RPM_NAME = "python310-azure-mgmt-sql-4.0.0b10-1.1.noarch.rpm"
RPM_HASH = "c5417b176e8fd2f1c6e462a716c88bd22dffe19fd9aa76e8553fd0c45aa202c5207631e0137b960b3e2f0db5a62c242705c5efb71acf602b0305f49dc58190fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-sql \
python3.10dist(azure-mgmt-sql) \
python310-azure-mgmt-sql \
python3dist(azure-mgmt-sql)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
