SUMMARY = "Microsoft Azure Portal Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Portal Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-portal-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "d59bc2f2084e29d542d6956432bfc34edf96794faa366e8da70276e98a3a750721281289dab5cba4049e77ba6dc9ffde401531d716777c56d34fbeb7e002df9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-portal) \
python311-azure-mgmt-portal \
python3dist(azure-mgmt-portal)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
