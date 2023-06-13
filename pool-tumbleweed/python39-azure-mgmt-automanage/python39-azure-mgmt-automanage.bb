SUMMARY = "Microsoft Azure Auto Manage Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Auto Manage Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-automanage-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "b1d9823db03d0a7e75a666097298d11a05370d29a004a6ea089aed20d65bd0a3e6db715f630718e9ccb0cfd29bc717ea3b5042f3e437e9da6dc730cac27ff94a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-automanage) \
python39-azure-mgmt-automanage \
python3dist(azure-mgmt-automanage)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
