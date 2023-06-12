SUMMARY = "Development files for libsearpc"
DESCRIPTION = "The libsearpc-devel package contains libraries and header files for \
developing applications that use libsearpc."
LICENSE = "Apache-2.0"

PV = "3.3.0.20230224"

RPM_NAME = "libsearpc-devel-3.3.0.20230224-1.1.aarch64.rpm"
RPM_HASH = "c33e5e7f90c53cd826f3ecf17caac6c8d13e39bcadb73bce989e353f3cd3de4222bb1e2903f983fb7858f3376e7b31fc6b362b9aa0eab77d8d0c81edf1cb812f"

RPROVIDES:${PN} += "libsearpc-devel \
libsearpc-devel(aarch-64) \
pkgconfig(libsearpc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
libsearpc1 \
pkgconfig(gio-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(jansson)"

inherit rpm
