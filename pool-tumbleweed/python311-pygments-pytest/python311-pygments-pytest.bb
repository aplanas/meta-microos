SUMMARY = "A pygments lexer for pytest output"
DESCRIPTION = "This library provides a pygments lexer called 'pytest'."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-pygments-pytest-2.3.0-2.3.noarch.rpm"
RPM_HASH = "fe3027074a78e2d5f381e16749ac4c3bc11ff815d49424a2e93336c21b47e45551f4bb119f51f923c89c2128d3e56733c945114f12238e559e83e816a6f4254f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygments-pytest \
python3.11dist-pygments-pytest \
python311-pygments-pytest \
python3dist-pygments-pytest"

RDEPENDS:${PN} += "python-abi \
python311-pygments \
python311-pytest"

inherit rpm
