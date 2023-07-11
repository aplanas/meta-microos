SUMMARY = "Python 3 port of sgmllib"
DESCRIPTION = "Python 3 port of Python 2's standard library `sgmllib`."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "1.0.0"

RPM_NAME = "python39-sgmllib3k-1.0.0-5.1.noarch.rpm"
RPM_HASH = "0dc2a1651b45263e3afc3d2bf565d18a1432081373a6da6d52e3423e2c210ac666409a3730088113226cf577f67317f7a9149237c296a6a3a1ec9cbec7415c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sgmllib3k \
python39-sgmllib3k \
python3dist-sgmllib3k"

RDEPENDS:${PN} += "python-abi"

inherit rpm
