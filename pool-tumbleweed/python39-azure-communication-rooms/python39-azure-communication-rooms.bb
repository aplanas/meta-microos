SUMMARY = "Microsoft Communication Rooms Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Rooms."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-communication-rooms-1.0.0-1.3.noarch.rpm"
RPM_HASH = "065379d65f46d0b4c240e2ab5d6834dc681408311e020e71eea2ee2e2c73204de55cc095572d4558099cac10f6a58446e24ed0caac92847d6ddc9caa00a29402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-communication-rooms \
python39-azure-communication-rooms \
python3dist-azure-communication-rooms"

RDEPENDS:${PN} += "python-abi \
python39-azure-communication-nspkg \
python39-azure-core \
python39-azure-nspkg \
python39-msrest \
python39-six"

inherit rpm
