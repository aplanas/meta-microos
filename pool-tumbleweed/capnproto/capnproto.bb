SUMMARY = "A Data Serialization Format"
DESCRIPTION = "Cap'n Proto is a binary data interchange format and capability-based \
RPC system."
LICENSE = "MIT"

PV = "0.10.4"

RPM_NAME = "capnproto-0.10.4-1.1.aarch64.rpm"
RPM_HASH = "d1c759f3772b5f7bc82422c1c2d7be38dd9fbde8a59003ef2cafffa9073e68f117e567ff2eeb85a0646033dce45b32292cff580d9066ca5cf77666ab8bc961df"

RPROVIDES:${PN} += "capnproto \
capnproto(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcapnp-0.10.4.so()(64bit) \
libcapnp-0_10_4 \
libcapnp-json-0.10.4.so()(64bit) \
libcapnpc-0.10.4.so()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkj-0.10.4.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
