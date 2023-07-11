SUMMARY = "Microsoft Azure Azurearcdata Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azurearcdata Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-azurearcdata-1.0.0-1.4.noarch.rpm"
RPM_HASH = "6e1a4f88473a0dac4d5c15b5dcec629da09f2df2796b736b6059ec0541f5503e5f3adc3bd32ee9c708cfaba8ab3dd519116c92b071ce0d6ee9b83d34cef76013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-azurearcdata \
python310-azure-mgmt-azurearcdata \
python3dist-azure-mgmt-azurearcdata"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
