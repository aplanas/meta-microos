SUMMARY = "Microsoft Azure SQL Virtual Machine Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Virtual Machine Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b5"

RPM_NAME = "python39-azure-mgmt-sqlvirtualmachine-1.0.0b5-1.3.noarch.rpm"
RPM_HASH = "5665d3c10291a04e8fc0985ddaf4c2b5f8e7452b7b6422b3607a1cf7cb9b522d113b736d0d28a2389978fcc1fd270003a7013c3191e4dbc88e8354c8c6a82afe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-sqlvirtualmachine) \
python39-azure-mgmt-sqlvirtualmachine \
python3dist(azure-mgmt-sqlvirtualmachine)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
