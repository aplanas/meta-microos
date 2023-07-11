SUMMARY = "Microsoft Azure Networkfunction Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Networkfunction Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-mgmt-networkfunction-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "3897f0b52c520b9ef0f0f454c1cd597e166dee1cca1a9525d3237e57afb4ef6aacba5a947af9693b66479a1cb2dce05c69a6f6df8a6b49e226d83349baaeb460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-networkfunction \
python39-azure-mgmt-networkfunction \
python3dist-azure-mgmt-networkfunction"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
