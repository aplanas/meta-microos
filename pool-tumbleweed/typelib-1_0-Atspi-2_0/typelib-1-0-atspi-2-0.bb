SUMMARY = "Introspection bindings for the Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package provides the GObject Introspection bindings for the \
libatspi library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.3"

RPM_NAME = "typelib-1_0-Atspi-2_0-2.48.3-2.1.aarch64.rpm"
RPM_HASH = "1991a58998d815e4d9d1c4ef757a1c7121158aec914b736f7402425db4d9b22f16c337230577a89b25ad9944ba7ec0116d51d75181cdfe8973f923f7ea861fd7"

RPROVIDES:${PN} += "typelib-1-0-Atspi-2-0 \
typelib-Atspi"

RDEPENDS:${PN} += "libatspi.so.0 \
typelib-DBus \
typelib-GLib \
typelib-GObject"

inherit rpm
