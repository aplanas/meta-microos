SUMMARY = "Sphinx theme used by Guzzle"
DESCRIPTION = "This package contains the python bindings of the Sphinx theme used by Guzzle."
LICENSE = "MIT & OFL-1.1"

PV = "0.7.11"

RPM_NAME = "python310-guzzle_sphinx_theme-0.7.11-2.17.noarch.rpm"
RPM_HASH = "d4b23fada5e50f7ce3c9fd2ffd33e31e4361cf207d6a7d9c028e6f3a7983a7ed3e0c3dfa5822048c506d5a098517597cdc5923a148f59bebec4b6d70a78cdcb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-guzzle-sphinx-theme \
python310-guzzle-sphinx-theme \
python3dist-guzzle-sphinx-theme"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
