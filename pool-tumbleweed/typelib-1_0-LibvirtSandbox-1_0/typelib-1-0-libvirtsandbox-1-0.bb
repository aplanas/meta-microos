SUMMARY = "GLib and GObject mapping of libvirt-sandbox - gi-bindings"
DESCRIPTION = "This package provides Gnome-introspection bindings for building \
applications within a sandbox using libvirt."
LICENSE = "LGPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "typelib-1_0-LibvirtSandbox-1_0-0.8.0-5.4.aarch64.rpm"
RPM_HASH = "ea0172c7a919d90f6e26148da836dd315496b05017bd6e499592c519fc385a64367a3e40f8e89068efd63fe8a3014889f5b9786eb255577e17e29c9c7a7cfebb"

RPROVIDES:${PN} += "typelib-1-0-LibvirtSandbox-1-0 \
typelib-LibvirtSandbox"

RDEPENDS:${PN} += "libvirt-sandbox-1.0.so.5 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-LibvirtGConfig \
typelib-LibvirtGLib \
typelib-LibvirtGObject \
typelib-libxml2"

inherit rpm
