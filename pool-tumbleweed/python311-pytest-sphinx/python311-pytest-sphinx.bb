SUMMARY = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives"
DESCRIPTION = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python311-pytest-sphinx-0.5.0-1.3.noarch.rpm"
RPM_HASH = "ec79f01c15bce7c19276acefff311232b009b45a401ef5268ec7a8e43ba11b60b0d8560491740682569cf6fb0bb689d9059331f1a1d97aa588b027a2c4889a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-sphinx \
python3.11dist-pytest-sphinx \
python311-pytest-sphinx \
python3dist-pytest-sphinx"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
