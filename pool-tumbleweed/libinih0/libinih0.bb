SUMMARY = "INIH dynamic libary files"
DESCRIPTION = "INI Not Invented Here is a simple parser for .INI files written in C and mostly \
compatible with Python's ConfigParser. \
 \
This package provides the library for use at runtime by applications using INIH."
LICENSE = "BSD-3-Clause"

PV = "56"

RPM_NAME = "libinih0-56-1.5.aarch64.rpm"
RPM_HASH = "28db40151c040c4a8ee4332982693c3dc1fb04a08e90b0d30eba7a891a94c9884b839872dfdad5e9b9e84eb995e39c15fc19a42b1d7d3259108252072a274683"

RPROVIDES:${PN} += "libINIReader.so.0 \
libinih.so.0 \
libinih0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
