SUMMARY = "Pidgin plugin to display 'toaster' popups"
DESCRIPTION = "Guifications is a Pidgin plugin that displays 'toaster' popups in a \
user-defined corner of the screen, similar to features to be seen \
in other common messenger clients. It's highly configurable, easy \
to use, and has theme support. It really is the end-all, be-all \
toaster pop-up plugin for Pidgin!"
LICENSE = "GPL-2.0+"

PV = "2.16"

RPM_NAME = "pidgin-plugin-guifications-2.16-10.27.aarch64.rpm"
RPM_HASH = "1585970cc0270a5ce5b173c87b8d3dd4332cfc0147eb24f0b067bdfadfb60974cfd966f2a140d7b1a26c0837d6f3dd92c6da876c3121f4de8c637cce69628177"

RPROVIDES:${PN} += "pidgin-guifications \
pidgin-plugin-guifications"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpurple.so.0 \
pidgin"

inherit rpm
