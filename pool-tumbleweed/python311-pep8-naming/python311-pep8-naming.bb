SUMMARY = "Flake8 plugin for checking PEP-8 naming conventions"
DESCRIPTION = "Check the PEP-8 naming conventions. \
 \
This module provides a plugin for ``flake8``, the Python code checker. \
 \
(It replaces the plugin ``flint-naming`` for the ``flint`` checker.)"
LICENSE = "MIT"

PV = "0.13.3"

RPM_NAME = "python311-pep8-naming-0.13.3-1.5.noarch.rpm"
RPM_HASH = "1ee72f460d8ebcfb2c4c90c36dcc8e9c48ede78352bc9ea158561ea2b24424608bf833a79bd16f29c643a212cd683fda168b4d748cfd161d0d92e31b4fd1e060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pep8-naming \
python3.11dist-pep8-naming \
python311-pep8-naming \
python3dist-pep8-naming"

RDEPENDS:${PN} += "python-abi \
python311-flake8 \
python311-flake8-polyfill \
python311-setuptools"

inherit rpm
