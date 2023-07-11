SUMMARY = "Microsoft Azure Support Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Support Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.0.0.0"

RPM_NAME = "python39-azure-mgmt-support-6.0.0.0-1.9.noarch.rpm"
RPM_HASH = "aeecc4f26d9b64812bcaf6b4281339c714c87e0e4a3ae266ca6799dd5a63614a26a0aba0800a0d7cad7197bb67e73cedd177b4935e00f62d08b4ddc17617349b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-support \
python39-azure-mgmt-support \
python3dist-azure-mgmt-support"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
