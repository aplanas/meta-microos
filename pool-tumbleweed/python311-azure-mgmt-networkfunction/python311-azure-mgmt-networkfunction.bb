SUMMARY = "Microsoft Azure Networkfunction Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Networkfunction Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-mgmt-networkfunction-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "f35c1eda9a494ffe09883adb80c856015658b9c53cf7fae7407345c0db6fa00828f5d8b4810f9aba437718d4b1ba995d315e50bf545c10292de351aa0aad3f0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-networkfunction \
python3.11dist-azure-mgmt-networkfunction \
python311-azure-mgmt-networkfunction \
python3dist-azure-mgmt-networkfunction"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
