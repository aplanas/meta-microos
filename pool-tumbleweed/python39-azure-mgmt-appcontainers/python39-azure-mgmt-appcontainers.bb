SUMMARY = "Microsoft Azure Appcontainers Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Appcontainers Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-azure-mgmt-appcontainers-3.0.0-1.1.noarch.rpm"
RPM_HASH = "ac709514d749071f108b4ee283b37be9516613d4e43d9597269651633b30b0e7d8c3e78c8e01beec705184fefc64bc0378e47cabb0c37295b169d0065e1a8b68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-appcontainers \
python39-azure-mgmt-appcontainers \
python3dist-azure-mgmt-appcontainers"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
