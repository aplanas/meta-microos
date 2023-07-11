SUMMARY = "Microsoft Azure Agfood Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agfood Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python310-azure-mgmt-agfood-1.0.0b2-1.2.noarch.rpm"
RPM_HASH = "aee1ef2e206b75005c3947e53159b734d140c423ed7999ac3f75b5bd3d9734c35cccebb6b16e858cbcd1f30484446b67ca61e8b0c148a111f83581c2ea9b93c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-agfood \
python310-azure-mgmt-agfood \
python3dist-azure-mgmt-agfood"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
