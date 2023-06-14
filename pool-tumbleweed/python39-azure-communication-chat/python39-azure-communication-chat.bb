SUMMARY = "Microsoft Azure Communication Chat Service Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Chat."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-communication-chat-1.1.0-1.8.noarch.rpm"
RPM_HASH = "58f4c34d8fadb2a64a7b9b85c81f6fbf112ec8fb805dee3a159e74746345e3cf23d77f56f73b2e1a8877eaa7375d4933ce67364840ecdb679ab4086fcc29b02b"
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
