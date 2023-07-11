SUMMARY = "Microsoft Azure Orbital Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Orbital Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-orbital-2.0.0-1.3.noarch.rpm"
RPM_HASH = "131b0f77ade02f9be97cfa04927a1557ac63a98fe19ceb7851efc28c97bab7bdb97a3c7a14be7c42785941b1f0fba79090ee2fe27d240ee7dc492e0a96d91a3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-orbital \
python3.11dist-azure-mgmt-orbital \
python311-azure-mgmt-orbital \
python3dist-azure-mgmt-orbital"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
