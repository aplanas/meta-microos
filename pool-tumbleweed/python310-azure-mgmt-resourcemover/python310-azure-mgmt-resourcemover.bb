SUMMARY = "Microsoft Azure Resource Mover Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Mover Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0b3"

RPM_NAME = "python310-azure-mgmt-resourcemover-1.1.0b3-1.3.noarch.rpm"
RPM_HASH = "6bdd4cf7d0c75f18c4c04e25da9717f2b73fce11c438412a508b6dfb07e4642ab6b0ea88dd8b158e90adf014a8649ce37f71b7d2dc3d8acaf70701ca619956e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resourcemover \
python3.10dist-azure-mgmt-resourcemover \
python310-azure-mgmt-resourcemover \
python3dist-azure-mgmt-resourcemover"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
