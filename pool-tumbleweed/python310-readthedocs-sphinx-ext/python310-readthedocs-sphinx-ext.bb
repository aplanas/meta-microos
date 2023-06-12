SUMMARY = "Sphinx extension for Read the Docs overrides"
DESCRIPTION = "This module adds extensions that make Sphinx easier to use. \
Some of them require Read the Docs features, \
others are just code that we ship and enable during builds on Read the Docs."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python310-readthedocs-sphinx-ext-2.2.0-2.1.noarch.rpm"
RPM_HASH = "37408b4cbd3168f23fb3df4c843cb4b75c2115c3103858818f0527c7bb3314230b9bf85a5f9e48d7ffb9b60412c04d765255e5a37671637c39464743d7183cb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-readthedocs-sphinx-ext \
python3.10dist(readthedocs-sphinx-ext) \
python310-readthedocs-sphinx-ext \
python3dist(readthedocs-sphinx-ext)"
RDEPENDS:${PN} += "python(abi) \
python310-Sphinx \
python310-requests"

inherit rpm
