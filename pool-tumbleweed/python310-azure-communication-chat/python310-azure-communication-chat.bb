SUMMARY = "Microsoft Azure Communication Chat Service Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Chat."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-communication-chat-1.1.0-1.10.noarch.rpm"
RPM_HASH = "40a1090227a8a214b81a4dd53fce75b3be193e84002a5d1b4f38baeadd3df18cf63c1671351fdfaef154eeace2713f52bb01d1ea11e1ed95b5e0a63866bdfbe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-communication-chat \
python310-azure-communication-chat \
python3dist-azure-communication-chat"

RDEPENDS:${PN} += "python-abi \
python310-azure-communication-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-msrest \
python310-six"

inherit rpm
