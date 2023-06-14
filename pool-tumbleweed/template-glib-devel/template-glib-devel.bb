SUMMARY = "Development files for Template-GLib"
DESCRIPTION = "Template-GLib is a library for generating text based on a template and \
user defined state. Template-GLib does not use a language runtime, so it is \
safe to use from any GObject-Introspectable language. \
 \
This package provides the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.1"

RPM_NAME = "template-glib-devel-3.36.1-1.3.aarch64.rpm"
RPM_HASH = "eb0b110a6ba0d6597b2c798bf8a12be2a54cd1aa75d0337850320b33776c4fc824969841863ae5cf10cebfca081fd1a843a0759b3fb08369a3c931b23be45028"

RPROVIDES:${PN} += "pkgconfig-template-glib-1.0 \
template-glib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-gobject-introspection-1.0 \
typelib-1-0-Template-1-0"

inherit rpm
