SUMMARY = "Python bindings and utilities for GeoJSON"
DESCRIPTION = "This library contains functions for encoding and decoding GeoJSON formatted \
data, classes for all GeoJSON Objects and an implementation of the Python \
geo interface specification."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python310-geojson-2.5.0-1.9.noarch.rpm"
RPM_HASH = "357aaf3b55a5f35df40e836e729581b2206f3e60f2cd74d62bb912083e901e576efe5f53800ba6888b003ca103a93f897f750154ceb9079140d45d83948305f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-geojson \
python310-geojson \
python3dist-geojson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
