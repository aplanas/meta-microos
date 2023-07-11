SUMMARY = "Sphinx extension for Read the Docs overrides"
DESCRIPTION = "This module adds extensions that make Sphinx easier to use. \
Some of them require Read the Docs features, \
others are just code that we ship and enable during builds on Read the Docs."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python310-readthedocs-sphinx-ext-2.2.0-2.3.noarch.rpm"
RPM_HASH = "45c811ac0673d886c58e7f654498dd5bd215904b1461a822debb2cc6ab62e5f43d9e60a760c8e027012e04761cae6521f507524ef8c429f547fb882e91db82d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-readthedocs-sphinx-ext \
python310-readthedocs-sphinx-ext \
python3dist-readthedocs-sphinx-ext"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-requests"

inherit rpm
