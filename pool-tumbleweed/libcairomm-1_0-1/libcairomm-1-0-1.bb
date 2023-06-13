SUMMARY = "C++ interface for Cairo"
DESCRIPTION = "This package provides a C++ interface for Cairo."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "libcairomm-1_0-1-1.12.2-4.3.aarch64.rpm"
RPM_HASH = "a879b3cf0cbbe2158fdc045549c10d963eeaeb2fa9884474f0e326d9c1549e62102164a9256fc8dab8e2232eae1aad6c8c1ea5af4b0454f269ab3eef77ac918a"

RPROVIDES:${PN} += "libcairomm-1.0.so.1()(64bit) \
libcairomm-1_0-1 \
libcairomm-1_0-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
