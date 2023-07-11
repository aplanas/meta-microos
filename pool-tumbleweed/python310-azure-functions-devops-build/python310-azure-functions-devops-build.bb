SUMMARY = "Integrate Azure Functions with Azure DevOps for the Azure CLI"
DESCRIPTION = "Python package for integrating Azure Functions with Azure DevOps. \
Specifically made for the Azure CLI."
LICENSE = "MIT"

PV = "0.0.22"

RPM_NAME = "python310-azure-functions-devops-build-0.0.22-2.13.noarch.rpm"
RPM_HASH = "0615405a45b034da6d50c0c5b8014dffa3acd9860e2ed422e4c2d4923be3336f0a21f3e2e77cf1946838f9adf1dd9bf5160091f63689e87157e10fe4b669184c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-functions-devops-build \
python310-azure-functions-devops-build \
python3dist-azure-functions-devops-build"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-msrest \
python310-vsts"

inherit rpm
