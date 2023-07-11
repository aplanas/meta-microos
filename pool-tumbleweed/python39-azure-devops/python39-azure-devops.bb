SUMMARY = "Python wrapper around the Azure DevOps 5x APIs"
DESCRIPTION = "Python wrapper around the Azure DevOps 5.x APIs"
LICENSE = "MIT"

PV = "7.1.0~b1"

RPM_NAME = "python39-azure-devops-7.1.0~b1-1.3.noarch.rpm"
RPM_HASH = "9ddc48b76cdc61a1cc9c548901726014465abf7801fdabf3df58cadbe03d376193b166616a92a433b92074fe0daf527aa6ec13bb21d8acbf6bbe6d48f30fad87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-devops \
python39-azure-devops \
python39-vsts \
python3dist-azure-devops"

RDEPENDS:${PN} += "python-abi \
python39-azure-nspkg \
python39-msrest"

inherit rpm
