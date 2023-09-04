SUMMARY = "Microsoft Azure Sphere Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Sphere Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-mgmt-sphere-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "212382c10b5be46b2eb2a014825efded8ae53b28b279af401dc051aa1f8788b4300301d1b7d339be2da90d1213b40ed1a8f1bd74c75aa18ad9d3f1459907c846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-sphere \
python310-azure-mgmt-sphere \
python3dist-azure-mgmt-sphere"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
