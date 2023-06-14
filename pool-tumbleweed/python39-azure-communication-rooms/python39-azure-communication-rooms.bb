SUMMARY = "Microsoft Communication Rooms Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Rooms."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python39-azure-communication-rooms-1.0.0~b3-1.1.noarch.rpm"
RPM_HASH = "b31d74c23693004c4867c00cf70426d10cece0363267b45d802b196bec841aefd75184e960976c9737677ed26c49684b8acc10d35bfb98b723fb643dbbc9546a"
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
