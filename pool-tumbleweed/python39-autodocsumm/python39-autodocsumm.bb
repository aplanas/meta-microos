SUMMARY = "Extended sphinx autodoc including automatic autosummaries"
DESCRIPTION = "Extended sphinx autodoc including automatic autosummaries"
LICENSE = "Apache-2.0"

PV = "0.2.11"

RPM_NAME = "python39-autodocsumm-0.2.11-3.1.noarch.rpm"
RPM_HASH = "2d32ee21ad999ab1286c46acbc2b1352905fe3d32b51791bb5591ef051055b2b3e71803f54fa81867a0d70aaa8c545eef50fbd01d1e835b7409d2d439636a883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-autodocsumm \
python39-autodocsumm \
python3dist-autodocsumm"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
