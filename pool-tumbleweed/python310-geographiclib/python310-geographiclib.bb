SUMMARY = "Python geodesic routines"
DESCRIPTION = "This is a Python implementation of the geodesic routines from GeographicLib. \
 \
This contains implementations of the classes Math, Accumulator, Geodesic, \
GeodesicLine and PolygonArea."
LICENSE = "MIT"

PV = "1.50"

RPM_NAME = "python310-geographiclib-1.50-1.8.noarch.rpm"
RPM_HASH = "3fb6304c0b523b8bd58eb1c5a960b5329aac4710208a230ecdcfe8e37a39a9b7c206fe7d0ccbb6aa0a2d031dcb8ff30ad46cfe148a4c3a301fea3c8af9306e96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geographiclib \
python3.10dist-geographiclib \
python310-geographiclib \
python3dist-geographiclib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
