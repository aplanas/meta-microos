SUMMARY = "Microsoft Azure Auto Manage Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Auto Manage Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-automanage-1.0.0.0-1.5.noarch.rpm"
RPM_HASH = "163a93157bc2e9bc57eefe296068390d7b2ad1cf86c06e5d3f2bcd99e5d01f1088425a45d46e88e162097f6adc1152c3c2b57e57a61977a073ef01283c04c9d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-automanage \
python310-azure-mgmt-automanage \
python3dist-azure-mgmt-automanage"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
