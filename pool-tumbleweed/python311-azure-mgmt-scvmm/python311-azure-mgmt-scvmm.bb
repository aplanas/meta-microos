SUMMARY = "Microsoft Azure Scvmm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Scvmm Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-mgmt-scvmm-1.0.0b2-1.4.noarch.rpm"
RPM_HASH = "373869129131a12f3840eb8e210a554857d1b337696d4d38b5361e07a95dface84e9c8cc24927026cf33c6b3a0a6c7c53ba192caf49bf312e5dec46f1d0b82a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-scvmm \
python3.11dist-azure-mgmt-scvmm \
python311-azure-mgmt-scvmm \
python3dist-azure-mgmt-scvmm"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
