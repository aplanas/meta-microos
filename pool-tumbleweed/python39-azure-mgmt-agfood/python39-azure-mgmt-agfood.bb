SUMMARY = "Microsoft Azure Agfood Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agfood Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python39-azure-mgmt-agfood-1.0.0b2-1.2.noarch.rpm"
RPM_HASH = "a1c07c9af8617d2e97e1b958f5e0f43c436cec75955b4807dffe08dccfd78490e3e7116fae411491db3a1c496d2d11f31fb86c71233ae058635cdec4bb918db1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-agfood \
python39-azure-mgmt-agfood \
python3dist-azure-mgmt-agfood"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
