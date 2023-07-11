SUMMARY = "Microsoft Azure Purview Sharing Client Library for Python"
DESCRIPTION = "Microsoft Purview Share is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python310-azure-purview-sharing-1.0.0~b2-1.3.noarch.rpm"
RPM_HASH = "ecb977f8de939ca30ebf13179d9da04d43ff911886b8f9fc9556e87f827ad6edbf0401392b91b8bd9d5ded7a6e5f0b196e0c8c18daad370fdbb119dbcc81ec67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-purview-sharing \
python310-azure-purview-sharing \
python3dist-azure-purview-sharing"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-azure-purview-nspkg \
python310-isodate"

inherit rpm
