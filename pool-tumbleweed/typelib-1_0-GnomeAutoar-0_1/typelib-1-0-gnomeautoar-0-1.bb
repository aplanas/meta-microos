SUMMARY = "Automatic archives creating and extracting library -- Introspection bindings"
DESCRIPTION = "gnome-autoar provides functions, widgets, and gschemas for GNOME applications which want \
to use archives as a method to transfer directories over the Internet."
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.4"

RPM_NAME = "typelib-1_0-GnomeAutoar-0_1-0.4.4-1.1.aarch64.rpm"
RPM_HASH = "6f31ed00a2a546432e84de05262f136bb5e291c59bdee687c12e63cf6c935f1a4eb26a975c302746fe565bc6e4962d800c8cb8ae2201774471f0897d40f02c5d"

RPROVIDES:${PN} += "typelib-1-0-GnomeAutoar-0-1 \
typelib-GnomeAutoar"

RDEPENDS:${PN} += "libgnome-autoar-0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
