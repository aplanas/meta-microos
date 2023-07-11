SUMMARY = "Bar program for sway"
DESCRIPTION = "Bar program for sway."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "swaybar-1.8.1-2.2.aarch64.rpm"
RPM_HASH = "a7b0897705323a66ddfec8effbb391cfd1f48488a0ba787f5cc9a8b36a60484fc3a5c7f37baa98e533bf7582c1ede4d8ee9913a4ae7aca006e21abba34060de7"

RPROVIDES:${PN} += "swaybar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-c.so.5 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsystemd.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
sway"

inherit rpm
