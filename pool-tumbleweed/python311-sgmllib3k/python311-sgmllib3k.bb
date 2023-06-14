SUMMARY = "Python 3 port of sgmllib"
DESCRIPTION = "Python 3 port of Python 2's standard library `sgmllib`."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "1.0.0"

RPM_NAME = "python311-sgmllib3k-1.0.0-4.6.noarch.rpm"
RPM_HASH = "da5b8277a061d97efcaeca747252bde2d4cd5ad0babc066fccd9d3d1d7b4888a558cc15c8aa96382e09fec8c1b73d41cce0f5559a9d92ab38df8900dc2a227bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sgmllib3k \
python311-sgmllib3k \
python3dist-sgmllib3k"

RDEPENDS:${PN} += "python-abi"

inherit rpm
