SUMMARY = "A library for geohash encoding, decoding and associated functions"
DESCRIPTION = "A Python library for geohash encoding, decoding and finding neighbour cells. \
This is a Python port of Chris Veness's Javascript implementation, \
https://www.movable-type.co.uk/scripts/geohash.html ."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "python310-geolib-1.0.7-2.20.noarch.rpm"
RPM_HASH = "cda25c7811217afccf7bfe14df06ef5fb8d930fed84b1d07ef74e55e844ce336204fd35af4d44dc9917b43256fca9b724b2d30573cd66eef7b44cfeff09da056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-geolib \
python310-geolib \
python3dist-geolib"

RDEPENDS:${PN} += "python-abi \
python310-future"

inherit rpm
