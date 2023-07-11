SUMMARY = "Microsoft Azure Loadtesting Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Loadtesting Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-loadtesting-1.0.0-1.4.noarch.rpm"
RPM_HASH = "36540f0ae316d0968ac840111f1f1764f57ed5b61e8fab509adec028551a3d8e0aa52d1ff35fcaf4fe5493b09492e9354e1f8763851900e5218b3b9874cc88ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-loadtesting \
python310-azure-mgmt-loadtesting \
python3dist-azure-mgmt-loadtesting"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
