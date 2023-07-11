SUMMARY = "Microsoft Azure Purview Administration Client Library for Python"
DESCRIPTION = "Azure Purview is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python310-azure-purview-administration-1.0.0b1-1.10.noarch.rpm"
RPM_HASH = "53ae5e14641a400d2933704c592ae7cea588fe4a5bbe0dd0306bc9990cd790e82fa743f30aa76a47c3d83768441fd6b6b1dbad7506bafa704964b5aaff9ebaa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-purview-administration \
python310-azure-purview-administration \
python3dist-azure-purview-administration"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-azure-purview-nspkg \
python310-msrest \
python310-six"

inherit rpm
