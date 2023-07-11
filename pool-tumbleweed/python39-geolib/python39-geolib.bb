SUMMARY = "A library for geohash encoding, decoding and associated functions"
DESCRIPTION = "A Python library for geohash encoding, decoding and finding neighbour cells. \
This is a Python port of Chris Veness's Javascript implementation, \
https://www.movable-type.co.uk/scripts/geohash.html ."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "python39-geolib-1.0.7-2.20.noarch.rpm"
RPM_HASH = "85620dca69f374b44166b52868e86658e7d3f80282c52a55cf95f49d66604be0cf8b4c9150a7bb63f7a27f2de538d2f9fca9071d172c4c11e1bf664075d69fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-geolib \
python39-geolib \
python3dist-geolib"

RDEPENDS:${PN} += "python-abi \
python39-future"

inherit rpm
