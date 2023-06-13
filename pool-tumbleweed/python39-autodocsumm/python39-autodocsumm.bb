SUMMARY = "Extended sphinx autodoc including automatic autosummaries"
DESCRIPTION = "Extended sphinx autodoc including automatic autosummaries"
LICENSE = "Apache-2.0"

PV = "0.2.11"

RPM_NAME = "python39-autodocsumm-0.2.11-2.1.noarch.rpm"
RPM_HASH = "60a957448fe32515a761d403f1b37da9196c9b6b58fa2a8b071cc99fbcab5d11dae494cdc3fa399e5ec943f54a9b4b0b4f616c3232397ac6d44baf9bbac252d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(autodocsumm) \
python39-autodocsumm \
python3dist(autodocsumm)"

RDEPENDS:${PN} += "python(abi) \
python39-Sphinx"

inherit rpm
