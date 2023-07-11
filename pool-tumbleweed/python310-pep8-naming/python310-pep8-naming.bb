SUMMARY = "Flake8 plugin for checking PEP-8 naming conventions"
DESCRIPTION = "Check the PEP-8 naming conventions. \
 \
This module provides a plugin for ``flake8``, the Python code checker. \
 \
(It replaces the plugin ``flint-naming`` for the ``flint`` checker.)"
LICENSE = "MIT"

PV = "0.13.3"

RPM_NAME = "python310-pep8-naming-0.13.3-1.5.noarch.rpm"
RPM_HASH = "289bf7ece57de34defb3cd665420a0ee30250c4a0d23d72ffeed8a6cc12aab4ddf381a34d9f1bfe95adc7d91caa56507a2e74f8f818ca1bec01fba408f3cce6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pep8-naming \
python310-pep8-naming \
python3dist-pep8-naming"

RDEPENDS:${PN} += "python-abi \
python310-flake8 \
python310-flake8-polyfill \
python310-setuptools"

inherit rpm
