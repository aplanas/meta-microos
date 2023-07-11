SUMMARY = "IBus libraries"
DESCRIPTION = "This package contains the libraries for IBus"
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "libibus-1_0-5-1.5.28-2.2.aarch64.rpm"
RPM_HASH = "7e98c1dc1825d5f1ca386804a832f68c94f82fd9dd42f3746538b65fe0ca15c08a9aa63d1843468b3286e923e3ca4ac467d3129f0740acbf410fdb9c7fa2e852"

RPROVIDES:${PN} += "libibus-1-0-5 \
libibus-1.0.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
