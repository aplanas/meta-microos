SUMMARY = "Python runtime inspection utilities for typing"
DESCRIPTION = "Python runtime inspection utilities for typing module."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-typing-inspect-0.9.0-1.1.noarch.rpm"
RPM_HASH = "9e3f280ad8c91a233be13baa2d21990873d546d8e5272819b885fd7f3b507d7e8ca11580bc4551098ba3c6e863bbd7282adcb00ca5b93fc2cfa5270d2047ad8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-typing-inspect \
python39-typing-inspect \
python3dist-typing-inspect"

RDEPENDS:${PN} += "python-abi \
python39-mypy-extensions \
python39-typing-extensions"

inherit rpm
