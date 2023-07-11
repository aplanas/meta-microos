SUMMARY = "FreeWnn Chinese Input System library"
DESCRIPTION = "This subpackage contains a core library of the Wnn input system."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "libcwnn0-1.1.1a023.1-4.4.aarch64.rpm"
RPM_HASH = "cca8ffe4dff546028383d3e87065a27ade5ab2ee56814376fedc3aad3c5d5b9ab9ef040bb05bceaa3ccb31f02cc157dc4f27613c7cd5dfe5202367d8cd831411"

RPROVIDES:${PN} += "libcwnn.so.0 \
libcwnn0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1"

inherit rpm
