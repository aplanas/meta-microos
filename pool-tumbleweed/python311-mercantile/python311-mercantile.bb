SUMMARY = "Spherical mercator tile and coordinate utilities"
DESCRIPTION = "The mercantile module provides ul(xtile, ytile, zoom) and bounds(xtile, ytile, zoom) \
functions that respectively return the upper left corner and bounding longitudes and \
latitudes for XYZ tiles, a xy(lng, lat) function that returns spherical mercator \
x and y coordinates, a tile(lng, lat, zoom) function that returns the tile containing \
a given point, and quadkey conversion functions quadkey(xtile, ytile, zoom) and \
quadkey_to_tile(quadkey) for translating between quadkey and tile coordinates."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python311-mercantile-1.2.1-1.6.noarch.rpm"
RPM_HASH = "6eea86c5407ac2459c66c354213d535a601db6046fcecc791860500e59bff8937ac87b99872d3ec68374caa5bbf634d1961328fe084e6a5740120ecd3c348dfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mercantile \
python3.11dist-mercantile \
python311-mercantile \
python3dist-mercantile"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
update-alternatives"

inherit rpm
