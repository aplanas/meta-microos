SUMMARY = "Introspection bindings for libhinawa"
DESCRIPTION = "This package provides the GObject Introspection bindings for libhinawa, \
an I/O library for IEEE 1394 asynchronous transactions."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "typelib-1_0-Hinawa-2_0-2.4.0-1.7.aarch64.rpm"
RPM_HASH = "098e6dfa3d67cb0d876c99484de419b6f85b5f0b2e69618054dc8b1e9e411fc8677494409b80b265f72b13cf5888cd0bd7e2249b3d0f8690b5da9d437b303041"

RPROVIDES:${PN} += "typelib-1-0-Hinawa-2-0 \
typelib-Hinawa"

RDEPENDS:${PN} += "libhinawa.so.2 \
libhinawa2 \
typelib-GLib \
typelib-GObject"

inherit rpm
