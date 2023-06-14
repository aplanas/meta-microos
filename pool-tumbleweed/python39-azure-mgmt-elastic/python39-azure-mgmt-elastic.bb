SUMMARY = "Microsoft Azure Elastic Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elastic Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-elastic-1.0.0-1.8.noarch.rpm"
RPM_HASH = "b06031d6d2ba41b92d6e7a108257c5e26224bf1f6f380fe4e5483280f77b69ed1cc68946ee29e5381a0bdc88af38411145deb6c3916c3f9a11f2c46ea7cf2c0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-elastic \
python39-azure-mgmt-elastic \
python3dist-azure-mgmt-elastic"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
