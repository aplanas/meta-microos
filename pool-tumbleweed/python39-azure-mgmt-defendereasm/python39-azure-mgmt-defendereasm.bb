SUMMARY = "Microsoft Azure Defendereasm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Defendereasm Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-mgmt-defendereasm-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "0572def376f6434b4ec4cc9839a3a3c27661bd069fd5935c3d6d4cfd429a27d67648de3275ea6172c62548ead3a5cb6149e4f4c1fe05541769df23657816f07b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-defendereasm \
python39-azure-mgmt-defendereasm \
python3dist-azure-mgmt-defendereasm"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
