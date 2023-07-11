SUMMARY = "Microsoft Azure Communication Call Automation Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Call Automation. \
Call Automation provides developers the ability to build server-based, \
intelligent call workflows, and call recording for voice and PSTN channels."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-communication-callautomation-1.0.0-1.1.noarch.rpm"
RPM_HASH = "2a8d8fb70aaf05759f9f6369acdd582e92f36a1ce19009fba8f8222d64d0905d848ce4ccd01f135961649e1e737ec0a28264ee6a7e4fffbbdcbdce7f9b230f35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-callautomation \
python3.11dist-azure-communication-callautomation \
python311-azure-communication-callautomation \
python3dist-azure-communication-callautomation"

RDEPENDS:${PN} += "python-abi \
python311-azure-communication-nspkg \
python311-azure-core \
python311-azure-nspkg \
python311-msrest \
python311-six"

inherit rpm
