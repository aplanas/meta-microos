SUMMARY = "Add a copy button to each of your code cells"
DESCRIPTION = "Add a copy button to each of your code cells."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python311-sphinxcontrib-copybutton-0.5.1-1.3.noarch.rpm"
RPM_HASH = "a05c4000a3020ac532cec48d5b625405a29f4076789aa2d3f837c67d8b45cbffbc17db67152d69eccef229fa63f475fa35d5980267db27cf21f7d28b8008bcaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinx-copybutton) \
python311-sphinxcontrib-copybutton \
python3dist(sphinx-copybutton)"
RDEPENDS:${PN} += "python(abi) \
python311-Sphinx"

inherit rpm
