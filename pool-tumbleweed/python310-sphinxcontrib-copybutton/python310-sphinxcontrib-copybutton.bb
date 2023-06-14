SUMMARY = "Add a copy button to each of your code cells"
DESCRIPTION = "Add a copy button to each of your code cells."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python310-sphinxcontrib-copybutton-0.5.1-1.3.noarch.rpm"
RPM_HASH = "6c6561dd214a00aa53ca66c183199093ef1933727713c64c29ccbe0d385015aee3ebd155c9afe819e0010a0ced5165b8c874b64188b575b11b5389a59110c833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-copybutton \
python3.10dist-sphinx-copybutton \
python310-sphinxcontrib-copybutton \
python3dist-sphinx-copybutton"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
