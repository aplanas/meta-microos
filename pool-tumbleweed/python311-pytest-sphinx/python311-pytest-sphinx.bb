SUMMARY = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives"
DESCRIPTION = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python311-pytest-sphinx-0.5.0-1.1.noarch.rpm"
RPM_HASH = "ddf0fdc9a6c18017498f7692456565476ed2a7e9c4ab0a32a970e93841d19cc85fb3ce929145f2d36476a6b284f485518f648cf14f269bb9437fd3a9b9278270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-sphinx \
python311-pytest-sphinx \
python3dist-pytest-sphinx"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
