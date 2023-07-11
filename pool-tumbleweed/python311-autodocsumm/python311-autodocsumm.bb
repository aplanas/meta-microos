SUMMARY = "Extended sphinx autodoc including automatic autosummaries"
DESCRIPTION = "Extended sphinx autodoc including automatic autosummaries"
LICENSE = "Apache-2.0"

PV = "0.2.11"

RPM_NAME = "python311-autodocsumm-0.2.11-2.3.noarch.rpm"
RPM_HASH = "b39b9f82fd10e8b91fa01e27655370eefb04be04d112d43369f91e4f2a3a0be1ac3ccc1a09238e6b993c585527ebcb8b2840073e4da09a0315f045e56225ef33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autodocsumm \
python3.11dist-autodocsumm \
python311-autodocsumm \
python3dist-autodocsumm"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
