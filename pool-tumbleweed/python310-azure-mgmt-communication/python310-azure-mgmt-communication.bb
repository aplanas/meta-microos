SUMMARY = "Microsoft Azure Communication Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Communication Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-communication-2.0.0-1.1.noarch.rpm"
RPM_HASH = "1de8272ed733c695c48a1abfd8aa1b576348546c3f0bd1cd02e6f0c122475b7e9f0d49f16dc217d0b3c454d9b6eb117191c152767ef10eb5a0b4b698659febd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-communication \
python3.10dist-azure-mgmt-communication \
python310-azure-mgmt-communication \
python3dist-azure-mgmt-communication"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
