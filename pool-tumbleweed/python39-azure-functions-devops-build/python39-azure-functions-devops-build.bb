SUMMARY = "Integrate Azure Functions with Azure DevOps for the Azure CLI"
DESCRIPTION = "Python package for integrating Azure Functions with Azure DevOps. \
Specifically made for the Azure CLI."
LICENSE = "MIT"

PV = "0.0.22"

RPM_NAME = "python39-azure-functions-devops-build-0.0.22-2.13.noarch.rpm"
RPM_HASH = "bff6c1a7b1314bdd4753075aea1709170a99ca9c59a87e3946af3afb6f79c46ab446e2a8d1777f3426ce15853ab52060a101e039bd2149ad71d9de560a57260c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-functions-devops-build \
python39-azure-functions-devops-build \
python3dist-azure-functions-devops-build"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-msrest \
python39-vsts"

inherit rpm
