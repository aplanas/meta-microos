SUMMARY = "Microsoft Azure Communication Call Automation Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Call Automation. \
Call Automation provides developers the ability to build server-based, \
intelligent call workflows, and call recording for voice and PSTN channels."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-communication-callautomation-1.0.0-1.1.noarch.rpm"
RPM_HASH = "244d5be15a1a299e4e487332476695b8abf6aca62312f05c8a38252254639f8e7bb2a338b38b4adc3128e064ce85700c5dbbecc61ba7b4d1ffc354ebc30c2200"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-communication-callautomation \
python39-azure-communication-callautomation \
python3dist-azure-communication-callautomation"

RDEPENDS:${PN} += "python-abi \
python39-azure-communication-nspkg \
python39-azure-core \
python39-azure-nspkg \
python39-msrest \
python39-six"

inherit rpm
