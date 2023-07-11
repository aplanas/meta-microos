SUMMARY = "Microsoft Azure App Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure App Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python39-azure-mgmt-app-1.0.0b2-1.6.noarch.rpm"
RPM_HASH = "a94682c214236a80addc7dc5b5c74f313aa81159d00985640665b109e3ac1e703d8f5b9fed4458a80cd7f898acd038a8fd4f87661ffffc43e975aebe71c69c02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-app \
python39-azure-mgmt-app \
python3dist-azure-mgmt-app"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
