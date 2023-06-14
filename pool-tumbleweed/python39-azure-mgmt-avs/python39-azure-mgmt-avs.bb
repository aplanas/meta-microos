SUMMARY = "Microsoft Azure VMware Solution Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure VMware Solution Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python39-azure-mgmt-avs-7.1.0-1.3.noarch.rpm"
RPM_HASH = "56aa44839c0798a623828a366cb43e02ddf20869206c4715d1630e55304ff1468572651276f5f6931b3f53b27288a1b18d300f061288ab57bc0bd8da18e50947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-avs \
python39-azure-mgmt-avs \
python3dist-azure-mgmt-avs"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
