SUMMARY = "Microsoft Azure Purview Sharing Client Library for Python"
DESCRIPTION = "Microsoft Purview Share is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python39-azure-purview-sharing-1.0.0~b2-1.3.noarch.rpm"
RPM_HASH = "e7002c96c095183a118e838f8186b5475a8ae529bcf95f28c5d82f6b895af7e4981ed97dddf8d8eb9ea1c36af4525a621720ab7fb1e8b26de868319d7f40c917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-purview-sharing \
python39-azure-purview-sharing \
python3dist-azure-purview-sharing"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-azure-purview-nspkg \
python39-isodate"

inherit rpm
