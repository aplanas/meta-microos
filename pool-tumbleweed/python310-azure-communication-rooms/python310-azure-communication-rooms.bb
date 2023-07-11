SUMMARY = "Microsoft Communication Rooms Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Rooms."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-communication-rooms-1.0.0-1.3.noarch.rpm"
RPM_HASH = "638e282145911d9af81453310e6665e70e6c9b669c0412cda4bba6805d62514c9a4af41f5f89a6ecedf09e05aa6233c2c2d0ff51736ae1aaa80b78c3787b5da5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-communication-rooms \
python310-azure-communication-rooms \
python3dist-azure-communication-rooms"

RDEPENDS:${PN} += "python-abi \
python310-azure-communication-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-msrest \
python310-six"

inherit rpm
