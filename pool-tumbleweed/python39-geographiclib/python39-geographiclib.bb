SUMMARY = "Python geodesic routines"
DESCRIPTION = "This is a Python implementation of the geodesic routines from GeographicLib. \
 \
This contains implementations of the classes Math, Accumulator, Geodesic, \
GeodesicLine and PolygonArea."
LICENSE = "MIT"

PV = "1.50"

RPM_NAME = "python39-geographiclib-1.50-1.8.noarch.rpm"
RPM_HASH = "1d97a898fa8a601b69ef8129acf0a594ba66630fa10b3565677d1df464751003c5c87346ca1f388247cb0a26df46bcf60a5b170c53f73f88c56b63b4bf964619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-geographiclib \
python39-geographiclib \
python3dist-geographiclib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
