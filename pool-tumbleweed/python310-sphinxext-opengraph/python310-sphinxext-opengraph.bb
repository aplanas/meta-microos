SUMMARY = "Sphinx Extension to enable OGP support"
DESCRIPTION = "Sphinx Extension to enable OGP support"
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python310-sphinxext-opengraph-0.7.5-1.5.noarch.rpm"
RPM_HASH = "b19ece2a67340ac1757c45395f552cbc4c7db541826c68af3a9aeb31c0c7130c767dd07a1295e54a3fd63749f16147a0e8b9963fa943ade94b443b144846fe5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxext-opengraph \
python310-sphinxext-opengraph \
python3dist-sphinxext-opengraph"

RDEPENDS:${PN} += "python-abi \
python3-Sphinx"

inherit rpm
