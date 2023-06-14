SUMMARY = "Symbolic constants in Python"
DESCRIPTION = "A library that provides symbolic constant support. \
It includes collections and constants with text, numeric, and bit flag values. \
Originally ``twisted.python.constants`` from the `Twisted <https://twistedmatrix.com/>`_ project."
LICENSE = "MIT"

PV = "15.1.0"

RPM_NAME = "python311-constantly-15.1.0-3.1.noarch.rpm"
RPM_HASH = "9506c2e118d8cb512656eea84aa6f3ad7fcc53efd932764ff7468c0c16046c69e31f61a94f9306688a83bf19263646ecba5026f44c52c1d22f0c41339259ac8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-constantly \
python311-constantly \
python3dist-constantly"

RDEPENDS:${PN} += "python-abi"

inherit rpm
