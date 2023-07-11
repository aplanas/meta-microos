SUMMARY = "Microsoft Azure Azureadb2c Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azureadb2c Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python39-azure-mgmt-azureadb2c-1.0.0b2-1.2.noarch.rpm"
RPM_HASH = "c37a46073796093ba5f071191a578989f3c7cda67bf6dce80d81516570fb520a95145868e22f152d94cb3d3fc92e2efc1ae95850f405f249ab0ebbcfce991218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-azureadb2c \
python39-azure-mgmt-azureadb2c \
python3dist-azure-mgmt-azureadb2c"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
