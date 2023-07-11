SUMMARY = "Microsoft Azure Hybridnetwork Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Hybridnetwork Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-hybridnetwork-1.0.0-1.9.noarch.rpm"
RPM_HASH = "c7bc4c9eec21f50d9afc1a5dd966d8b745e919cdd5b4c89d28ed9fd3d0c956db9ee3e3f1ca44b2a74cb78d012bdb25145bee2ca2e86d8c6e4bd961345275a7d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hybridnetwork \
python3.11dist-azure-mgmt-hybridnetwork \
python311-azure-mgmt-hybridnetwork \
python3dist-azure-mgmt-hybridnetwork"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
