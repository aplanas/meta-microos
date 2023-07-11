SUMMARY = "Utilities to deal with geospatial links"
DESCRIPTION = "Python implementation of Cat-Interop utilities for geospatial links."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-geolinks-0.2.0-1.15.noarch.rpm"
RPM_HASH = "8bc122a6a3772c2baaf8bfebfbc9082172f9f1edb39ed666f746701f11996d8ed2f875ccc5e7e11db915ef06b1ef99c760e83e7c3fb32f5a65c29d9ae9aff3e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geolinks \
python3.11dist-geolinks \
python311-geolinks \
python3dist-geolinks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
