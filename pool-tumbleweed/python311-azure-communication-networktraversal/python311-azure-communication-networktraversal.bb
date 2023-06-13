SUMMARY = "MS Azure Communication Network Traversal Service Client Library for Python"
DESCRIPTION = "Azure Communication Network Traversal is managing TURN credentials for Azure Communication Services. \
 \
It will provide TURN credentials to a user."
LICENSE = "MIT"

PV = "1.1.0~b1"

RPM_NAME = "python311-azure-communication-networktraversal-1.1.0~b1-1.2.noarch.rpm"
RPM_HASH = "2799a01bef314a073c0359765586ae029607b1ffedd03827052f85185ce4f2bcd2c34cc198db9c54382565000b7b2a28ea12d86d7a1820c33e17d8bb348f00af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-communication-networktraversal) \
python311-azure-communication-networktraversal \
python3dist(azure-communication-networktraversal)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-communication-nspkg \
python311-azure-core \
python311-azure-nspkg \
python311-msrest"

inherit rpm
