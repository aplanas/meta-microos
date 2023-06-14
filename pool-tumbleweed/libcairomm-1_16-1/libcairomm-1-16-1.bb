SUMMARY = "C++ interface for Cairo"
DESCRIPTION = "This package provides a C++ interface for Cairo."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.1"

RPM_NAME = "libcairomm-1_16-1-1.16.1-2.3.aarch64.rpm"
RPM_HASH = "3533f29d019df732fe58d024819e06e534e7ce473824228454a5db6546ea2c62d814c34fbaefddf2ca8f664c147c8387aed621a6c9ad6fb26a30ec18d6475b3d"

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
