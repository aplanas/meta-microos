SUMMARY = "Library for querying compressed XML metadata"
DESCRIPTION = "This package provides the shared library for libxmlb."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.11"

RPM_NAME = "libxmlb2-0.3.11-1.1.aarch64.rpm"
RPM_HASH = "8fbfd19d9dc8c45e470eff7123b200050db05586e0568d20033015d9526583482367fb58aa0d0d975e57371ddf3130a3520d3f3fc93af181d5726c9ffbb68789"

RPROVIDES:${PN} += "libxmlb.so.2()(64bit) \
libxmlb2 \
libxmlb2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
liblzma.so.5()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
