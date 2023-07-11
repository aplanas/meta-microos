SUMMARY = "Microsoft Azure Service Management Legacy Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Management Legacy Client Library. \
 \
All packages in this bundle have been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "Apache-2.0"

PV = "0.20.7"

RPM_NAME = "python310-azure-servicemanagement-legacy-0.20.7-2.12.noarch.rpm"
RPM_HASH = "4cbdd885b9d49106b52f3b5a0d03e9cff12c5d65f223ab33d37d5ca27c66ebb4d5f0b9b8b6ebf06880bd27f2296ed853d17b4e07c00a2fccb7f7b74437932b04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-servicemanagement-legacy \
python310-azure-servicemanagement-legacy \
python3dist-azure-servicemanagement-legacy"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-nspkg \
python310-requests"

inherit rpm
