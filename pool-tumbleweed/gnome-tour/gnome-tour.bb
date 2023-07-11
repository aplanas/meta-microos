SUMMARY = "GNOME Tour & Greeter"
DESCRIPTION = "A guided tour and greeter for GNOME."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-tour-44.0-2.2.aarch64.rpm"
RPM_HASH = "81f30803aecdf704b6ea204402ea290e7226de85e34291017042b277ab131860035725e1831cf4e21c39d4139717d2398170daf17296288a67578f004eed9f1c"

RPROVIDES:${PN} += "gnome-tour"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
