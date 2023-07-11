SUMMARY = "C++ library for finite fields and elliptic curves"
DESCRIPTION = "libff is a C++ library for finite fields and elliptic curves."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libff-1_0_0-1.0.0-1.11.aarch64.rpm"
RPM_HASH = "fe8a204003e5ac0b2c44c1180fd83d79cce259bc67a11ee6fb773e59351e6d31998e862ff3771f37c56338bab3982dab0cc6e00b65e11fc5dcf8266f7106134e"

RPROVIDES:${PN} += "libff-1-0-0 \
libff-1.0.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
