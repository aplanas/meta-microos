SUMMARY = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives"
DESCRIPTION = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python310-pytest-sphinx-0.5.0-1.3.noarch.rpm"
RPM_HASH = "c4c735b4a6fa02d66ac55782605c14e36907553d59f541b98bc4e1dbd8de4629ba1b0180425da726537f8710c38689bd61b2d967073ffb53f2e87e80632952a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-sphinx \
python310-pytest-sphinx \
python3dist-pytest-sphinx"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
