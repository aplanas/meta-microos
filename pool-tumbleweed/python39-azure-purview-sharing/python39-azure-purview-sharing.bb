SUMMARY = "Microsoft Azure Purview Sharing Client Library for Python"
DESCRIPTION = "Microsoft Purview Share is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-purview-sharing-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "c8affd8d555c8abddbe146bfa167a1368ed16263e10ef5d1d597732609e2b0646e64e22992707e5d822ed8a91242ba547a8c5ff64c23e59a6f9b1532fca041c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-purview-sharing) \
python39-azure-purview-sharing \
python3dist(azure-purview-sharing)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-core \
python39-azure-nspkg \
python39-azure-purview-nspkg \
python39-isodate"

inherit rpm
