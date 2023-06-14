SUMMARY = "A file manager for the GNOME desktop environment"
DESCRIPTION = "GNOME Commander is a 'two-pane' graphical file manager for the Linux \
desktop using GNOME libraries. In addition to basic file manager \
functions, the program is also an FTP client and can browse SMB \
networks."
LICENSE = "GPL-2.0-or-later"

PV = "1.16.0"

RPM_NAME = "gnome-commander-1.16.0-2.3.aarch64.rpm"
RPM_HASH = "b99b56d666d218aa406644416b5900a453969c069fc62d135246de51829e3d94727c16c2201338abb1ba4812912d961cc2f6079617c83c7c137f2328990aafad"

RPROVIDES:${PN} += "gnome-commander \
gnome-commander-doc \
libfilerollerplugin.so \
libtestplugin.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.27 \
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
