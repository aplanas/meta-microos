SUMMARY = "Microsoft Azure Servicelinker Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicelinker Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.2.0~b1"

RPM_NAME = "python311-azure-mgmt-servicelinker-1.2.0~b1-1.4.noarch.rpm"
RPM_HASH = "6206854dce98dfcce1e5432574e8bf11e1b73f2c1c9140ba7df09e34d594f446f9cb7da4b4d6202b420033ff68fe7313a98be82c43c66949ef440c504f78348d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicelinker \
python3.11dist-azure-mgmt-servicelinker \
python311-azure-mgmt-servicelinker \
python3dist-azure-mgmt-servicelinker"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
