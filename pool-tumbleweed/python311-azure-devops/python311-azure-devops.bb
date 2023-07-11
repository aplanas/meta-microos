SUMMARY = "Python wrapper around the Azure DevOps 5x APIs"
DESCRIPTION = "Python wrapper around the Azure DevOps 5.x APIs"
LICENSE = "MIT"

PV = "7.1.0~b1"

RPM_NAME = "python311-azure-devops-7.1.0~b1-1.3.noarch.rpm"
RPM_HASH = "9a2c4e9fa3607d1b076586f81b8f12b0646f8ccb80f0ba7870387d0c53063aaa904193a0874bcc043d7845fade46422672a0332df7f9949add858c0294dac266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-devops \
python3-vsts \
python3.11dist-azure-devops \
python311-azure-devops \
python311-vsts \
python3dist-azure-devops"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg \
python311-msrest"

inherit rpm
