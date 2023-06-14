SUMMARY = "Integrate Azure Functions with Azure DevOps for the Azure CLI"
DESCRIPTION = "Python package for integrating Azure Functions with Azure DevOps. \
Specifically made for the Azure CLI."
LICENSE = "MIT"

PV = "0.0.22"

RPM_NAME = "python310-azure-functions-devops-build-0.0.22-2.11.noarch.rpm"
RPM_HASH = "7e6feb50957f9adbfe28c272895ff38f2b2c45c331f12d5707f7c2d78ef1da09710c935c813881dada91b3cfac447b085fbd4e12804f373848a56d0fa1e4ff81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-functions-devops-build \
python3.10dist-azure-functions-devops-build \
python310-azure-functions-devops-build \
python3dist-azure-functions-devops-build"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-msrest \
python310-vsts"

inherit rpm
