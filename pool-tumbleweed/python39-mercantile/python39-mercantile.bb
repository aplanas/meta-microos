SUMMARY = "Spherical mercator tile and coordinate utilities"
DESCRIPTION = "The mercantile module provides ul(xtile, ytile, zoom) and bounds(xtile, ytile, zoom) \
functions that respectively return the upper left corner and bounding longitudes and \
latitudes for XYZ tiles, a xy(lng, lat) function that returns spherical mercator \
x and y coordinates, a tile(lng, lat, zoom) function that returns the tile containing \
a given point, and quadkey conversion functions quadkey(xtile, ytile, zoom) and \
quadkey_to_tile(quadkey) for translating between quadkey and tile coordinates."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python39-mercantile-1.2.1-1.6.noarch.rpm"
RPM_HASH = "3163fa14ad98b7e6cb988703e52d00e143fc3e579c481176a7b1ba9e94c04eb3f689808e28f07af5fcdb3c386756c2de0c30b866c6da2380ecb6a52087055372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mercantile \
python39-mercantile \
python3dist-mercantile"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
update-alternatives"

inherit rpm
