SUMMARY = "Add a copy button to each of your code cells"
DESCRIPTION = "Add a copy button to each of your code cells."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python311-sphinxcontrib-copybutton-0.5.1-2.3.noarch.rpm"
RPM_HASH = "9125f2d4e9999db4c0e047e213dfcc8fb30458460739442d316753327093298ff5070e3ed39ff092205d3a5d0987e25d4a3dda68e05a2cb0d179c0e023180c42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-copybutton \
python3.11dist-sphinx-copybutton \
python311-sphinxcontrib-copybutton \
python3dist-sphinx-copybutton"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
