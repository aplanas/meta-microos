SUMMARY = "Extended sphinx autodoc including automatic autosummaries"
DESCRIPTION = "Extended sphinx autodoc including automatic autosummaries"
LICENSE = "Apache-2.0"

PV = "0.2.11"

RPM_NAME = "python310-autodocsumm-0.2.11-3.1.noarch.rpm"
RPM_HASH = "4b5be4edec27c1d31b829272dd603b1f89e5e7d7662a94f76bc1e02c1a8179e1fee6d71e5fd04296a7a05faaf6e63939a9c565eb7ad19f06332780ab624b0455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-autodocsumm \
python310-autodocsumm \
python3dist-autodocsumm"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
