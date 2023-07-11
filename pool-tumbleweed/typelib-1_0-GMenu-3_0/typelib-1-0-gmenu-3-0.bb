SUMMARY = "The GNOME Desktop Menu -- Introspection bindings"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org \
 \
This package provides the GObject Introspection bindings for the \
libgnome-menu library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.0"

RPM_NAME = "typelib-1_0-GMenu-3_0-3.36.0-3.4.aarch64.rpm"
RPM_HASH = "c24cd203ffcef353747137af7020aa2525b7679bee4681202c14215ff320d352c77fe5ee72f83af519249a357e329c904f5052b880f697d8e038dffffbf3a355"

RPROVIDES:${PN} += "typelib-1-0-GMenu-3-0 \
typelib-GMenu"

RDEPENDS:${PN} += "libgnome-menu-3.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
