SUMMARY = "Packet generator"
DESCRIPTION = "Nping is a tool for network packet generation, response \
analysis and response time measurement. Nping allows to generate network \
packets of a wide range of protocols, letting users to tune virtually \
any field of the protocol headers. While Nping can be used as a simple \
ping utility to detect active hosts, it can also be used as a raw packet \
generator for network stack stress tests, ARP poisoning, Denial of \
Service attacks, route tracing, etc."
LICENSE = "GPL-2.0-or-later"

PV = "7.93"

RPM_NAME = "nping-7.93-1.3.aarch64.rpm"
RPM_HASH = "45c3902d6bb6a9bc4bb11d14ecd6f99ee37394d61c2107b436a4ed55a30f1e9c354e607d7c23a5362ac94fd76c8f7f7409256b33f1d6a13dd3c7c36537e98949"

RPROVIDES:${PN} += "nping \
nping(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpcap.so.1()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
