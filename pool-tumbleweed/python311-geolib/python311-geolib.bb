SUMMARY = "A library for geohash encoding, decoding and associated functions"
DESCRIPTION = "A Python library for geohash encoding, decoding and finding neighbour cells. \
This is a Python port of Chris Veness's Javascript implementation, \
https://www.movable-type.co.uk/scripts/geohash.html ."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "python311-geolib-1.0.7-2.18.noarch.rpm"
RPM_HASH = "d3d3a4026efadfc560b14a9ff7afc473d09e7226cf3024b15c9b82bc865080af32daa9f9e9421bd75dfd342a1f695f91b8b7358dd05c30d490efd8fd119401b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(geolib) \
python311-geolib \
python3dist(geolib)"
RDEPENDS:${PN} += "python(abi) \
python311-future"

inherit rpm
