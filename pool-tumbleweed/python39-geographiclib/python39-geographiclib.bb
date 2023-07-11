SUMMARY = "Python geodesic routines"
DESCRIPTION = "This is a Python implementation of the geodesic routines from GeographicLib. \
 \
This contains implementations of the classes Math, Accumulator, Geodesic, \
GeodesicLine and PolygonArea."
LICENSE = "MIT"

PV = "1.50"

RPM_NAME = "python39-geographiclib-1.50-2.1.noarch.rpm"
RPM_HASH = "39e4258fce1e8999743383812fc484491ebfcbe4aa55c36ad06b4531362e6a1ee6858b776970968ff13d85e5df93168e1c4d4b5471f0116a909732f1f8e8f34c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-geographiclib \
python39-geographiclib \
python3dist-geographiclib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
