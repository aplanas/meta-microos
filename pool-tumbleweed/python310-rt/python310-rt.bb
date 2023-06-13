SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.0.4"

RPM_NAME = "python310-rt-3.0.4-1.4.noarch.rpm"
RPM_HASH = "4ab7739ab4752d7ff2a512d0e3c5c72244ae70aa8378d54a08a2d8def1904649c35a437bdd62f50b6e2b1c97e261cde50fc06e597bfc0671c1354101c4498f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rt \
python3.10dist(rt) \
python310-rt \
python3dist(rt)"

RDEPENDS:${PN} += "python(abi) \
python310-requests \
python310-six"

inherit rpm
