SUMMARY = "Python 3 port of sgmllib"
DESCRIPTION = "Python 3 port of Python 2's standard library `sgmllib`."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "1.0.0"

RPM_NAME = "python310-sgmllib3k-1.0.0-4.6.noarch.rpm"
RPM_HASH = "e277bce4868cd3d270a00b26a010238744b2ae419b787cf2f8000e27dd1eaf3d5b229f7531ca1d7183af9ab438fe9e4d40e0ec28f7d144f5037f7aa4bf1656d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sgmllib3k \
python3.10dist(sgmllib3k) \
python310-sgmllib3k \
python3dist(sgmllib3k)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
