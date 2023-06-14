SUMMARY = "GNOME Software Store - PackageKit plugin"
DESCRIPTION = "This subpackage provides the packagekit plugin used by \
the GNOME software store."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-software-plugin-packagekit-44.2-1.1.aarch64.rpm"
RPM_HASH = "a3e090a3ae253a9bf15ccf4c95071f045aab63057c33059d3ea66814206fabddcd30d5caa8c582c3ca48538ff95fb59d1c9633872fc1c4bb11eb2620e5eeae9b"

RPROVIDES:${PN} += "gnome-software-plugin-packagekit \
libgs-plugin-appstream.so \
libgs-plugin-packagekit.so"

RDEPENDS:${PN} += "-libzypp-plugin-appdata if PackageKit-backend-zypp \
PackageKit \
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
