SUMMARY = "Chinese input method server"
DESCRIPTION = "gcin is a Chinese input method server for traditional Chinese. \
It features a better GTK user interface."
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "gcin-2.9.0-4.16.aarch64.rpm"
RPM_HASH = "e7ca8089bf178b7b122658f8caf1497190fc4c86c6aa4ea176e68e32a528b53c68b2e4c6c1c34dee2da18066f34a122ebe21d17944d0fad76cbdf0d74d670e7f"

RPROVIDES:${PN} += "gcin \
locale-zh-TW;zh-HK;zh-MO"

RDEPENDS:${PN} += "/bin/bash \
gcin-branding \
gcin-gtk2 \
gcin-gtk3 \
gcin-qt5 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libgcin-im-client.so.1 \
libgcin-im-client1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
