SUMMARY = "Microsoft Azure Workloadmonitor Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloadmonitor Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b4"

RPM_NAME = "python310-azure-mgmt-workloadmonitor-1.0.0~b4-1.3.noarch.rpm"
RPM_HASH = "7c8bfd86b08ed2d752239b9c1e08c081bc0d4a89a24a4a100de011f4f9aaa1c1307acfd8291ff52caa08b72c9bad91b6ec6d9be24c78f1f7dc5118d8786de75e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-workloadmonitor \
python310-azure-mgmt-workloadmonitor \
python3dist-azure-mgmt-workloadmonitor"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
