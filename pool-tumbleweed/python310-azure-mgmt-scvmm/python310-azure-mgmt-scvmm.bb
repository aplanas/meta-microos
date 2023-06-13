SUMMARY = "Microsoft Azure Scvmm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Scvmm Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python310-azure-mgmt-scvmm-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "382d354b3af814cb5ddcc294f719c491e6493e1561669fc8a0de0dc566774eacabb7185d62a17645101d749cdaf30779531e7152a5b7e6d34bf1512f6ea99c41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-scvmm \
python3.10dist(azure-mgmt-scvmm) \
python310-azure-mgmt-scvmm \
python3dist(azure-mgmt-scvmm)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
