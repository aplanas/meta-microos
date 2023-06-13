SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server_abyss++8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "982dd6dab770eda977e962c5ef44c6006a1e771ba50cf4e1b196d276dd53d3be7729fc50faac22a3165a4dcb8a01dfa6ac70ee394366d95c5101ddbc7561f416"

RPROVIDES:${PN} += "libxmlrpc_server_abyss++.so.8()(64bit) \
libxmlrpc_server_abyss++8 \
libxmlrpc_server_abyss++8(aarch-64)"

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
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libxmlrpc_abyss++.so.8()(64bit) \
libxmlrpc_abyss.so.3()(64bit) \
libxmlrpc_server++.so.8()(64bit) \
libxmlrpc_server_abyss.so.3()(64bit) \
libxmlrpc_util++.so.8()(64bit) \
libxmlrpc_util.so.4()(64bit)"

inherit rpm
