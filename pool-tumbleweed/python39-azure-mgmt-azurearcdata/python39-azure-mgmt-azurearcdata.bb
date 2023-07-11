SUMMARY = "Microsoft Azure Azurearcdata Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azurearcdata Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-azurearcdata-1.0.0-1.4.noarch.rpm"
RPM_HASH = "0570689ef9953081b90d5dfcc9528aabbcc27d00cfce4521df3aa3ac77cb37b9c1bf99a5028cb587120a260acca76cb36f3ec56f40baeddd459fa8a5ecb76dfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-azurearcdata \
python39-azure-mgmt-azurearcdata \
python3dist-azure-mgmt-azurearcdata"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
