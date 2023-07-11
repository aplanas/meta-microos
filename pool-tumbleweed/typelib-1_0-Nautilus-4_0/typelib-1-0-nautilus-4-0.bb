SUMMARY = "File Manager for the GNOME Desktop -- Introspection bindings"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop. \
 \
This package provides the GObject Introspection bindings for the library \
used by nautilus extensions."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "typelib-1_0-Nautilus-4_0-44.2-2.1.aarch64.rpm"
RPM_HASH = "592e626d300e70f5e77fd52d281cf5e60c351066615632f90721d91f8148e20331192d8bd5e7beae22f64c0b45a2cbe8f86459f8ccf5c0d152bcbcfd301b6aa1"

RPROVIDES:${PN} += "typelib-1-0-Nautilus-4-0 \
typelib-Nautilus"

RDEPENDS:${PN} += "libnautilus-extension.so.4 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
