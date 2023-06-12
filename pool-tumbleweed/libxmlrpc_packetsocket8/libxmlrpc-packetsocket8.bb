SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_packetsocket8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "93b1646b24c68d8df75acff3fe4b47a2bf57394fc867619a48ee30a0517e611bb09d356247a429c9257e0a1437761fc242e42ed82949719d16eb22de701a0ac6"

RPROVIDES:${PN} += "libxmlrpc_packetsocket.so.8()(64bit) \
libxmlrpc_packetsocket8 \
libxmlrpc_packetsocket8(aarch-64)"
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
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxmlrpc_util++.so.8()(64bit)"

inherit rpm
