SUMMARY = "Microsoft Azure Communication Chat Service Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Chat."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-communication-chat-1.1.0-1.10.noarch.rpm"
RPM_HASH = "5b3c1f0e8bf1034bb80e5923c6620631162be156d41c6a601062e4393efe4cef8a77526151da8009781f56335074761e93cef7ba9d19a8cd6e6484f385fc5a2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-communication-chat \
python39-azure-communication-chat \
python3dist-azure-communication-chat"

RDEPENDS:${PN} += "python-abi \
python39-azure-communication-nspkg \
python39-azure-core \
python39-azure-nspkg \
python39-msrest \
python39-six"

inherit rpm
