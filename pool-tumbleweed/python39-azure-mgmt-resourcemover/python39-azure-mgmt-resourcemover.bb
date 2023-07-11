SUMMARY = "Microsoft Azure Resource Mover Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Mover Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0b3"

RPM_NAME = "python39-azure-mgmt-resourcemover-1.1.0b3-1.4.noarch.rpm"
RPM_HASH = "f100f23b3b9c639e73d95a52c3d3f9ba688938dc09535f51a8929fbf7ff0bd3384d8658502df211d34bf4b331155bfbf41dfcb1bcfdafa6a49027355a84085d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-resourcemover \
python39-azure-mgmt-resourcemover \
python3dist-azure-mgmt-resourcemover"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
