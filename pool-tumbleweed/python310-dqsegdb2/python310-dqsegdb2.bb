SUMMARY = "Simplified python interface to the DQSEGDB API"
DESCRIPTION = "DQSEGDB2 is a simplified Python implementation of the DQSEGDB API \
as defined in LIGO-T1300625, providing a query interface for GET \
requests to DQSEGDB."
LICENSE = "GPL-3.0-only"

PV = "1.1.3"

RPM_NAME = "python310-dqsegdb2-1.1.3-1.1.noarch.rpm"
RPM_HASH = "577f241259c0afbbf0a092acda503d99d276c730defdd836fbe5c6092eb7cfb0d647a3a265979fdf13a7b1234de8e95a663efa5e32f394d5a2ac8c9f618ab71c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dqsegdb2 \
python3.10dist(dqsegdb2) \
python310-dqsegdb2 \
python3dist(dqsegdb2)"

RDEPENDS:${PN} += "python(abi) \
python310-gwdatafind \
python310-igwn-auth-utils \
python310-ligo-segments"

inherit rpm
