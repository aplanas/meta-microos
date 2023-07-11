SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server_abyss3-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "b582175ff8665f5ba773b89e769ce25c321ef8ee7f1b240f1e3124bd96acca4815644b43514923c8b245efb23322939fe71af9eebc612758519669ca608cff19"

RPROVIDES:${PN} += "libxmlrpc-server-abyss.so.3 \
libxmlrpc-server-abyss3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxmlrpc-abyss.so.3 \
libxmlrpc-server.so.3 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
