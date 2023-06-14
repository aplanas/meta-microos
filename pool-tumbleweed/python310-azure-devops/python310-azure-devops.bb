SUMMARY = "Python wrapper around the Azure DevOps 5x APIs"
DESCRIPTION = "Python wrapper around the Azure DevOps 5.x APIs"
LICENSE = "MIT"

PV = "7.1.0~b1"

RPM_NAME = "python310-azure-devops-7.1.0~b1-1.1.noarch.rpm"
RPM_HASH = "1037476a402219926f41e41f13dfe6c1e6d6d16ec82291b012ac37c20e973974d4a7fbd59a4ef63c017bd30763ac6e8523501c1b3fae23fb0327476c52b2c303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-devops \
python3-vsts \
python3.10dist-azure-devops \
python310-azure-devops \
python310-vsts \
python3dist-azure-devops"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg \
python310-msrest"

inherit rpm
