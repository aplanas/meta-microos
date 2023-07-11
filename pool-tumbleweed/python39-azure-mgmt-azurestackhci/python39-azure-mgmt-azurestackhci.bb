SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python39-azure-mgmt-azurestackhci-7.0.0-1.6.noarch.rpm"
RPM_HASH = "1fa237b0993eabf141b85e240c1b2c95ab17f06ab18bc4ebd1f450d986999dc3f85c3082f4e2183230d6e104e3e4bf7b1b2001e022082d5ac8ff004523ee3676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-azurestackhci \
python39-azure-mgmt-azurestackhci \
python3dist-azure-mgmt-azurestackhci"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
