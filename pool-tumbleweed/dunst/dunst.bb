SUMMARY = "A customizable notification daemon"
DESCRIPTION = "Dunst is a customizable replacement for the notification daemons \
provided by most desktop environments."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "dunst-1.9.1-1.1.aarch64.rpm"
RPM_HASH = "09c5a024643fc9b47d7d843b7786e6274fcdd02f8af82bb86d59f72c2d5a7b6166014262b131784a0d381027220b06a96796b4ac925fa5cdacef64ab4383b0b7"

RPROVIDES:${PN} += "config(dunst) \
dunst \
dunst(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXss.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit)"

inherit rpm
