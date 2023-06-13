SUMMARY = "GNOME Software Store - PackageKit plugin"
DESCRIPTION = "This subpackage provides the packagekit plugin used by \
the GNOME software store."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-software-plugin-packagekit-44.2-1.1.aarch64.rpm"
RPM_HASH = "a3e090a3ae253a9bf15ccf4c95071f045aab63057c33059d3ea66814206fabddcd30d5caa8c582c3ca48538ff95fb59d1c9633872fc1c4bb11eb2620e5eeae9b"

RPROVIDES:${PN} += "gnome-software-plugin-packagekit \
gnome-software-plugin-packagekit(aarch-64) \
libgs_plugin_appstream.so()(64bit) \
libgs_plugin_packagekit.so()(64bit)"

RDEPENDS:${PN} += "(libzypp-plugin-appdata if PackageKit-backend-zypp) \
PackageKit \
gnome-software \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libappstream.so.4()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnomesoftware.so.20()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpackagekit-glib2.so.18()(64bit) \
libxmlb.so.2()(64bit) \
libxmlb.so.2(LIBXMLB_0.1.0)(64bit) \
libxmlb.so.2(LIBXMLB_0.1.1)(64bit) \
libxmlb.so.2(LIBXMLB_0.1.2)(64bit) \
libxmlb.so.2(LIBXMLB_0.1.3)(64bit) \
libxmlb.so.2(LIBXMLB_0.1.7)(64bit) \
libxmlb.so.2(LIBXMLB_0.3.1)(64bit)"

inherit rpm
