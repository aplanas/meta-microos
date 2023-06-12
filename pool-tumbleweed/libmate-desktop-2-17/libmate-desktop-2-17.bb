SUMMARY = "Library with common API for various MATE modules"
DESCRIPTION = "This package contains the library with common API for various \
MATE modules."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.26.1"

RPM_NAME = "libmate-desktop-2-17-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "ed01a2fc7a3f9e9e62046f598902a38d462b2b0371ba6b39bf8501e67611262bcbe12149c9e7adce7a0af36ec3dc84b20f827c9e77d1064e1634fe6026f87eb6"

RPROVIDES:${PN} += "libmate-desktop-2-17 \
libmate-desktop-2-17(aarch-64) \
libmate-desktop-2.so.17()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcairo.so.2()(64bit) \
libdconf.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libstartup-notification-1.so.0()(64bit) \
mate-desktop-gschemas"

inherit rpm
