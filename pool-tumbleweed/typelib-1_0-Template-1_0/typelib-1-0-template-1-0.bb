SUMMARY = "Introspection bindings for Template-GLib"
DESCRIPTION = "Template-GLib is a library for generating text based on a template and \
user defined state. Template-GLib does not use a language runtime, so it is \
safe to use from any GObject-Introspectable language. \
 \
Template-GLib allows accessing properties on GObjects as well as call \
simple methods via GObject-Introspection. \
 \
This package provides the introspection bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.1"

RPM_NAME = "typelib-1_0-Template-1_0-3.36.1-1.4.aarch64.rpm"
RPM_HASH = "734d110fa10bb9115adf6d69e0fc76977479f4e68c584f676d1c06627fe94732c820749e4adf13de0f75691ed29c8757781bbce2cbeaf4cd5378181b75d37410"

RPROVIDES:${PN} += "typelib-1-0-Template-1-0 \
typelib-Template"

RDEPENDS:${PN} += "libtemplate-glib-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
