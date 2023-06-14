SUMMARY = "Microsoft Azure Workloadmonitor Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloadmonitor Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b4"

RPM_NAME = "python39-azure-mgmt-workloadmonitor-1.0.0~b4-1.2.noarch.rpm"
RPM_HASH = "a4dc389485d8e667bce3cad9430604cb6391d0512e0f73af05ca665bfa63bb1cd9b11fd3516945db469f5502bb0f6d268553ab58c0c6d6560a8d96460969a958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-workloadmonitor \
python39-azure-mgmt-workloadmonitor \
python3dist-azure-mgmt-workloadmonitor"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
