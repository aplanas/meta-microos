SUMMARY = "Microsoft Azure Edgeorder Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Edgeorder Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-edgeorder-1.0.0.0-1.6.noarch.rpm"
RPM_HASH = "440dacdaf89729de2d1fc72ac9ab8a3da27971a08f213cf49428331c5646c677460e010ea09c73fb0f51733e57c4fdb083ba35049db41679b99b533f4f66dc03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-edgeorder) \
python39-azure-mgmt-edgeorder \
python3dist(azure-mgmt-edgeorder)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
