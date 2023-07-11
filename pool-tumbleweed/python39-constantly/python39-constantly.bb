SUMMARY = "Symbolic constants in Python"
DESCRIPTION = "A library that provides symbolic constant support. \
It includes collections and constants with text, numeric, and bit flag values. \
Originally ``twisted.python.constants`` from the `Twisted <https://twistedmatrix.com/>`_ project."
LICENSE = "MIT"

PV = "15.1.0"

RPM_NAME = "python39-constantly-15.1.0-3.2.noarch.rpm"
RPM_HASH = "dcfd4ec34a4c619033536abb736686e18376326552ad27a1f1714b4e3ad5cb3d616bd9c295c62d4b489d3975585868288b45f138e4196b558650617f1c9b5b42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-constantly \
python39-constantly \
python3dist-constantly"

RDEPENDS:${PN} += "python-abi"

inherit rpm
