SUMMARY = "Library for ESRI Shapefile Handling"
DESCRIPTION = "The Shapefile C Library provides the ability to write simple C programs for \
reading, writing and updating (to a limited extent) ESRI Shapefiles, and the \
associated attribute file (.dbf). \
 \
This package contains the dynamic link library for shapelib project."
LICENSE = "GPL-2.0-or-later & (LGPL-2.0-or-later | MIT) & SUSE-Public-Domain"

PV = "1.5.0"

RPM_NAME = "libshp2-1.5.0-2.7.aarch64.rpm"
RPM_HASH = "94d05afb775672a1acbd898f9834b73b4f189395676697f2259df278acf1c55b7c592894c64b167e3750e16e1ec8bbf7be33edc112b003bdee83c19178a3927c"

RPROVIDES:${PN} += "libshp.so.2()(64bit) \
libshp2 \
libshp2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
