SUMMARY = "Microsoft Azure Mobilenetwork Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Mobilenetwork Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-azure-mgmt-mobilenetwork-3.0.0-1.1.noarch.rpm"
RPM_HASH = "16c5df6e5affe3339c6123279ab2eb0ed3bfd116f4509873bd6b62c666c5a2d8216db28254290f23c877eb6f9515f02ae6058925c329daa88af4c1a9f9a313ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-mobilenetwork \
python39-azure-mgmt-mobilenetwork \
python3dist-azure-mgmt-mobilenetwork"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
