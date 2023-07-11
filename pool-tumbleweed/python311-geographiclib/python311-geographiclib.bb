SUMMARY = "Python geodesic routines"
DESCRIPTION = "This is a Python implementation of the geodesic routines from GeographicLib. \
 \
This contains implementations of the classes Math, Accumulator, Geodesic, \
GeodesicLine and PolygonArea."
LICENSE = "MIT"

PV = "1.50"

RPM_NAME = "python311-geographiclib-1.50-2.1.noarch.rpm"
RPM_HASH = "5b98a9b77ea28f30e939b55762454006731e6377009bde96231420349448e0eb436a870a9595455f8c989aed56ed7afbee4ba00b6dffe2bcb9b94c15857c0591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geographiclib \
python3.11dist-geographiclib \
python311-geographiclib \
python3dist-geographiclib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
