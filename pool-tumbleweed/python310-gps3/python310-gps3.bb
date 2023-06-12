SUMMARY = "Python interface for gpsd"
DESCRIPTION = "Python interface for gpsd."
LICENSE = "MIT"

PV = "0.33.3+git.20171101"

RPM_NAME = "python310-gps3-0.33.3+git.20171101-1.19.noarch.rpm"
RPM_HASH = "44ec5dbe8a114ceeb16c32c821b496d66cd989e98d735a8709a81b133e63652cba4282d18dae0e57b3a9229c71874f99795073a0bdf17819a14655ef543be089"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gps3 \
python3.10dist(gps3) \
python310-gps3 \
python3dist(gps3)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
