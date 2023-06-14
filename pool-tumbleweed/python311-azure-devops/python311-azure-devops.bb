SUMMARY = "Python wrapper around the Azure DevOps 5x APIs"
DESCRIPTION = "Python wrapper around the Azure DevOps 5.x APIs"
LICENSE = "MIT"

PV = "7.1.0~b1"

RPM_NAME = "python311-azure-devops-7.1.0~b1-1.1.noarch.rpm"
RPM_HASH = "3388b8b3ccec64bf5f00b2b0404246b789dc3771c573abd6325681c5f5f8305d4163b59c584ab6eabd07144c75e983dc1b9c18caaac01f15b5a1cdae1d1939e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-devops \
python311-azure-devops \
python311-vsts \
python3dist-azure-devops"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg \
python311-msrest"

inherit rpm
