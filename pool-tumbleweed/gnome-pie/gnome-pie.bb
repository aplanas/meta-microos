SUMMARY = "A circular application launcher for GNOME"
DESCRIPTION = "GNOME-Pie is a circular application launcher (pie menu). \
It is made of several pies, each consisting of multiple slices. \
The user presses a key stroke which opens the desired pie. By \
activating one of its slices, applications may be launched, key \
presses may be simulated or files can be opened."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "gnome-pie-0.7.3-1.5.aarch64.rpm"
RPM_HASH = "b69ef190fd4123b3ff14a0560b012a48f9e68cf161bb0a7dd50ea3d51ca013b42dbd5ae88a722af10cf696da5b6bb9967a5c81c729118e5e556d897037c14993"

RPROVIDES:${PN} += "gnome-pie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libappindicator3.so.1 \
libarchive.so.13 \
libbamf3.so.2 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-menu-3.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwnck-3.so.0 \
libxml2.so.2"

inherit rpm
