SUMMARY = "Spherical mercator tile and coordinate utilities"
DESCRIPTION = "The mercantile module provides ul(xtile, ytile, zoom) and bounds(xtile, ytile, zoom) \
functions that respectively return the upper left corner and bounding longitudes and \
latitudes for XYZ tiles, a xy(lng, lat) function that returns spherical mercator \
x and y coordinates, a tile(lng, lat, zoom) function that returns the tile containing \
a given point, and quadkey conversion functions quadkey(xtile, ytile, zoom) and \
quadkey_to_tile(quadkey) for translating between quadkey and tile coordinates."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python311-mercantile-1.2.1-1.4.noarch.rpm"
RPM_HASH = "6c8651116d49f2aa27c489b035fce7102f9bf74f4d770b251664ef7879fc624512f2f397c07eca2aeee6486f58519baf2104caed3178a779197c4165e468c1b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mercantile) \
python311-mercantile \
python3dist(mercantile)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-click \
update-alternatives"

inherit rpm
