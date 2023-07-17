SUMMARY = "A file manager for the GNOME desktop environment"
DESCRIPTION = "GNOME Commander is a 'two-pane' graphical file manager for the Linux \
desktop using GNOME libraries. In addition to basic file manager \
functions, the program is also an FTP client and can browse SMB \
networks."
LICENSE = "GPL-2.0-or-later"

PV = "1.16.1"

RPM_NAME = "gnome-commander-1.16.1-1.1.aarch64.rpm"
RPM_HASH = "1f19a648b0747abd67295a2d2f5dbce8eaec485ef0e69db0eb5090333dcd138fea0a711668c98e65089cea18cc296d2413b219329f1aa7e1be194f0b5e89a7e5"

RPROVIDES:${PN} += "gnome-commander \
gnome-commander-doc \
libfilerollerplugin.so \
libtestplugin.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpoppler-glib.so.8 \
libstdc++.so.6 \
libtag.so.1"

inherit rpm
