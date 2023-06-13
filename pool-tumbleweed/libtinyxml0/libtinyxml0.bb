SUMMARY = "A simple, small, C++ XML parser"
DESCRIPTION = "TinyXML is a simple, small, C++ XML parser that can be easily integrating \
into other programs. Have you ever found yourself writing a text file parser \
every time you needed to save human readable data or serialize objects? \
TinyXML solves the text I/O file once and for all. \
(Or, as a friend said, ends the Just Another Text File Parser problem.)"
LICENSE = "Zlib"

PV = "2.6.2"

RPM_NAME = "libtinyxml0-2.6.2-10.8.aarch64.rpm"
RPM_HASH = "6c5d462960a2ade19573cb5b73a3f77945c2fb880e92681162e97d9f7ec07ebfa21fe50f89ab13794fd4e563808ee19f173cf28da60ab1ddfd3d405e6c14a994"

RPROVIDES:${PN} += "libtinyxml.so.0()(64bit) \
libtinyxml0 \
libtinyxml0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
