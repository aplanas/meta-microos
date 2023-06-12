SUMMARY = "Helsinki Finite-State Transducer Technology"
DESCRIPTION = "The Helsinki Finite-State Transducer software is intended for the \
implementation of morphological analyzers and other tools which are \
based on weighted and unweighted finite-state transducer technology."
LICENSE = "GPL-3.0-or-later & GPL-3.0-only & GPL-2.0-or-later & GPL-2.0-only & GPL-3.0-only & Apache-2.0"

PV = "3.15.4"

RPM_NAME = "hfst-3.15.4-1.3.aarch64.rpm"
RPM_HASH = "f58886e738e1fa0f03b3d640ba9b1f709ceb68617db394b812438207d38dffe33bca050fe23ebb01421355f27906d47280273c553bbedae9ca4edf984ddfb928"

RPROVIDES:${PN} += "hfst \
hfst(aarch-64)"
RDEPENDS:${PN} += "grep \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libhfst.so.53()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
sed"

inherit rpm
