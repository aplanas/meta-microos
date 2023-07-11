SUMMARY = "Library for ESRI Shapefile Handling"
DESCRIPTION = "The Shapefile C Library provides the ability to write simple C programs for \
reading, writing and updating (to a limited extent) ESRI Shapefiles, and the \
associated attribute file (.dbf). \
 \
This package contains the executable programs."
LICENSE = "GPL-2.0-or-later & (LGPL-2.0-or-later | MIT) & SUSE-Public-Domain"

PV = "1.5.0"

RPM_NAME = "shapelib-1.5.0-2.8.aarch64.rpm"
RPM_HASH = "f112554e8407ee0f4cc781158bb4b8af12c15e44c5521eb8dc63ec3234c5bfe139bcc0ae0554c86386f670b6d2c729fb37ad5895975d0a08684b21cc9d1fc272"

RPROVIDES:${PN} += "shapelib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libshp.so.2 \
libstdc++.so.6"

inherit rpm
