SUMMARY = "Introspection bindings for the Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package provides the GObject Introspection bindings for the \
libatspi library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.3"

RPM_NAME = "typelib-1_0-Atspi-2_0-2.48.3-1.1.aarch64.rpm"
RPM_HASH = "feaf61461f9a8a1ff29c05a39232cf0e47bc24855ae16306b407aacbba2a02bdce6a88853044c1ee36891ae562d07be970b7f1963b7546ce7e6228ddb82ee7a3"

RPROVIDES:${PN} += "typelib-1-0-Atspi-2-0 \
typelib-Atspi"

RDEPENDS:${PN} += "libatspi.so.0 \
typelib-DBus \
typelib-GLib \
typelib-GObject"

inherit rpm
