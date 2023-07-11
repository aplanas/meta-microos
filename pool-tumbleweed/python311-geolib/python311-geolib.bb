SUMMARY = "A library for geohash encoding, decoding and associated functions"
DESCRIPTION = "A Python library for geohash encoding, decoding and finding neighbour cells. \
This is a Python port of Chris Veness's Javascript implementation, \
https://www.movable-type.co.uk/scripts/geohash.html ."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "python311-geolib-1.0.7-2.20.noarch.rpm"
RPM_HASH = "6822d2fb0ff41eb3762e6a248c032e20cdc34afdf49cad7292eddd77589b336d46abe3656a468024a53d49c2e62ca01b0deb8969c5c44bec07c7f30736ea6829"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geolib \
python3.11dist-geolib \
python311-geolib \
python3dist-geolib"

RDEPENDS:${PN} += "python-abi \
python311-future"

inherit rpm
