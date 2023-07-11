SUMMARY = "C++ interface for Cairo"
DESCRIPTION = "This package provides a C++ interface for Cairo."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.1"

RPM_NAME = "libcairomm-1_16-1-1.16.1-2.4.aarch64.rpm"
RPM_HASH = "c0b983bc54263086d2009b11da44ebf00a4a61f25d04a86d7102a2d406011262f3cc9b85069d6864efac83753936e49f8c123b9d6c280fad6026e2bae6a365bb"

RPROVIDES:${PN} += "libcairomm-1-16-1 \
libcairomm-1.16.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
