SUMMARY = "C++ wrapper library around the X Window System API"
DESCRIPTION = "C++ wrapper library around the X Window System API."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9.2"

RPM_NAME = "libclxclient3-3.9.2-2.12.aarch64.rpm"
RPM_HASH = "6b3918e7381f2fc2d28bb563192fe5b605f823b5e4fca2e08f7fd6f3e41a6fbb1607b59d75c5ae31497902726868a437fc2488c4692bb4734b298028f15f68be"

RPROVIDES:${PN} += "libclxclient.so.3()(64bit) \
libclxclient3 \
libclxclient3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXft.so.2()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
