SUMMARY = "C++ library for finite fields and elliptic curves"
DESCRIPTION = "libff is a C++ library for finite fields and elliptic curves."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libff-1_0_0-1.0.0-1.10.aarch64.rpm"
RPM_HASH = "baa9db10ffb93343f09ba3be22493fd49216b202ad1b74feece0b4c89a3884b8515d3772497e82513f89d589e9963e78b6335df82663565af05a56a4ba93595b"

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
