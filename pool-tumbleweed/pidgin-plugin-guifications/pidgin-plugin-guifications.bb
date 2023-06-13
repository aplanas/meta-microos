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
pidgin-plugin-guifications \
pidgin-plugin-guifications(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit) \
libpurple.so.0()(64bit) \
pidgin"

inherit rpm
