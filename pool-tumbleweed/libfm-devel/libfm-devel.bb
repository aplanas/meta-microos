SUMMARY = "Devel files for libfm"
DESCRIPTION = "A glib/gio-based lib used to develop file managers providing some \
file management utilities and related-widgets missing in gtk+/glib."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfm-devel-1.3.2-1.13.aarch64.rpm"
RPM_HASH = "1941e2c8383ff859073b3cf9ecbf05e3efbf796ffc9950ace4ab098297a9ab7539d4edd5cae58fd176a7c1915d7c47ea9a829b883d75956e9d8a174c1ce0b031"

RPROVIDES:${PN} += "libfm-devel \
pkgconfig-libfm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfm \
libfm4 \
pkgconfig \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-libfm-extra"

inherit rpm
