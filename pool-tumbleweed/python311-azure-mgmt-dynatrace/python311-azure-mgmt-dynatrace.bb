SUMMARY = "Microsoft Azure Dynatrace Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dynatrace Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-dynatrace-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "acba58373adefe6807e68ce1e070b3f03442481ff184b5df537293d0e8e239b2ce89478b1137ac1910b4edaf1ed6aaca0c6a6e1897e41e4b4131615c511878ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-dynatrace) \
python311-azure-mgmt-dynatrace \
python3dist(azure-mgmt-dynatrace)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
