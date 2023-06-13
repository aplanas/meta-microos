SUMMARY = "Introspection bindings for gdm"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays. \
 \
This package provides the GObject Introspection bindings for \
communicating with the GDM greeter server."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "typelib-1_0-Gdm-1_0-44.1-1.1.aarch64.rpm"
RPM_HASH = "3f43b35ba32c5c1ac31b78a04e43482d2a90b97aa5435b514fc9f61037b77f4258799ba2f43f6130b8e4774439ce3ff1b4c4d740c2ce97b385982f61d07a43a5"

RPROVIDES:${PN} += "typelib(Gdm) \
typelib-1_0-Gdm-1_0 \
typelib-1_0-Gdm-1_0(aarch-64)"

RDEPENDS:${PN} += "libgdm.so.1()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
