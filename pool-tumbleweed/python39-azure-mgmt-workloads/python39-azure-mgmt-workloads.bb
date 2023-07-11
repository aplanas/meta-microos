SUMMARY = "Microsoft Azure Workloads Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloads Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-workloads-1.0.0.0-1.2.noarch.rpm"
RPM_HASH = "ffc483993fbd9f54229ca6f2e2b8ab7a8da93604b4610b3da6590761ae56ddc122d9de4a5cafefef50cfb28e7936184b95ace15b21859fd05493e777faae3b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-workloads \
python39-azure-mgmt-workloads \
python3dist-azure-mgmt-workloads"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
