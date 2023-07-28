SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.0.6"

RPM_NAME = "python310-rt-3.0.6-1.1.noarch.rpm"
RPM_HASH = "3cd2881e99f5886d1f3b90d6cd3d442a331611413b445f95323ed5bd4feb01a20f179fb9fd50c55c5da5c4b0caea36dda6d1cfb4702b554b3ceb0d1626d545f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rt \
python310-rt \
python3dist-rt"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-six"

inherit rpm
