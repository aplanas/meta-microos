SUMMARY = "Development files for Template-GLib"
DESCRIPTION = "Template-GLib is a library for generating text based on a template and \
user defined state. Template-GLib does not use a language runtime, so it is \
safe to use from any GObject-Introspectable language. \
 \
This package provides the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.1"

RPM_NAME = "template-glib-devel-3.36.1-1.4.aarch64.rpm"
RPM_HASH = "d03e126a6b640f1deaff9ff1c310545494482e8f298dabe5251e2169e8601910c1708377c55614c499cae1c157f697cb7e2a14ca7f5750d21b40984a5eb2adb9"

RPROVIDES:${PN} += "pkgconfig-template-glib-1.0 \
template-glib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-gobject-introspection-1.0 \
typelib-1-0-Template-1-0"

inherit rpm
