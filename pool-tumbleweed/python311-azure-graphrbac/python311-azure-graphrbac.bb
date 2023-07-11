SUMMARY = "Microsoft Azure Graph RBAC Client Library"
DESCRIPTION = "This is the Microsoft Azure Graph RBAC Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.61.1"

RPM_NAME = "python311-azure-graphrbac-0.61.1-2.12.noarch.rpm"
RPM_HASH = "df67e3b4d17e326af129b3722794608db5baf90deeb1b5297e52ff16e0fcd543e8fd1a1b7c4cb109a5ee5441bf7daf3c835dcd82951c72f4f12624a27d23daa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-graphrbac \
python3.11dist-azure-graphrbac \
python311-azure-graphrbac \
python3dist-azure-graphrbac"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-nspkg \
python311-msrest \
python311-msrestazure"

inherit rpm
