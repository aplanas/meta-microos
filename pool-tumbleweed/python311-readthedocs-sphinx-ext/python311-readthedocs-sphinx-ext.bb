SUMMARY = "Sphinx extension for Read the Docs overrides"
DESCRIPTION = "This module adds extensions that make Sphinx easier to use. \
Some of them require Read the Docs features, \
others are just code that we ship and enable during builds on Read the Docs."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python311-readthedocs-sphinx-ext-2.2.0-2.3.noarch.rpm"
RPM_HASH = "1601cecceb74558bc047c2d6cb78d3e45ede4bf003752b1407b806f38b522f722f68466d0d80128ca581d0ea0ff8c95f596b843080be3906a7867ec3f932a740"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-readthedocs-sphinx-ext \
python3.11dist-readthedocs-sphinx-ext \
python311-readthedocs-sphinx-ext \
python3dist-readthedocs-sphinx-ext"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-requests"

inherit rpm
