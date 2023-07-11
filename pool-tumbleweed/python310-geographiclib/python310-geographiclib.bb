SUMMARY = "Python geodesic routines"
DESCRIPTION = "This is a Python implementation of the geodesic routines from GeographicLib. \
 \
This contains implementations of the classes Math, Accumulator, Geodesic, \
GeodesicLine and PolygonArea."
LICENSE = "MIT"

PV = "1.50"

RPM_NAME = "python310-geographiclib-1.50-2.1.noarch.rpm"
RPM_HASH = "1da2f95c4e3ea04ee964a0197042d74a082500b9f478b2e92c8224cdf2965c4c0dbca86ac4a2921483b0e10a1ae95024b8825a23e8603d6ba74eb24ffc6d0445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-geographiclib \
python310-geographiclib \
python3dist-geographiclib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
