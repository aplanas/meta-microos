SUMMARY = "Microsoft Azure Workloads Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloads Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-workloads-1.0.0.0-1.1.noarch.rpm"
RPM_HASH = "dca8a0a7063409b9cd4637e52d0aec2c59815f8b7ebe50fcd9b979409a596f52336339c8e85d2d73221d7de6d9b6f1e87aa77e152bbf4fb51f86b320fed2dc3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-workloads \
python3.10dist(azure-mgmt-workloads) \
python310-azure-mgmt-workloads \
python3dist(azure-mgmt-workloads)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
