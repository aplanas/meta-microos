SUMMARY = "Microsoft Azure Workloadmonitor Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloadmonitor Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b4"

RPM_NAME = "python39-azure-mgmt-workloadmonitor-1.0.0~b4-1.3.noarch.rpm"
RPM_HASH = "d68abd1c1216eb1cb11eeb4bfcf1856718cffe6509f1b5811d5d4bbd39f57b6fb65065abeac68544519c5fc4a262e233fe9c6dcdd41f434c70ac10f89fc212e3"
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
