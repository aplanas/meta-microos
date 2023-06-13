SUMMARY = "A lightweight X11 desktop panel and task manager"
DESCRIPTION = "tint2 is a simple panel/taskbar made for modern X window managers. It was \
specifically made for Openbox3 but should also work with other window managers."
LICENSE = "GPL-2.0-only"

PV = "17.0.2"

RPM_NAME = "tint2-17.0.2-1.7.aarch64.rpm"
RPM_HASH = "ba33ac95019022f5c280fe6fb1a81a9a61f213f4eaac6aa9b04cde817e77c2fd19a4bdee332fedc50e7c762b04efe9f856096be8de984439d2677a6555f5a2e4"

RPROVIDES:${PN} += "application() \
application(tint2.desktop) \
application(tint2conf.desktop) \
config(tint2) \
mimehandler(application/x-tint2-theme) \
tint2 \
tint2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libImlib2.so.1()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXrender.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
librsvg-2.so.2()(64bit) \
libstartup-notification-1.so.0()(64bit)"

inherit rpm
