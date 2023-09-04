SUMMARY = "GNOME Software Store - PackageKit plugin"
DESCRIPTION = "This subpackage provides the packagekit plugin used by \
the GNOME software store."
LICENSE = "GPL-2.0-or-later"

PV = "44.4"

RPM_NAME = "gnome-software-plugin-packagekit-44.4-1.1.aarch64.rpm"
RPM_HASH = "25d03a992727493f33e2be27ff933ae535a630c7dcc5e360aaa07b2cfa7304328a62b9fa404be1f3a0e0fab75c88ca012e87b73fc07992add5ea92ff7e9cd746"

RPROVIDES:${PN} += "gnome-software-plugin-packagekit \
libgs-plugin-appstream.so \
libgs-plugin-packagekit.so"

RDEPENDS:${PN} += "PackageKit \
gnome-software \
ld-linux-aarch64.so.1 \
libappstream.so.4 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnomesoftware.so.20 \
libgobject-2.0.so.0 \
libpackagekit-glib2.so.18 \
libxmlb.so.2"

inherit rpm
