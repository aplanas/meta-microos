SUMMARY = "Python bindings and utilities for GeoJSON"
DESCRIPTION = "This library contains functions for encoding and decoding GeoJSON formatted \
data, classes for all GeoJSON Objects and an implementation of the Python \
geo interface specification."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python39-geojson-2.5.0-1.9.noarch.rpm"
RPM_HASH = "9c80e2c45ab8ff686fa370d60efe6c758859e4e7de4119fded2893f7bf6ff9a4875d48a524b70731ddde7157f0fbc7219b55dd669e5cc88815a3805fdf52d979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-geojson \
python39-geojson \
python3dist-geojson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
