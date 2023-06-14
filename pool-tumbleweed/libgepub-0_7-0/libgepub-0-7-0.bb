SUMMARY = "EPUB document reader library"
DESCRIPTION = "A GObject-based library for handling and rendering EPUB documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.0"

RPM_NAME = "libgepub-0_7-0-0.7.0-1.3.aarch64.rpm"
RPM_HASH = "198aac9e132c90f0eedbd7238273fb3f1e545a4704ebba0257af2e32da727fe671a9c91e51cec7fd85389b74fb43aac92520b5b57bd71a12e0c00ce842e99086"

RPROVIDES:${PN} += "libgepub-0-7-0 \
libgepub-0.7.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjavascriptcoregtk-4.1.so.0 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.2"

inherit rpm
