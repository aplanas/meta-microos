SUMMARY = "Sphinx extension for Read the Docs overrides"
DESCRIPTION = "This module adds extensions that make Sphinx easier to use. \
Some of them require Read the Docs features, \
others are just code that we ship and enable during builds on Read the Docs."
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python311-readthedocs-sphinx-ext-2.2.2-1.1.noarch.rpm"
RPM_HASH = "0e34e7b3440efd42d6d22e4fb1b48a8c6eb8b2be4952be436d9e0cc43703fb832e85c4df5c207f2e165e48b1325ec568550891cc0555f3b1c0177e849a60f570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-readthedocs-sphinx-ext \
python3.11dist-readthedocs-sphinx-ext \
python311-readthedocs-sphinx-ext \
python3dist-readthedocs-sphinx-ext"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-requests"

inherit rpm
