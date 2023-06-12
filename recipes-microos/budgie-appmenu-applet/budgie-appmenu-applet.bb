SUMMARY = "Application Menu plugin for budgie"
DESCRIPTION = "This is Global Menu plugin for using with BUDGIE Panel."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "budgie-appmenu-applet-0.7.6-1.6.aarch64.rpm"
RPM_HASH = "344df38802a7e7bfd179c9882a35e64e9a37f1447cf663155878a580d1326cedd329e7ae4ca6efbbf57678914ec93ef86118d1e9c9c0977b8824b435ab49053e"

RPROVIDES:${PN} += "budgie-appmenu-applet \
budgie-appmenu-applet(aarch-64) \
libappmenu-budgie.so()(64bit)"
RDEPENDS:${PN} += "libbudgie-plugin.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
libwnck-3.so.0()(64bit)"

inherit rpm
