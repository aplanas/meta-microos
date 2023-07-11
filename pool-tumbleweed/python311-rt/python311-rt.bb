SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.0.4"

RPM_NAME = "python311-rt-3.0.4-1.5.noarch.rpm"
RPM_HASH = "98f821b259223024e424ea8687d1669c5ab68c7671e49c4c62bbb2324e04ce46963462359a0761b8b3fda0f2ef35db6767e54993a4e5ca64e5a23a4aab6043b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rt \
python3.11dist-rt \
python311-rt \
python3dist-rt"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-six"

inherit rpm
