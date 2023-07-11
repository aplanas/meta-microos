SUMMARY = "Add a copy button to each of your code cells"
DESCRIPTION = "Add a copy button to each of your code cells."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python39-sphinxcontrib-copybutton-0.5.1-2.3.noarch.rpm"
RPM_HASH = "739a39da8dc5d99fdb5668ca2657c483b3974e03e8ee81468b75028ea2cdf216609e66d64aa73859cfb3e04cc38e0d529337f5901754b487b1d1e644c2336b79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-copybutton \
python39-sphinxcontrib-copybutton \
python3dist-sphinx-copybutton"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
