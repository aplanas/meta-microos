SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server_cgi3-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "07685616df43f83f012974b2ee00a757a6757cc0575e2e4bfac7c7385e229e9e2f59d7abb0ca546c09e038d5c045afdbc3ba6ebab517dd8fab666b8db4832e6a"

RPROVIDES:${PN} += "libxmlrpc-server-cgi.so.3 \
libxmlrpc-server-cgi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxmlrpc-server.so.3 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
