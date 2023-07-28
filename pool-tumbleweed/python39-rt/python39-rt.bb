SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.0.6"

RPM_NAME = "python39-rt-3.0.6-1.1.noarch.rpm"
RPM_HASH = "b1cfb344a5e263a4bd0921a04c33b4dfa20e3dbb55d0abeab7d306b40db32d1fa06572870c0c96823ae782b73995d21419f001e6d2ae1b51e89e78427a4232dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rt \
python39-rt \
python3dist-rt"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-six"

inherit rpm
