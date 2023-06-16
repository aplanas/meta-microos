SUMMARY = "A customizable notification daemon"
DESCRIPTION = "Dunst is a customizable replacement for the notification daemons \
provided by most desktop environments."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "dunst-1.9.1-1.1.aarch64.rpm"
RPM_HASH = "09c5a024643fc9b47d7d843b7786e6274fcdd02f8af82bb86d59f72c2d5a7b6166014262b131784a0d381027220b06a96796b4ac925fa5cdacef64ab4383b0b7"

RPROVIDES:${PN} += "config-dunst \
dunst"

RDEPENDS:${PN} += "/usr/bin/sh \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0"

inherit rpm
