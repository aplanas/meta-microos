SUMMARY = "A formatting library for C++"
DESCRIPTION = "Shared library for fmt, a formatting library for C++."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "libfmt9-9.1.0-2.4.aarch64.rpm"
RPM_HASH = "666ca0de67ba237f2a385613aea84f6c19293a62157e16c1bf6d287878d1c9a6c1724a7448352fb48a8130e856524a56699c8f471b4eb9f8e02c39208379269f"

RPROVIDES:${PN} += "libfmt.so.9 \
libfmt9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
