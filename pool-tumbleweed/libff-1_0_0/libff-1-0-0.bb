SUMMARY = "C++ library for finite fields and elliptic curves"
DESCRIPTION = "libff is a C++ library for finite fields and elliptic curves."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libff-1_0_0-1.0.0-1.10.aarch64.rpm"
RPM_HASH = "baa9db10ffb93343f09ba3be22493fd49216b202ad1b74feece0b4c89a3884b8515d3772497e82513f89d589e9963e78b6335df82663565af05a56a4ba93595b"

RPROVIDES:${PN} += "libff-1.0.0.so()(64bit) \
libff-1_0_0 \
libff-1_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
