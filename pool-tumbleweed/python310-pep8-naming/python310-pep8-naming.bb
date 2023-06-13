SUMMARY = "Flake8 plugin for checking PEP-8 naming conventions"
DESCRIPTION = "Check the PEP-8 naming conventions. \
 \
This module provides a plugin for ``flake8``, the Python code checker. \
 \
(It replaces the plugin ``flint-naming`` for the ``flint`` checker.)"
LICENSE = "MIT"

PV = "0.13.3"

RPM_NAME = "python310-pep8-naming-0.13.3-1.3.noarch.rpm"
RPM_HASH = "a0683801c2d736de3527e5aa13ba4065ca67baf336d0c564edc4fe1ad08d62f1bf7f161ca56d622cca43519944c336a27ad93da75709844d78388064bfebc0bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pep8-naming \
python3.10dist(pep8-naming) \
python310-pep8-naming \
python3dist(pep8-naming)"

RDEPENDS:${PN} += "python(abi) \
python310-flake8 \
python310-flake8-polyfill \
python310-setuptools"

inherit rpm
