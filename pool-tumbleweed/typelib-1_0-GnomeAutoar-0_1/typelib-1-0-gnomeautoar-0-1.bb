SUMMARY = "Automatic archives creating and extracting library -- Introspection bindings"
DESCRIPTION = "gnome-autoar provides functions, widgets, and gschemas for GNOME applications which want \
to use archives as a method to transfer directories over the Internet."
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.4"

RPM_NAME = "typelib-1_0-GnomeAutoar-0_1-0.4.4-1.2.aarch64.rpm"
RPM_HASH = "c957e507c19fdbd0727044ca6d8fa70538c914f5146b14387aff97e0a9d4a9e0c15323b83e831c682869206e4153a05e57892e7eed11dd3a78fecc3e3285c4a4"

RPROVIDES:${PN} += "typelib-1-0-GnomeAutoar-0-1 \
typelib-GnomeAutoar"

RDEPENDS:${PN} += "libgnome-autoar-0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
