SUMMARY = "Spherical mercator tile and coordinate utilities"
DESCRIPTION = "The mercantile module provides ul(xtile, ytile, zoom) and bounds(xtile, ytile, zoom) \
functions that respectively return the upper left corner and bounding longitudes and \
latitudes for XYZ tiles, a xy(lng, lat) function that returns spherical mercator \
x and y coordinates, a tile(lng, lat, zoom) function that returns the tile containing \
a given point, and quadkey conversion functions quadkey(xtile, ytile, zoom) and \
quadkey_to_tile(quadkey) for translating between quadkey and tile coordinates."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python310-mercantile-1.2.1-1.6.noarch.rpm"
RPM_HASH = "1bf4348c5a3ca4e754db4435471614c477d1b5e0eb12e57a5f123a58c8c9dfd674aedfee277e443d3555828a7fc8adad1bd1b27c285f2e363993bf9d8f95aeb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mercantile \
python310-mercantile \
python3dist-mercantile"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
update-alternatives"

inherit rpm
