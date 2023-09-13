SUMMARY = "Sphinx extension for Read the Docs overrides"
DESCRIPTION = "This module adds extensions that make Sphinx easier to use. \
Some of them require Read the Docs features, \
others are just code that we ship and enable during builds on Read the Docs."
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python39-readthedocs-sphinx-ext-2.2.2-1.1.noarch.rpm"
RPM_HASH = "9e15dadd96fe2c9d8c11f5019b65854c14b818aaef4b8ece1f94fea881dbec0d2ac469ee498f3bd98091d8f82d16ca97ac2ff5106ff35f2977b543a1537a8941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-readthedocs-sphinx-ext \
python39-readthedocs-sphinx-ext \
python3dist-readthedocs-sphinx-ext"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-requests"

inherit rpm
