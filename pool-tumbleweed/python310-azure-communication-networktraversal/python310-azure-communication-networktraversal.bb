SUMMARY = "MS Azure Communication Network Traversal Service Client Library for Python"
DESCRIPTION = "Azure Communication Network Traversal is managing TURN credentials for Azure Communication Services. \
 \
It will provide TURN credentials to a user."
LICENSE = "MIT"

PV = "1.1.0~b1"

RPM_NAME = "python310-azure-communication-networktraversal-1.1.0~b1-1.4.noarch.rpm"
RPM_HASH = "a77dc3252aef9ff5985defaac583b3ba3e1f55762c8bcec9c9804bb0f51310cdf04187956fad2469d348960283cabf4d86899fab71414dc92d02616f982f502d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-communication-networktraversal \
python310-azure-communication-networktraversal \
python3dist-azure-communication-networktraversal"

RDEPENDS:${PN} += "python-abi \
python310-azure-communication-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-msrest"

inherit rpm
