SUMMARY = "Extended sphinx autodoc including automatic autosummaries"
DESCRIPTION = "Extended sphinx autodoc including automatic autosummaries"
LICENSE = "Apache-2.0"

PV = "0.2.11"

RPM_NAME = "python311-autodocsumm-0.2.11-3.1.noarch.rpm"
RPM_HASH = "ce3235b496ae542e018a52ab42eced6b260fb558d9ec93a90a8e57bf45ee6261670c1bed5015f7c1a70ea57cd29e92aca0b0fa2643b817aa67885123e139c7ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autodocsumm \
python3.11dist-autodocsumm \
python311-autodocsumm \
python3dist-autodocsumm"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
