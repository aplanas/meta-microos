SUMMARY = "Sphinx extension for Read the Docs overrides"
DESCRIPTION = "This module adds extensions that make Sphinx easier to use. \
Some of them require Read the Docs features, \
others are just code that we ship and enable during builds on Read the Docs."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python39-readthedocs-sphinx-ext-2.2.0-2.3.noarch.rpm"
RPM_HASH = "ec746aa126585e32f917d9fc4917d3a1a0f53c4b276a3c77020f3b797e7bca4fd8281ab0e96361d8e05ddeff4d392ac671ee43f5d4e5ad9a2ce4451fe43d41fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-readthedocs-sphinx-ext \
python39-readthedocs-sphinx-ext \
python3dist-readthedocs-sphinx-ext"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-requests"

inherit rpm
