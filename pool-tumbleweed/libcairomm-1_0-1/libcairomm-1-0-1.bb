SUMMARY = "C++ interface for Cairo"
DESCRIPTION = "This package provides a C++ interface for Cairo."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "libcairomm-1_0-1-1.12.2-4.4.aarch64.rpm"
RPM_HASH = "2192c11ed9378de8b0e4afca3a21ccb4f4efb1c5314012626535b73bfced496ddd557bb57896e15a4c6eab84f8f788be901b63d887fb0b93ccbf7f1a9dfde022"

RPROVIDES:${PN} += "libcairomm-1-0-1 \
libcairomm-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
