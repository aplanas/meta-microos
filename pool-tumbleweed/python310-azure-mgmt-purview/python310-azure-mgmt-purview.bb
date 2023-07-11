SUMMARY = "Microsoft Azure Purview Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Purview Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-purview-1.0.0-1.9.noarch.rpm"
RPM_HASH = "8617f37068cf3d4505cd14f016932b67c9e9767897afac9cfbed72f8bfb06f67fad178447cc4e03ec5bc492a0807b97cb968c0c02695fdb6d7f0762e09791a86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-purview \
python310-azure-mgmt-purview \
python3dist-azure-mgmt-purview"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
