SUMMARY = "Introspection bindings for the ATK accessibility toolkit"
DESCRIPTION = "The ATK library provides a set of accessibility interfaces. By \
supporting the ATK interfaces, an application or toolkit can be used \
with screen readers, magnifiers, and alternate input devices. \
 \
This package provides the GObject Introspection bindings for ATK."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.4"

RPM_NAME = "typelib-1_0-Atk-1_0-2.48.4-1.1.aarch64.rpm"
RPM_HASH = "b7e007a40648ae201f478f6af0917bad9b2bc8415107ae24850503c666b34eb68c566ebc56a91b11a423ebd23453caa4fdc7e7a7675309ac30b5dfc91712901d"

RPROVIDES:${PN} += "typelib-1-0-Atk-1-0 \
typelib-Atk"

RDEPENDS:${PN} += "libatk-1.0.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
