SUMMARY = "Microsoft Azure Purview Sharing Client Library for Python"
DESCRIPTION = "Microsoft Purview Share is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python311-azure-purview-sharing-1.0.0~b2-1.3.noarch.rpm"
RPM_HASH = "50a3b855cf60989f26f8434b2aacb8c56f1f76d870ced0848b4c311c8b26ebc167fa0fbb4b00c0a732110dfbc1aee948668f0c847a90968d7b67a54046d8015f"
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
