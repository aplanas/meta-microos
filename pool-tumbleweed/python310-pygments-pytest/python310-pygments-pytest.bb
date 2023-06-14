SUMMARY = "A pygments lexer for pytest output"
DESCRIPTION = "This library provides a pygments lexer called 'pytest'."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-pygments-pytest-2.3.0-2.1.noarch.rpm"
RPM_HASH = "3feb925664522bb0a808297218a9a775fc7e96dc0d680460bdf22cdf23123fc262d1acb07a2dedd6da33ffcc4dd7c12c5853931a23ce3ef0d36515b9443c9883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygments-pytest \
python3.10dist-pygments-pytest \
python310-pygments-pytest \
python3dist-pygments-pytest"

RDEPENDS:${PN} += "python-abi \
python310-pygments \
python310-pytest"

inherit rpm
