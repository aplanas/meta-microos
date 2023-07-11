SUMMARY = "Microsoft Azure Portal Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Portal Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-portal-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "812d710619645a141105ecfe7e3c41b4f19ea95b7c56c2027e65e25736498ab62a5e143b6b7f10fbcc273b3619ef90f90fbdacd5af37dea8099fba53ebb2d735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-portal \
python39-azure-mgmt-portal \
python3dist-azure-mgmt-portal"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
