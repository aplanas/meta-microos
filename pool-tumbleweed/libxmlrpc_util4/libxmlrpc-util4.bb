SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_util4-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "766eea2912294880b6a7062d1f435259eea2b44493b0277a9772c96ba35ede0b35a32638ce0d9dd634a2a9c8d10188a44b3ba4defca48dfa5da2de4ef22dc34c"

RPROVIDES:${PN} += "libxmlrpc_util.so.4()(64bit) \
libxmlrpc_util4 \
libxmlrpc_util4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
