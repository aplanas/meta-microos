SUMMARY = "Use Twisted from any applications"
DESCRIPTION = "Crochet is an MIT-licensed library that makes it easier for blocking or \
threaded applications like Flask or Django to use the Twisted networking \
framework."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python310-crochet-2.1.1-1.1.noarch.rpm"
RPM_HASH = "a6351a0ae132f20acd13a63372af256c5436950adc72a49df792e23bebe10073dd9ab9e9083ce467e91b3d564be66bd2b2a5daba7689b60b314460cbe8244cd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-crochet \
python310-crochet \
python3dist-crochet"

RDEPENDS:${PN} += "python-abi \
python310-Twisted \
python310-wrapt"

inherit rpm
