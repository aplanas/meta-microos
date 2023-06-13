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

RPM_NAME = "typelib-1_0-Template-1_0-3.36.1-1.3.aarch64.rpm"
RPM_HASH = "7660cc08844428fdc1a881235b6b2f0dba086953566a33470636062dc53cb6ceed1aca922c41ce0b6bfb490fd4de1f460a6029bc8c6d688a59f6c2fd60b640a2"

RPROVIDES:${PN} += "typelib(Template) \
typelib-1_0-Template-1_0 \
typelib-1_0-Template-1_0(aarch-64)"

RDEPENDS:${PN} += "libtemplate_glib-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
