SUMMARY = "Microsoft Azure Communication Call Automation Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Call Automation. \
Call Automation provides developers the ability to build server-based, \
intelligent call workflows, and call recording for voice and PSTN channels."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-communication-callautomation-1.0.0-1.1.noarch.rpm"
RPM_HASH = "0bbbd6273fa83805f58f9b0d34cd751fb24a02a5bf522975470995e7b116cc1b8711aea3be305896b196e938d08d619b9a496d27b652704141e08f6672e19257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-communication-callautomation \
python310-azure-communication-callautomation \
python3dist-azure-communication-callautomation"

RDEPENDS:${PN} += "python-abi \
python310-azure-communication-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-msrest \
python310-six"

inherit rpm
