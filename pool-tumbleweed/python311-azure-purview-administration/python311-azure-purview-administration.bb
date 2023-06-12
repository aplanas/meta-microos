SUMMARY = "Microsoft Azure Purview Administration Client Library for Python"
DESCRIPTION = "Azure Purview is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python311-azure-purview-administration-1.0.0b1-1.8.noarch.rpm"
RPM_HASH = "6e9e6df5b105f537203e6afa9f89796924519993049028b62f53a9b32bf087ef0985419710ee48491d75b423e90fe390218da80fd7bbfde7bee2420de063138e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-purview-administration) \
python311-azure-purview-administration \
python3dist(azure-purview-administration)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-core \
python311-azure-nspkg \
python311-azure-purview-nspkg \
python311-msrest \
python311-six"

inherit rpm
