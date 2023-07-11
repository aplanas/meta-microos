SUMMARY = "Microsoft Azure Video Analyzer Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Video Analyzer Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python311-azure-mgmt-videoanalyzer-1.0.0b4-1.6.noarch.rpm"
RPM_HASH = "32bcdaf6af4c34d49a1c8f347af6b9001662ce674a2cbfeabade9464671207a2d3ed28c2d57d9528e1f81f361c1cda4ce55797e5e64c29315cc55946b6546432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-videoanalyzer \
python3.11dist-azure-mgmt-videoanalyzer \
python311-azure-mgmt-videoanalyzer \
python3dist-azure-mgmt-videoanalyzer"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
