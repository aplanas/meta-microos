SUMMARY = "Microsoft Azure Agrifood Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agrifood Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python310-azure-mgmt-agrifood-1.0.0b3-1.4.noarch.rpm"
RPM_HASH = "022c21aef3f84ada5ed84b14e9b46892aed6e585e09ed740a706a7b1a86e030fd14d86a3ff01c143b5d6c9aed484b06d1f8cd95fb94d9b865916742e23f7b512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-agrifood \
python310-azure-mgmt-agrifood \
python3dist-azure-mgmt-agrifood"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
