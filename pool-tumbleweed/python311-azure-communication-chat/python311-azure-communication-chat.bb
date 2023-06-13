SUMMARY = "Microsoft Azure Communication Chat Service Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Chat."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-communication-chat-1.1.0-1.8.noarch.rpm"
RPM_HASH = "7d88c6b120b58677174dcb8d4401c707ce56f90d182ccccbbf4f07d51c1156aace3c6ad1389419358b675a037e9ca1fa85c7517a5fcfb9fa9ebd9558758b1173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-communication-chat) \
python311-azure-communication-chat \
python3dist(azure-communication-chat)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-communication-nspkg \
python311-azure-core \
python311-azure-nspkg \
python311-msrest \
python311-six"

inherit rpm
