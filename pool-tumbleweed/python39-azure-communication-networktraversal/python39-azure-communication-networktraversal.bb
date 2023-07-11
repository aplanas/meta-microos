SUMMARY = "MS Azure Communication Network Traversal Service Client Library for Python"
DESCRIPTION = "Azure Communication Network Traversal is managing TURN credentials for Azure Communication Services. \
 \
It will provide TURN credentials to a user."
LICENSE = "MIT"

PV = "1.1.0~b1"

RPM_NAME = "python39-azure-communication-networktraversal-1.1.0~b1-1.4.noarch.rpm"
RPM_HASH = "65290a3331ff48c80e9730a087b900ef0220c9f00542e9353cb746c512aab332fd1ed5ee8cef945670608f28b2d31562d52f6780890a70a1d94c55e5a679e0d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-communication-networktraversal \
python39-azure-communication-networktraversal \
python3dist-azure-communication-networktraversal"

RDEPENDS:${PN} += "python-abi \
python39-azure-communication-nspkg \
python39-azure-core \
python39-azure-nspkg \
python39-msrest"

inherit rpm
