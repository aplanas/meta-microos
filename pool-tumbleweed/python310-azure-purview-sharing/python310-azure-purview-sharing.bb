SUMMARY = "Microsoft Azure Purview Sharing Client Library for Python"
DESCRIPTION = "Microsoft Purview Share is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python310-azure-purview-sharing-1.0.0~b3-1.1.noarch.rpm"
RPM_HASH = "f0bfd69f21994d5de7e3cb482909d60fa8068c5c21522c26548e6fa373424ce68c00ad918da0dfef050a2461039708254035d130ad3fe52af89f10aac038e29d"
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
