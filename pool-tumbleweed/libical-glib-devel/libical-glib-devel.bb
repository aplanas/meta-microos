SUMMARY = "Development files for building against libical-glib"
DESCRIPTION = "Development files for building against libical-glib3"
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.16"

RPM_NAME = "libical-glib-devel-3.0.16-1.3.aarch64.rpm"
RPM_HASH = "e70774e94a7de121f091303b06898e4eb1952d2ebf5f33b5f017e5c5f18571223a23d3887a3322146e0279d3b3d8ee15ecfe9fbc9a630910b91779e80a8e86a4"

RPROVIDES:${PN} += "libical-glib-devel \
pkgconfig-libical-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libical-glib3 \
libxml2.so.2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libical \
typelib-1-0-ICal-3-0 \
typelib-1-0-ICalGLib-3-0"

inherit rpm
