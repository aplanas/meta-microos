SUMMARY = "Symbolic constants in Python"
DESCRIPTION = "A library that provides symbolic constant support. \
It includes collections and constants with text, numeric, and bit flag values. \
Originally ``twisted.python.constants`` from the `Twisted <https://twistedmatrix.com/>`_ project."
LICENSE = "MIT"

PV = "15.1.0"

RPM_NAME = "python310-constantly-15.1.0-3.2.noarch.rpm"
RPM_HASH = "e9e01ea337d11049ee0b37a843442f7ee45bcfe78198a8e70b6b8a842af32e4f73e1d26060528c1366b18d95feebf52ad568e29dd125029ac65c849d1fce98f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-constantly \
python310-constantly \
python3dist-constantly"

RDEPENDS:${PN} += "python-abi"

inherit rpm
