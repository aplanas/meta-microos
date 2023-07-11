SUMMARY = "Pure-python HTTP server"
DESCRIPTION = "Cheroot is the pure-Python HTTP server used by CherryPy."
LICENSE = "BSD-3-Clause"

PV = "9.0.0"

RPM_NAME = "python310-cheroot-9.0.0-4.3.noarch.rpm"
RPM_HASH = "bcb43d27c1979bf7f57add29b652db615e99be10d1e618ee21169008c09b8cbf0dc9f72c15d1ae2d52e3e181dc5a4eb9380e2cf7b6e8ae2585e7d6caa8bc31ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cheroot \
python310-Cheroot \
python310-cheroot \
python3dist-cheroot"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-jaraco.functools \
python310-more-itertools"

inherit rpm
