SUMMARY = "Python bindings and utilities for GeoJSON"
DESCRIPTION = "This library contains functions for encoding and decoding GeoJSON formatted \
data, classes for all GeoJSON Objects and an implementation of the Python \
geo interface specification."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python311-geojson-2.5.0-1.9.noarch.rpm"
RPM_HASH = "b45b483e5bbe2d63d7445641a1a24596d644c99ad58c727ed0a0d2230a9135adba0e23ad1d04e2a9eb948cb9ce490185fb6277ded540782976b6aab2af008ffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geojson \
python3.11dist-geojson \
python311-geojson \
python3dist-geojson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
