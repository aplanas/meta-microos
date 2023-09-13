SUMMARY = "Introspection bindings for the Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package provides the GObject Introspection bindings for the \
libatspi library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.4"

RPM_NAME = "typelib-1_0-Atspi-2_0-2.48.4-1.1.aarch64.rpm"
RPM_HASH = "60162259f22750daabaf995886329d775806d10bab89c929104c448eed9601d87fd6affd0573696aa7c0067f641a1548e834ac5311b7a29b6553b7f8a857f377"

RPROVIDES:${PN} += "typelib-1-0-Atspi-2-0 \
typelib-Atspi"

RDEPENDS:${PN} += "libatspi.so.0 \
typelib-DBus \
typelib-GLib \
typelib-GObject"

inherit rpm
