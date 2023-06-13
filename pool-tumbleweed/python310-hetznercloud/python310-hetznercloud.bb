SUMMARY = "Hetzner Cloud SDK"
DESCRIPTION = "A Python 3 SDK for the Hetzner cloud service."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-hetznercloud-1.1.1-3.11.noarch.rpm"
RPM_HASH = "422ad7ee946582407a03b273119bd323883d87cbcb0d525d3cbf7cff7d0d557477e894f1c13af451db3580e27a2b06efd37a5e50bdc25c69034e00304436b3ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hetznercloud \
python3.10dist(hetznercloud) \
python310-hetznercloud \
python3dist(hetznercloud)"

RDEPENDS:${PN} += "python(abi) \
python310-requests"

inherit rpm
