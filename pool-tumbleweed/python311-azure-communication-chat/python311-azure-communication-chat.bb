SUMMARY = "Microsoft Azure Communication Chat Service Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Chat."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-communication-chat-1.1.0-1.10.noarch.rpm"
RPM_HASH = "a913d7e8ffb9329bc915997303337ac3ba9b5eb354318b40a7a90148ea3488fda02a0f9449524e51954be2c4b9e036c44b80c46c1db60e91fbfac8b5a81ccbd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-chat \
python3.11dist-azure-communication-chat \
python311-azure-communication-chat \
python3dist-azure-communication-chat"

RDEPENDS:${PN} += "python-abi \
python311-azure-communication-nspkg \
python311-azure-core \
python311-azure-nspkg \
python311-msrest \
python311-six"

inherit rpm
