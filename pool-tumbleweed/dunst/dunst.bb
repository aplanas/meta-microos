SUMMARY = "A customizable notification daemon"
DESCRIPTION = "Dunst is a customizable replacement for the notification daemons \
provided by most desktop environments."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "dunst-1.9.1-1.2.aarch64.rpm"
RPM_HASH = "a504936236979606d98ed48bbdaf942eff7a712399d38622ed7380d962113bbbff69635b875b554892b0f0715d38dcef8e9b98653c22b0be8a89b6b1a2d040aa"

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
