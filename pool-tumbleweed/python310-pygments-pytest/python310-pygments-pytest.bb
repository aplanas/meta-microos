SUMMARY = "A pygments lexer for pytest output"
DESCRIPTION = "This library provides a pygments lexer called 'pytest'."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-pygments-pytest-2.3.0-2.3.noarch.rpm"
RPM_HASH = "3a39147780b962ad21d5ff6acab074c718ca28da97018eafc3b8adcdd7ee9e36305df508a5abfc9b7df28127c7dc7750666ca9850e9ca9373e3493bf1fd2c8d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pygments-pytest \
python310-pygments-pytest \
python3dist-pygments-pytest"

RDEPENDS:${PN} += "python-abi \
python310-pygments \
python310-pytest"

inherit rpm
