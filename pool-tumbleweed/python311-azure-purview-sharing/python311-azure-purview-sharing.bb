SUMMARY = "Microsoft Azure Purview Sharing Client Library for Python"
DESCRIPTION = "Microsoft Purview Share is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python311-azure-purview-sharing-1.0.0~b3-1.1.noarch.rpm"
RPM_HASH = "934aec473c34b76033c8154c1d21f34cc64add1977987cfc2d5989029a85d78bd2c6f495cac93215c857f695b574e349d78f5dcb8fff9c821931cff3789cbf42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-sharing \
python3.11dist-azure-purview-sharing \
python311-azure-purview-sharing \
python3dist-azure-purview-sharing"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-azure-purview-nspkg \
python311-isodate"

inherit rpm
