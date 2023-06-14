SUMMARY = "A lightweight X11 desktop panel and task manager"
DESCRIPTION = "tint2 is a simple panel/taskbar made for modern X window managers. It was \
specifically made for Openbox3 but should also work with other window managers."
LICENSE = "GPL-2.0-only"

PV = "17.0.2"

RPM_NAME = "tint2-17.0.2-1.7.aarch64.rpm"
RPM_HASH = "ba33ac95019022f5c280fe6fb1a81a9a61f213f4eaac6aa9b04cde817e77c2fd19a4bdee332fedc50e7c762b04efe9f856096be8de984439d2677a6555f5a2e4"

RPROVIDES:${PN} += "config-tint2 \
tint2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librsvg-2.so.2 \
libstartup-notification-1.so.0"

inherit rpm
