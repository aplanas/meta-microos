SUMMARY = "Microsoft Azure Workloads Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloads Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-workloads-1.0.0.0-1.1.noarch.rpm"
RPM_HASH = "36438e4249cd4e612fc2ed87c4095d91f3dd805f6966aad603ebcdb26923a90fd839ef82353fdbb061015950385bb16a8e51c77f9d27c6ea6cf236482104a48a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-workloads) \
python39-azure-mgmt-workloads \
python3dist(azure-mgmt-workloads)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
