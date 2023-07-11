SUMMARY = "Development package for libgpg-error"
DESCRIPTION = "Files needed for software development using libgpg-error."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.47"

RPM_NAME = "libgpg-error-devel-1.47-1.2.aarch64.rpm"
RPM_HASH = "6a705b194e5bf241484c2e02560166ead4fbde5fb3fa6ca25a1248b243107862b9dc392d2cd81a744bbd5dbe2fc8ec10a06b9b1eee95c483fa205a8637dfd59c"

RPROVIDES:${PN} += "libgpg-error-devel \
pkgconfig-gpg-error"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
info \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgpg-error.so.0 \
libgpg-error0"

inherit rpm
