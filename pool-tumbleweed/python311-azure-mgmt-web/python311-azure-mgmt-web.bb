SUMMARY = "Microsoft Azure Web Apps Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Web Apps Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python311-azure-mgmt-web-7.1.0-1.2.noarch.rpm"
RPM_HASH = "ec02ab1e2001053ea3ce96691e03db866a01219c3dc593d444f4a25b8051ed87a5501ed07056fc60c61e34528ec462e8e311e43c03ab16a23a24fae98fafe313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-web \
python3.11dist-azure-mgmt-web \
python311-azure-mgmt-web \
python3dist-azure-mgmt-web"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
