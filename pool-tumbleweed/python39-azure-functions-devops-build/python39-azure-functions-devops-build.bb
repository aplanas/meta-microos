SUMMARY = "Integrate Azure Functions with Azure DevOps for the Azure CLI"
DESCRIPTION = "Python package for integrating Azure Functions with Azure DevOps. \
Specifically made for the Azure CLI."
LICENSE = "MIT"

PV = "0.0.22"

RPM_NAME = "python39-azure-functions-devops-build-0.0.22-2.11.noarch.rpm"
RPM_HASH = "2357880d5e8fa45b33db9328a416f57089f4b638cee88474d9b11d45925948b9ec14862cca2e7f1e7549f43e24ab8c1d7d55fea20ed4574f10901117a4f6f4a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-functions-devops-build) \
python39-azure-functions-devops-build \
python3dist(azure-functions-devops-build)"

RDEPENDS:${PN} += "python(abi) \
python39-Jinja2 \
python39-msrest \
python39-vsts"

inherit rpm
