SUMMARY = "Microsoft Azure Chaos Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Chaos Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b7"

RPM_NAME = "python310-azure-mgmt-chaos-1.0.0b7-1.1.noarch.rpm"
RPM_HASH = "53fe11c90a9fdfcee95b5076ecb0d0dcb8fa980d982191427ea803cea7b9d744c3d7974b96c91265d149ff7572cc30ed36cbc8f79d53fa67fc4c7db0c5b32ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-chaos \
python310-azure-mgmt-chaos \
python3dist-azure-mgmt-chaos"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
