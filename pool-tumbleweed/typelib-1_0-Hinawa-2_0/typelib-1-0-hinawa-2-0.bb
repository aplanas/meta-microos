SUMMARY = "Introspection bindings for libhinawa"
DESCRIPTION = "This package provides the GObject Introspection bindings for libhinawa, \
an I/O library for IEEE 1394 asynchronous transactions."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "typelib-1_0-Hinawa-2_0-2.4.0-1.6.aarch64.rpm"
RPM_HASH = "fd1873edb1eaafbcb415bd1efd4dcb0aa0934f488dd896045c14e63d71378f09b6608c645479c32c401400248c43c7173b096ddaccff3200736cb85152bc30b8"

RPROVIDES:${PN} += "typelib-1-0-Hinawa-2-0 \
typelib-Hinawa"

RDEPENDS:${PN} += "libhinawa.so.2 \
libhinawa2 \
typelib-GLib \
typelib-GObject"

inherit rpm
