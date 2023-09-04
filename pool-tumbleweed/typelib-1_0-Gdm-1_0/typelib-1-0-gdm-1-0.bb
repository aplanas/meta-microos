SUMMARY = "Introspection bindings for gdm"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays. \
 \
This package provides the GObject Introspection bindings for \
communicating with the GDM greeter server."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "typelib-1_0-Gdm-1_0-44.1-3.1.aarch64.rpm"
RPM_HASH = "f5f3832303d3c9232fdd5e9534ede2cc948e2c6dfa474c28b22ae6ef2542e83ebd68d9836d0a67900b9fe1da06ab71df6c008e680f4d9b5249133da97fa9d2b1"

RPROVIDES:${PN} += "typelib-1-0-Gdm-1-0 \
typelib-Gdm"

RDEPENDS:${PN} += "libgdm.so.1 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
