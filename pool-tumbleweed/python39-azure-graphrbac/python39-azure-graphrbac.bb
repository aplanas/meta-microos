SUMMARY = "Microsoft Azure Graph RBAC Client Library"
DESCRIPTION = "This is the Microsoft Azure Graph RBAC Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.61.1"

RPM_NAME = "python39-azure-graphrbac-0.61.1-2.12.noarch.rpm"
RPM_HASH = "3883243caac55c84e013ea2333dc6207bf9ffe86ca89a391bd8e8d2dcd386b610ab8ede1d509e8adc9943be96e7a82ab89cd99bb3742809da2e8dbc6464156cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-graphrbac \
python39-azure-graphrbac \
python3dist-azure-graphrbac"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-nspkg \
python39-msrest \
python39-msrestazure"

inherit rpm
