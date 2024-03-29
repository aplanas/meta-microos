SUMMARY = "LibCVC API"
DESCRIPTION = "Utility library for volume control of pulseaudio from gobject-based \
Cinnamon modules/applications."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.8.0"

RPM_NAME = "libcvc0-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "1f3b4069c9ec095c4ace65d5a4824f7f6a58c0fbd23dbdab9617e3e58ec1d36d1bf4118b08df62beda7a429e30605f3bad23ee796405d7e05b191096559db2ea"

RPROVIDES:${PN} += "libcvc.so.0 \
libcvc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0"

inherit rpm
