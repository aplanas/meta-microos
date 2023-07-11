SUMMARY = "Introspection bindings for gdm"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays. \
 \
This package provides the GObject Introspection bindings for \
communicating with the GDM greeter server."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "typelib-1_0-Gdm-1_0-44.1-2.1.aarch64.rpm"
RPM_HASH = "c92caacabfb4c8f5aa9eda6e5aa3ce3f1f963c3cc9714703c70119a606468e268d5fa3874dbe13b73f4d236453deadbe8a2bc515cb67ceff542d358d33875e65"

RPROVIDES:${PN} += "typelib-1-0-Gdm-1-0 \
typelib-Gdm"

RDEPENDS:${PN} += "libgdm.so.1 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
