SUMMARY = "Sphinx contrib extension to generate html help files"
DESCRIPTION = "Html help generating extension."
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python310-sphinxcontrib-htmlhelp-2.0.1-2.3.noarch.rpm"
RPM_HASH = "b66b5447ee1c3256a0420ad42b1b52cae2a310b98271229ad3896e0f56a72406e349327a66d5efedfd01b0215bf1d70e25dac5ad05ad4be6848bb5eaafb4b894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-htmlhelp \
python310-sphinxcontrib-htmlhelp \
python3dist-sphinxcontrib-htmlhelp"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
