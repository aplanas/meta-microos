SUMMARY = "STUN server and client"
DESCRIPTION = "An implementation of the STUN protocol (Session Traversal Utilities \
for NAT) as specified in RFCs 5389, 5769, and 5780. It also includes \
backwards compatibility for RFC 3489. \
This package provides an STUN server and client application."
LICENSE = "Apache-2.0"

PV = "1.2.16"

RPM_NAME = "stuntman-1.2.16-2.10.aarch64.rpm"
RPM_HASH = "04e7eb91b95a9504b133b4130df02fd57d2e12397bf97b52f54cbcb341e097c1d3d7c97a8ad3eb22156c233988227d43b20ffc99180aa7facea520dd204adf31"

RPROVIDES:${PN} += "stuntman \
stuntman(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
shadow"

inherit rpm
