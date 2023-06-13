SUMMARY = "RocketChat protocol plugin for libpurple"
DESCRIPTION = "RocketChat protocol plugin for libpurple-based applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.0+git20220925"

RPM_NAME = "libpurple-plugin-rocketchat-0.0+git20220925-1.4.aarch64.rpm"
RPM_HASH = "cbf2daea00c91c4e3d6c39d4a122897ffd0aab9378e4db37b18f7db7e11000f6f5698f5f54f25325be444f7a0072d0eb082f5557cefc7fdabba1acc1f1615920"

RPROVIDES:${PN} += "libpurple-plugin-rocketchat \
libpurple-plugin-rocketchat(aarch-64) \
librocketchat.so()(64bit)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libmarkdown.so.3()(64bit) \
libpurple.so.0()(64bit)"

inherit rpm
