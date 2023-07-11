SUMMARY = "Library for ESRI Shapefile Handling"
DESCRIPTION = "The Shapefile C Library provides the ability to write simple C programs for \
reading, writing and updating (to a limited extent) ESRI Shapefiles, and the \
associated attribute file (.dbf). \
 \
This package contains the dynamic link library for shapelib project."
LICENSE = "GPL-2.0-or-later & (LGPL-2.0-or-later | MIT) & SUSE-Public-Domain"

PV = "1.5.0"

RPM_NAME = "libshp2-1.5.0-2.8.aarch64.rpm"
RPM_HASH = "f8d864c511cb267e4f4117b12edc605ced8d020e8f559eeb367647224b38464f3fe2e785f74a5832f19eda6be2aa65b6f7eda9f8428d4e35c0fcad28fbd39291"

RPROVIDES:${PN} += "libshp.so.2 \
libshp2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
