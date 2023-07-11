SUMMARY = "Utilities to deal with geospatial links"
DESCRIPTION = "Python implementation of Cat-Interop utilities for geospatial links."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-geolinks-0.2.0-1.15.noarch.rpm"
RPM_HASH = "f173e9e70518bbbc67fce751710d47dc4f46884f3823f518de0611c596295cc1f5afd82f14ad4f1e5de78b798b8d95e4c56df021e84dda3b2697a19f6370abfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-geolinks \
python310-geolinks \
python3dist-geolinks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
