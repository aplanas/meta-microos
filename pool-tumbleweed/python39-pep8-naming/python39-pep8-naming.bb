SUMMARY = "Flake8 plugin for checking PEP-8 naming conventions"
DESCRIPTION = "Check the PEP-8 naming conventions. \
 \
This module provides a plugin for ``flake8``, the Python code checker. \
 \
(It replaces the plugin ``flint-naming`` for the ``flint`` checker.)"
LICENSE = "MIT"

PV = "0.13.3"

RPM_NAME = "python39-pep8-naming-0.13.3-1.3.noarch.rpm"
RPM_HASH = "8e6522e390c4b02a6c811847e738e1f240271b2f76fa267cfd21df9aeca92f3e62216ad7ace450a799e5ccb187393083f4ccdbe39b832cfa7f267d1c15ec7b0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pep8-naming) \
python39-pep8-naming \
python3dist(pep8-naming)"

RDEPENDS:${PN} += "python(abi) \
python39-flake8 \
python39-flake8-polyfill \
python39-setuptools"

inherit rpm
