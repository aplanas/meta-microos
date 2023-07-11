SUMMARY = "Python 3 port of sgmllib"
DESCRIPTION = "Python 3 port of Python 2's standard library `sgmllib`."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "1.0.0"

RPM_NAME = "python311-sgmllib3k-1.0.0-5.1.noarch.rpm"
RPM_HASH = "34ecc7e4ca6a7e6025a60ef3f7055052f1ce77b02ba2e4e80e1ac7d3e55ebd327da578945673448e1bd09582164b74519bf1199f3cdceeadfcbe8412ee5d0e2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sgmllib3k \
python3.11dist-sgmllib3k \
python311-sgmllib3k \
python3dist-sgmllib3k"

RDEPENDS:${PN} += "python-abi"

inherit rpm
