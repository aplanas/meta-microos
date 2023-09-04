SUMMARY = "Microsoft Azure Networkcloud Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Networkcloud Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-networkcloud-1.0.0-1.1.noarch.rpm"
RPM_HASH = "8669501f96051c3a7b8324b1b7bdb946c0dc1bf200c8e7fa6bddb161a9c2b96da2bdd70ff5e4fa7c48f658b5ccab232b11ee0296206015efea752d05851c0f10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-networkcloud \
python39-azure-mgmt-networkcloud \
python3dist-azure-mgmt-networkcloud"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
