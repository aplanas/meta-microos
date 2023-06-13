SUMMARY = "Microsoft Azure Azurearcdata Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azurearcdata Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-azurearcdata-1.0.0-1.3.noarch.rpm"
RPM_HASH = "46aa34152fc7d69d9e22bb23e4f6826ae106d356d7776972d5bbf53489581e47ade1fe91564269019176930010fd104dca64550bd75477cdd9e20946b5b6f0df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-azurearcdata \
python3.10dist(azure-mgmt-azurearcdata) \
python310-azure-mgmt-azurearcdata \
python3dist(azure-mgmt-azurearcdata)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
