SUMMARY = "Small X11 menu intended to be used with openbox and tint2"
DESCRIPTION = "jgmenu is a simple X11 menu intended to be used with tint2 and openbox."
LICENSE = "GPL-2.0-only"

PV = "4.4.1"

RPM_NAME = "jgmenu-4.4.1-1.2.aarch64.rpm"
RPM_HASH = "7f703e5b87f045c3c80ad11573384130c1728328e6260121c13d4dca3e171b65d38b579649af3da12b3a6eb732860bc6b3d2769aee84c9381d31f2c359ccecdc"

RPROVIDES:${PN} += "application() \
application(jgmenu.desktop) \
jgmenu \
jgmenu(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
librsvg-2.so.2()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
typelib(GLib) \
typelib(Gtk)"

inherit rpm
