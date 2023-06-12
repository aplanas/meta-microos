SUMMARY = "Python bindings and utilities for GeoJSON"
DESCRIPTION = "This library contains functions for encoding and decoding GeoJSON formatted \
data, classes for all GeoJSON Objects and an implementation of the Python \
geo interface specification."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python39-geojson-2.5.0-1.8.noarch.rpm"
RPM_HASH = "f0340f4518d1660c8dc758a3bc3ef7e1e1f4fe97b8395c3553652bfd6ac9467d8154e9c908eefe7a8d76ab7140617754902d9aa0af7ece240dbbc01110aa1697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(geojson) \
python39-geojson \
python3dist(geojson)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
