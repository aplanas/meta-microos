SUMMARY = "Clipboard management system for GNOME"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "gpaste-43.2+6-2.1.aarch64.rpm"
RPM_HASH = "2893995a686818bde63ce3910cac8fb389b22bc0a182744bd031b360439971e23a7c98ca81367dc3e4eb89c0624b6fc111c1afc6140152fe053609ec98dd2441"

RPROVIDES:${PN} += "application() \
application(org.gnome.GPaste.Preferences.desktop) \
application(org.gnome.GPaste.Ui.desktop) \
gpaste \
gpaste(aarch-64) \
metainfo() \
metainfo(org.gnome.GPaste.Ui.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6()(64bit) \
libgcr-4.so.4()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpaste-2.so.0()(64bit) \
libgpaste-2.so.0(LIBGPASTE_42)(64bit) \
libgpaste-gtk-3.so.0()(64bit) \
libgpaste-gtk-3.so.0(LIBGPASTE_GTK3_42)(64bit) \
libgpaste-gtk4.so.0()(64bit) \
libgpaste-gtk4.so.0(LIBGPASTE_GTK4_42)(64bit) \
libgtk-3.so.0()(64bit) \
libgtk-4.so.1()(64bit)"

inherit rpm
