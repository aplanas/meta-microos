SUMMARY = "Spherical mercator tile and coordinate utilities"
DESCRIPTION = "The mercantile module provides ul(xtile, ytile, zoom) and bounds(xtile, ytile, zoom) \
functions that respectively return the upper left corner and bounding longitudes and \
latitudes for XYZ tiles, a xy(lng, lat) function that returns spherical mercator \
x and y coordinates, a tile(lng, lat, zoom) function that returns the tile containing \
a given point, and quadkey conversion functions quadkey(xtile, ytile, zoom) and \
quadkey_to_tile(quadkey) for translating between quadkey and tile coordinates."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python39-mercantile-1.2.1-1.4.noarch.rpm"
RPM_HASH = "c7fb4771bb85e7a422d5fe1e863d52bdb06f3573ce229d797e2c575ee9240c2be1c73c30ac058587525fec76beb70e92a2af7e3ff10b3c1b902ccaeefd2641a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mercantile \
python39-mercantile \
python3dist-mercantile"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-click \
update-alternatives"

inherit rpm
