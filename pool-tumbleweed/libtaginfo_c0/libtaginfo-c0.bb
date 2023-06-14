SUMMARY = "Library for reading media metadata (tags)"
DESCRIPTION = "libtaginfo is a convenience wrapper for taglib with C and vala \
bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.1"

RPM_NAME = "libtaginfo_c0-0.2.1-2.4.aarch64.rpm"
RPM_HASH = "b7495687618cff5f8dbd3fcc9fe7fde347caad4ea9d883476126ec076b5458045a989f26378b2c09d851d39b086ce8e7a161f5b935881dd8b8a2c83cce32fa9f"

RPROVIDES:${PN} += "libtaginfo-c.so.0 \
libtaginfo-c0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag.so.1 \
libtaginfo.so.1"

inherit rpm
