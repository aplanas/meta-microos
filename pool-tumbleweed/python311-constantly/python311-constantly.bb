SUMMARY = "Symbolic constants in Python"
DESCRIPTION = "A library that provides symbolic constant support. \
It includes collections and constants with text, numeric, and bit flag values. \
Originally ``twisted.python.constants`` from the `Twisted <https://twistedmatrix.com/>`_ project."
LICENSE = "MIT"

PV = "15.1.0"

RPM_NAME = "python311-constantly-15.1.0-3.2.noarch.rpm"
RPM_HASH = "1dcc7a0403c6b0a6ac0c24bd923afbae412aecd519c021e9842933511e5e7d0c9fa4096edbae1e4843694bf7b96bb51bc5843e0b03d4d7f88d47b8721aaa623f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-constantly \
python3.11dist-constantly \
python311-constantly \
python3dist-constantly"

RDEPENDS:${PN} += "python-abi"

inherit rpm
