SUMMARY = "Introspection bindings for the ATK accessibility toolkit"
DESCRIPTION = "The ATK library provides a set of accessibility interfaces. By \
supporting the ATK interfaces, an application or toolkit can be used \
with screen readers, magnifiers, and alternate input devices. \
 \
This package provides the GObject Introspection bindings for ATK."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.3"

RPM_NAME = "typelib-1_0-Atk-1_0-2.48.3-2.1.aarch64.rpm"
RPM_HASH = "e6080ace1972a9443ba238dac41a54556d2faf60d4bba9fadecd5d0b7f4f7f66fce8d590497048be79e8099f99e6c746127eb31e94aac8ed09c53c803e31ef0a"

RPROVIDES:${PN} += "typelib-1-0-Atk-1-0 \
typelib-Atk"

RDEPENDS:${PN} += "libatk-1.0.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
