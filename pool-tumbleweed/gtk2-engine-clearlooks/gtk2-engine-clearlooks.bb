SUMMARY = "Clearlooks GTK+ 2 Theme Engine"
DESCRIPTION = "The Clearlooks engine was the default theme of GNOME 2 since 2.12. It is \
a modular engine providing multiple styles such as glossy and gummy."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-clearlooks-2.20.2-19.43.aarch64.rpm"
RPM_HASH = "974d962156f7fc8862e60106e3ce63b122a3b749169bbe348663c385bc7ac034b2f8a81158bcaee00e8235550d7ef6236885f484e0cc3ace49b2fcc01cdaaff2"

RPROVIDES:${PN} += "gtk2-engine-clearlooks \
libclearlooks.so"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
