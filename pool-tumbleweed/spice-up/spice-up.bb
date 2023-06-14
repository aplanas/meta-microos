SUMMARY = "Desktop presentation application"
DESCRIPTION = "Spice-up is a desktop presentation application \
based upon SpiceOfDesign's presentation concept."
LICENSE = "GPL-3.0-only"

PV = "1.9.1"

RPM_NAME = "spice-up-1.9.1-1.7.aarch64.rpm"
RPM_HASH = "4a150dc382cf01b548e4e4287449f6846205e3a1419990ddff47562f974833060498c052160e04d62f473fbca294321ba880612ef1279263651c7914ffe2304d"

RPROVIDES:${PN} += "spice-up"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libevdev.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0"

inherit rpm
