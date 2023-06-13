SUMMARY = "C object-oriented SIP Stack"
DESCRIPTION = "Belle-sip is a SIP (RFC3261) implementation written in C, with an \
object-oriented API."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "libbellesip1-5.2.49-1.1.aarch64.rpm"
RPM_HASH = "76db314c303aef86249590c7659c771cb2ca46f29f5b5b00760cc6a3e659b41f9abd63a01ae8343b7b0a3fb5366e46605429390e547cc522fcd37f2b113b9095"

RPROVIDES:${PN} += "libbellesip.so.1()(64bit) \
libbellesip1 \
libbellesip1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
belle-sip-data \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbctoolbox.so.1()(64bit) \
libbelr.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit)"

inherit rpm
