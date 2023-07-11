SUMMARY = "Microsoft Azure Red Hat Openshift Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Red Hat Openshift Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-azure-mgmt-redhatopenshift-1.2.0-1.4.noarch.rpm"
RPM_HASH = "ef3567bbd1ed3271022503c143df02bfadfb430a20fb6f1b843d69702438d90205a70650c9e2588dbace108d0cee11e207ca3d08cc7875b652e33ef3aa90b768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-redhatopenshift \
python310-azure-mgmt-redhatopenshift \
python3dist-azure-mgmt-redhatopenshift"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
