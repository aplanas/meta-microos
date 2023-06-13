SUMMARY = "Microsoft Azure Purview Sharing Client Library for Python"
DESCRIPTION = "Microsoft Purview Share is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-purview-sharing-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "cdfc6e9ac38759bd64903d5f726baabfe782bd5d995d5e7c10a90b26d90a4d20b8268d5d59a1fc6c0536691d4d391e8e2dc630f34fc156358c3ce04c872b190d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-sharing \
python3.10dist(azure-purview-sharing) \
python310-azure-purview-sharing \
python3dist(azure-purview-sharing)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-core \
python310-azure-nspkg \
python310-azure-purview-nspkg \
python310-isodate"

inherit rpm
