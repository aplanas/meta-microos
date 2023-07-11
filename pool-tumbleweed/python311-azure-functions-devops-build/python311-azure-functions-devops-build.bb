SUMMARY = "Integrate Azure Functions with Azure DevOps for the Azure CLI"
DESCRIPTION = "Python package for integrating Azure Functions with Azure DevOps. \
Specifically made for the Azure CLI."
LICENSE = "MIT"

PV = "0.0.22"

RPM_NAME = "python311-azure-functions-devops-build-0.0.22-2.13.noarch.rpm"
RPM_HASH = "07c28a0a52e953d5fc7daa82a5d140e9f9bedfefb43cf2628c5e9915b7c3ecd6477b164f7fb5fea76fcb041a5e2c2cccbc307f2a20236014aec793ae544fff5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-functions-devops-build \
python3.11dist-azure-functions-devops-build \
python311-azure-functions-devops-build \
python3dist-azure-functions-devops-build"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-msrest \
python311-vsts"

inherit rpm
