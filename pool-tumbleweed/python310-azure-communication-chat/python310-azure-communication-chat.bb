SUMMARY = "Microsoft Azure Communication Chat Service Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Chat."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-communication-chat-1.1.0-1.8.noarch.rpm"
RPM_HASH = "2cb7862d7c14fe2113b44c1a6a64d540b65bfba2dd621b78fc67d36f3f1fdef200ac292e5b76c4ef86e74b5fa13caf88e46e332327fbe007d8c2463830f9e215"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-chat \
python3.10dist(azure-communication-chat) \
python310-azure-communication-chat \
python3dist(azure-communication-chat)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-communication-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-msrest \
python310-six"

inherit rpm
