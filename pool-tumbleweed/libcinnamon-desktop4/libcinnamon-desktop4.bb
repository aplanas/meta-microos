SUMMARY = "Libcinnamon-desktop API"
DESCRIPTION = "cinnamon-desktop contains the libcinnamon-desktop library, the \
cinnamon-about program as well as some desktop-wide documents. \
 \
The libcinnamon-desktop library provides API shared by several \
applications on the desktop, but that cannot live in the platform \
for various reasons. There is no API or ABI guarantee, although we \
are doing our best to provide stability. Documentation for the API \
is available with gtk-doc."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.8.0"

RPM_NAME = "libcinnamon-desktop4-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "276c42eef5cba672936751a79c3d855c4c889ee1f9814b7e1c9f8011bb7518235804b3069e0e55b2357869c9b65dce400aaad7b28abf27efade036bba5c0d62f"

RPROVIDES:${PN} += "cinnamon-desktop \
libcinnamon-desktop \
libcinnamon-desktop.so.4()(64bit) \
libcinnamon-desktop4 \
libcinnamon-desktop4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcairo.so.2()(64bit) \
libcinnamon-desktop-data \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libxkbfile.so.1()(64bit)"

inherit rpm
