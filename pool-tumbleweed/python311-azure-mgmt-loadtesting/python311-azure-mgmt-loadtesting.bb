SUMMARY = "Microsoft Azure Loadtesting Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Loadtesting Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-loadtesting-1.0.0-1.4.noarch.rpm"
RPM_HASH = "6f74a5c57ec0cc8f17b74330763ffb6a0b6f7c411aad8c2056a0bb82ab92349e15415d2730eb1ec6fc8e0ba9820905b47f7bbd61f872de80f2254de375cf5f66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-loadtesting \
python3.11dist-azure-mgmt-loadtesting \
python311-azure-mgmt-loadtesting \
python3dist-azure-mgmt-loadtesting"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
