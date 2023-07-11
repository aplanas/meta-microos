SUMMARY = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives"
DESCRIPTION = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python39-pytest-sphinx-0.5.0-1.3.noarch.rpm"
RPM_HASH = "82ef92e2a6085b0069e75714f29ea54b592937a0293281c9c264bc7084027e75503213f9ee40d9f8140e371023870d8269495f693d71ecec0f3c4f39b414cc61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-sphinx \
python39-pytest-sphinx \
python3dist-pytest-sphinx"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
