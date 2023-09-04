SUMMARY = "Microsoft Azure Sphere Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Sphere Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-mgmt-sphere-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "c0eefae5d12dd7190dd61220a054d9c28effe28255eb4f95c7a8111f40dc395959370a609caf4cf951e1e45df00baa06e9908347781252c7f007fd623457590d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-sphere \
python39-azure-mgmt-sphere \
python3dist-azure-mgmt-sphere"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
