SUMMARY = "heXoNet RFB (remote control for the X Window System)"
DESCRIPTION = "The heXoNet RFB Software package includes many different projects. The \
goal of this package is to provide a comprehensive collection of \
rfb-enabled tools and applications. One application, x0rfbserver, was, \
and maybe still is, the only complete remote control solution for the X \
Window System."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "rfb-0.6.1-703.11.aarch64.rpm"
RPM_HASH = "bd34b79a8da43309a67ed1f55cc9911bbdc765f2ae1ca2502ac5755f7b4282eb8fcb0b0edee0e664e47b1c475a78e318bdfe58f02c2e014fc420f1d0797ef9cc"

RPROVIDES:${PN} += "rfb \
rfb(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxclass.so.0.9.2()(64bit) \
libz.so.1()(64bit) \
xclass"

inherit rpm
