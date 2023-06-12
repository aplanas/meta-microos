SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server_pstream++8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "f09483336f33d87f65c475e057ff8c394b7083d3b366dc62cd4d10375a997a33d77971dcdb6eba5e56690899ec1e3757ad25b7ca57c13f10d5fb99f75a9964fa"

RPROVIDES:${PN} += "libxmlrpc_server_pstream++.so.8()(64bit) \
libxmlrpc_server_pstream++8 \
libxmlrpc_server_pstream++8(aarch-64)"
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
libxmlrpc_packetsocket.so.8()(64bit) \
libxmlrpc_server++.so.8()(64bit) \
libxmlrpc_util++.so.8()(64bit)"

inherit rpm