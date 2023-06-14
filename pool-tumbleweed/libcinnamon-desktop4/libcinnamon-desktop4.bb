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
libcinnamon-desktop.so.4 \
libcinnamon-desktop4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2 \
libcinnamon-desktop-data \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libxkbfile.so.1"

inherit rpm
