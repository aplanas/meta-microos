SUMMARY = "Sphinx extension for Read the Docs overrides"
DESCRIPTION = "This module adds extensions that make Sphinx easier to use. \
Some of them require Read the Docs features, \
others are just code that we ship and enable during builds on Read the Docs."
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python310-readthedocs-sphinx-ext-2.2.2-1.1.noarch.rpm"
RPM_HASH = "00012c5d8ac1731c46c4c3a419a51f3660db391dd7f8310727e5ceaf0c66ae01a859a3f4ffed4659f6f1ab63c3bd401ac595c0d775b6c658a5f1a9c849af16cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-readthedocs-sphinx-ext \
python310-readthedocs-sphinx-ext \
python3dist-readthedocs-sphinx-ext"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-requests"

inherit rpm
