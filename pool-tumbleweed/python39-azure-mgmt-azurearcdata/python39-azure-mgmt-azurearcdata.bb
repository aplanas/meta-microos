SUMMARY = "Microsoft Azure Azurearcdata Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azurearcdata Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-azurearcdata-1.0.0-1.3.noarch.rpm"
RPM_HASH = "4533e530a2354452588678a1c3e4c0148d1a8385d22fbd23d0869d81955fc252601f96e9faf55376be207935a30eab06c99eebd7271d56f4c076196dbae2ba82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-azurearcdata) \
python39-azure-mgmt-azurearcdata \
python3dist(azure-mgmt-azurearcdata)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
