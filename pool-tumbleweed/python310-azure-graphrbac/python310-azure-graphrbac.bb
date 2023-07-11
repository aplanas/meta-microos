SUMMARY = "Microsoft Azure Graph RBAC Client Library"
DESCRIPTION = "This is the Microsoft Azure Graph RBAC Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.61.1"

RPM_NAME = "python310-azure-graphrbac-0.61.1-2.12.noarch.rpm"
RPM_HASH = "e55c8a63f53be81e21df60144e16bb60bc8174784296c30f2e67b5a5acbe2f220ffb7cd73a8382381eb063c3812ed9a45e4fd7d9db147c1acb4de103973a289d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-graphrbac \
python310-azure-graphrbac \
python3dist-azure-graphrbac"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-nspkg \
python310-msrest \
python310-msrestazure"

inherit rpm
