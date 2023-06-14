SUMMARY = "Clipboard management system for GNOME"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "gpaste-43.2+6-2.1.aarch64.rpm"
RPM_HASH = "2893995a686818bde63ce3910cac8fb389b22bc0a182744bd031b360439971e23a7c98ca81367dc3e4eb89c0624b6fc111c1afc6140152fe053609ec98dd2441"

RPROVIDES:${PN} += "gpaste"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libadwaita-1.so.0 \
libc.so.6 \
libgcr-4.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpaste-2.so.0 \
libgpaste-gtk-3.so.0 \
libgpaste-gtk4.so.0 \
libgtk-3.so.0 \
libgtk-4.so.1"

inherit rpm
