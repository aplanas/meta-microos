SUMMARY = "Microsoft Azure Elasticsan Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elasticsan Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python310-azure-mgmt-elasticsan-1.0.0b1-1.3.noarch.rpm"
RPM_HASH = "eec06745773924f2d02f5f0601f2211f16419386d1b2cea4177daf1bc1c54fcce2394f75c0bc7fe3349d8ee932c9aeace24c755a8f9facacbb08d3d9e5d4d344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-elasticsan \
python3.10dist(azure-mgmt-elasticsan) \
python310-azure-mgmt-elasticsan \
python3dist(azure-mgmt-elasticsan)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm