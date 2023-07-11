SUMMARY = "Development files for building against libical-glib"
DESCRIPTION = "Development files for building against libical-glib3"
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.16"

RPM_NAME = "libical-glib-devel-3.0.16-1.4.aarch64.rpm"
RPM_HASH = "65c6eab3c29dca1ddcf68837c19393edcadf66e00c54fe452a609e7ee9cf08af468f9b6d41241afc7ccf0eefe17d15071dc93b1d1851929dbd9e988d37c42ab8"

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
