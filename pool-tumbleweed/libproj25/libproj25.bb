SUMMARY = "Cartographic projection software"
DESCRIPTION = "This package the library for performing respective \
forward and inverse transformation of cartographic data to or from cartesian \
data with a wide range of selectable projection functions."
LICENSE = "MIT"

PV = "9.2.1"

RPM_NAME = "libproj25-9.2.1-1.1.aarch64.rpm"
RPM_HASH = "b498d33b299f97d9f09f5fe44a2d75f003275d05d8c75bc087757287d903cd89a420d9a50ffafe0262e5b1d6dda77c9e95cbb6bcb2286a719abc9f36cca7ef48"

RPROVIDES:${PN} += "libproj.so.25 \
libproj25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
