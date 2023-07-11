SUMMARY = "Flake8 plugin for checking PEP-8 naming conventions"
DESCRIPTION = "Check the PEP-8 naming conventions. \
 \
This module provides a plugin for ``flake8``, the Python code checker. \
 \
(It replaces the plugin ``flint-naming`` for the ``flint`` checker.)"
LICENSE = "MIT"

PV = "0.13.3"

RPM_NAME = "python39-pep8-naming-0.13.3-1.5.noarch.rpm"
RPM_HASH = "7a16f60f29f881bc2d18efa9ef2f3dff9297df7947857ef30a943aed94805507da20774b0d9867ba99ea7f962bc2db7a1d1847cf1dfcfc6aa6a2f4a8915da6cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pep8-naming \
python39-pep8-naming \
python3dist-pep8-naming"

RDEPENDS:${PN} += "python-abi \
python39-flake8 \
python39-flake8-polyfill \
python39-setuptools"

inherit rpm
