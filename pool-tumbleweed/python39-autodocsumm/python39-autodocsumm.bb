SUMMARY = "Extended sphinx autodoc including automatic autosummaries"
DESCRIPTION = "Extended sphinx autodoc including automatic autosummaries"
LICENSE = "Apache-2.0"

PV = "0.2.11"

RPM_NAME = "python39-autodocsumm-0.2.11-2.3.noarch.rpm"
RPM_HASH = "20ce146d395f127908552b2ca32a868bd9e575654a7e9d4f574c8171cf2d47d386a17f4c9c678b77d7c7d87c65d43dbced769fb60b486cc1f949f85f4c8686d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-autodocsumm \
python39-autodocsumm \
python3dist-autodocsumm"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
