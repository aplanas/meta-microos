SUMMARY = "MS Azure Communication Network Traversal Service Client Library for Python"
DESCRIPTION = "Azure Communication Network Traversal is managing TURN credentials for Azure Communication Services. \
 \
It will provide TURN credentials to a user."
LICENSE = "MIT"

PV = "1.1.0~b1"

RPM_NAME = "python311-azure-communication-networktraversal-1.1.0~b1-1.4.noarch.rpm"
RPM_HASH = "3ff3781b421a4a1ee736931e64bd61a03697934c1604de5cc1e809d6dc440efa04839b07052c17cf19ebe11e13ba56c265a9c00bbb248d86edfc9c3b59cc03ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-networktraversal \
python3.11dist-azure-communication-networktraversal \
python311-azure-communication-networktraversal \
python3dist-azure-communication-networktraversal"

RDEPENDS:${PN} += "python-abi \
python311-azure-communication-nspkg \
python311-azure-core \
python311-azure-nspkg \
python311-msrest"

inherit rpm
