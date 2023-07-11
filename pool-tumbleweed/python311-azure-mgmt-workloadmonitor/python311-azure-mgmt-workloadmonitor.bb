SUMMARY = "Microsoft Azure Workloadmonitor Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloadmonitor Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b4"

RPM_NAME = "python311-azure-mgmt-workloadmonitor-1.0.0~b4-1.3.noarch.rpm"
RPM_HASH = "5f5ac2c338d4f72ab4d40492d2f025d6592638487b7ae39c0b0d5def4e2f65b41fda889ce7530efc56d8781f0ef95e2c1d93cb6e45cc141beb27cc1810deaed0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-workloadmonitor \
python3.11dist-azure-mgmt-workloadmonitor \
python311-azure-mgmt-workloadmonitor \
python3dist-azure-mgmt-workloadmonitor"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
