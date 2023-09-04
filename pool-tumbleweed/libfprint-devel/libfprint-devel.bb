SUMMARY = "Headers for the fingerprint reader library"
DESCRIPTION = "This package contains the header files and development documentation \
for libfprint. If you like to develop programs using libfprint, you \
will need to install this package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.6+tod1"

RPM_NAME = "libfprint-devel-1.94.6+tod1-1.1.aarch64.rpm"
RPM_HASH = "e7ff1ae49a0a29674c68880d14eb0f19db745ac6859f409954cde3c7d4351e85d4a0029444ff2d2d1073b77bf12601ad3e13cd92bb07e35dd8facea90c1ad284"

RPROVIDES:${PN} += "libfprint-devel \
pkgconfig-libfprint-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libfprint \
libfprint-2-2 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
