SUMMARY = "Spherical mercator tile and coordinate utilities"
DESCRIPTION = "The mercantile module provides ul(xtile, ytile, zoom) and bounds(xtile, ytile, zoom) \
functions that respectively return the upper left corner and bounding longitudes and \
latitudes for XYZ tiles, a xy(lng, lat) function that returns spherical mercator \
x and y coordinates, a tile(lng, lat, zoom) function that returns the tile containing \
a given point, and quadkey conversion functions quadkey(xtile, ytile, zoom) and \
quadkey_to_tile(quadkey) for translating between quadkey and tile coordinates."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python310-mercantile-1.2.1-1.4.noarch.rpm"
RPM_HASH = "fbc8b960274348ddfe821cdaa3fb9ce9d2951970c977ea75fa69700804b49f62e5fc12df013621e369084aa67ce9e214f52a40cddacc4da7a235441a5b300153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mercantile \
python3.10dist(mercantile) \
python310-mercantile \
python3dist(mercantile)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-click \
update-alternatives"

inherit rpm
