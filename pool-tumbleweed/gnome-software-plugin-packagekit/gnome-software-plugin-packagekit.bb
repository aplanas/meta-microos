SUMMARY = "GNOME Software Store - PackageKit plugin"
DESCRIPTION = "This subpackage provides the packagekit plugin used by \
the GNOME software store."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "gnome-software-plugin-packagekit-44.3-1.1.aarch64.rpm"
RPM_HASH = "746e87345c5a511ad0a9fd56718dc8ba11c2b8f5562fdb0b38bca655f4a034d7b37136535da7fbb34208e716d87af8b2fe96fa9b23ca0491b078e8a42b4cc0f9"

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
