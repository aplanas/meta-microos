SUMMARY = "GLib and GObject mapping of libvirt-sandbox - gi-bindings"
DESCRIPTION = "This package provides Gnome-introspection bindings for building \
applications within a sandbox using libvirt."
LICENSE = "LGPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "typelib-1_0-LibvirtSandbox-1_0-0.8.0-5.3.aarch64.rpm"
RPM_HASH = "cf9075513f4e73177f7adb1ceac7226e46067935ff9a2b9ca3a01b3d0017af7bf4f8a44774934722a0ca6fb02ea354384087b65cb5d16afd7d2f86af28f27e11"

RPROVIDES:${PN} += "typelib(LibvirtSandbox) \
typelib-1_0-LibvirtSandbox-1_0 \
typelib-1_0-LibvirtSandbox-1_0(aarch-64)"

RDEPENDS:${PN} += "libvirt-sandbox-1.0.so.5()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(LibvirtGConfig) \
typelib(LibvirtGLib) \
typelib(LibvirtGObject) \
typelib(libxml2)"

inherit rpm
