SUMMARY = "Microsoft Azure Workloadmonitor Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloadmonitor Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b4"

RPM_NAME = "python310-azure-mgmt-workloadmonitor-1.0.0~b4-1.2.noarch.rpm"
RPM_HASH = "7404958224323a51b44fa044c4099424ff354b21b983186b793be13a0f7b04c1f48e597f82a12bee56a06c189dd9333cd35882095090a528ee3b86b7e2e13264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-workloadmonitor \
python3.10dist(azure-mgmt-workloadmonitor) \
python310-azure-mgmt-workloadmonitor \
python3dist(azure-mgmt-workloadmonitor)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
