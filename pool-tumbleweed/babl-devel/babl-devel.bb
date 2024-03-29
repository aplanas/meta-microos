SUMMARY = "Dynamic Pixel Format Translation Library"
DESCRIPTION = "babl is a dynamic, any to any, pixel format translation library."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.1.106"

RPM_NAME = "babl-devel-0.1.106-1.1.aarch64.rpm"
RPM_HASH = "7a5bc4efe541dc8fe9d65f20b5f436e3684698eb19472544d036d5053da9d52d84c214124f7a84e5d6e51dbf07cc1cef5f354c25780e45887db0742b5a3ed6aa"

RPROVIDES:${PN} += "babl-devel \
pkgconfig-babl-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
ld-linux-aarch64.so.1 \
libbabl-0-1-0 \
libbabl-0.1.so.0 \
libc.so.6 \
pkgconfig-lcms2 \
typelib-1-0-Babl-0-1"

inherit rpm
