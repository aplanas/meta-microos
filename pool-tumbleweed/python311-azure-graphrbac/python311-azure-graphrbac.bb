SUMMARY = "Microsoft Azure Graph RBAC Client Library"
DESCRIPTION = "This is the Microsoft Azure Graph RBAC Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.61.1"

RPM_NAME = "python311-azure-graphrbac-0.61.1-2.11.noarch.rpm"
RPM_HASH = "4b7b4230033a58d7532ebb521fee7d724e8e31af1ed63a949ada5fe1162cdd1108feb17742108ce812b9691cf02174a8c9d1904f8f5c53cc2ccdbd8c795c1d28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-graphrbac \
python311-azure-graphrbac \
python3dist-azure-graphrbac"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-nspkg \
python311-msrest \
python311-msrestazure"

inherit rpm
