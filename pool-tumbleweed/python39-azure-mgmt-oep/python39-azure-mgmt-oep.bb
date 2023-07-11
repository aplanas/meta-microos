SUMMARY = "Microsoft Azure Oep Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Oep Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python39-azure-mgmt-oep-1.0.0b2-1.4.noarch.rpm"
RPM_HASH = "a42e09587e05fb85c69d580054463a586dc791cebf0c0e0dbf732a93475586cb7891590ad4a0fd1325f2af954bdd13dbdcb4509aaff5fe416c1ccf87758c71a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-oep \
python39-azure-mgmt-oep \
python3dist-azure-mgmt-oep"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
