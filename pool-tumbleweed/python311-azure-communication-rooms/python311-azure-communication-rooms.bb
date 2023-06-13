SUMMARY = "Microsoft Communication Rooms Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Rooms."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python311-azure-communication-rooms-1.0.0~b3-1.1.noarch.rpm"
RPM_HASH = "8020a29c7bebead1a81a06f96ee8069f1895199c1f1a3475a701d9da07b3c16f986a39d7530884bfedc581cc60f2c1862ef6526e5c0f5859b4a71010f4aedc68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-communication-rooms) \
python311-azure-communication-rooms \
python3dist(azure-communication-rooms)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-communication-nspkg \
python311-azure-core \
python311-azure-nspkg \
python311-msrest \
python311-six"

inherit rpm
