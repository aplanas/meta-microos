SUMMARY = "INIH dynamic libary files"
DESCRIPTION = "INI Not Invented Here is a simple parser for .INI files written in C and mostly \
compatible with Python's ConfigParser. \
 \
This package provides the library for use at runtime by applications using INIH."
LICENSE = "BSD-3-Clause"

PV = "57"

RPM_NAME = "libinih0-57-1.1.aarch64.rpm"
RPM_HASH = "4a05085830cc5953ed7eb0ff570a357a226f4d1fba98b1bed7b19b8a053934996801242271e72f97d21bcf67ff2ed554363ac82fe346c7d3dfe3ca5c492ffd92"

RPROVIDES:${PN} += "libINIReader.so.0 \
libinih.so.0 \
libinih0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
