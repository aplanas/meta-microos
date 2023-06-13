SUMMARY = "Desktop presentation application"
DESCRIPTION = "Spice-up is a desktop presentation application \
based upon SpiceOfDesign's presentation concept."
LICENSE = "GPL-3.0-only"

PV = "1.9.1"

RPM_NAME = "spice-up-1.9.1-1.7.aarch64.rpm"
RPM_HASH = "4a150dc382cf01b548e4e4287449f6846205e3a1419990ddff47562f974833060498c052160e04d62f473fbca294321ba880612ef1279263651c7914ffe2304d"

RPROVIDES:${PN} += "application() \
application(com.github.philip_scott.spice-up.desktop) \
metainfo() \
metainfo(com.github.philip_scott.spice-up.appdata.xml) \
mimehandler(application/x-spiceup) \
spice-up \
spice-up(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libevdev.so.2()(64bit) \
libevdev.so.2(LIBEVDEV_1)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
