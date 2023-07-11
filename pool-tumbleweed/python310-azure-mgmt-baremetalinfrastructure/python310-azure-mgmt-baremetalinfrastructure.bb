SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-baremetalinfrastructure-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "14cb11743ab111682a01970f7281b55a4c214b6f6e4480dc90d3cb3cb5cf01556c8a9cba6d7e3915424181915ecb2e5d2a3d09953df504ba27995635308f4c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-baremetalinfrastructure \
python310-azure-mgmt-baremetalinfrastructure \
python3dist-azure-mgmt-baremetalinfrastructure"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
