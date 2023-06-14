SUMMARY = "Small X11 menu intended to be used with openbox and tint2"
DESCRIPTION = "jgmenu is a simple X11 menu intended to be used with tint2 and openbox."
LICENSE = "GPL-2.0-only"

PV = "4.4.1"

RPM_NAME = "jgmenu-4.4.1-1.2.aarch64.rpm"
RPM_HASH = "7f703e5b87f045c3c80ad11573384130c1728328e6260121c13d4dca3e171b65d38b579649af3da12b3a6eb732860bc6b3d2769aee84c9381d31f2c359ccecdc"

RPROVIDES:${PN} += "jgmenu"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
librsvg-2.so.2 \
libxml2.so.2 \
typelib-GLib \
typelib-Gtk"

inherit rpm
