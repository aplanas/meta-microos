SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server_abyss3-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "b3dc15d901f086e86441aa87bcd579ee7ef85c03f1f85c039064d3466317492979cdbd0212d8adee454e246f13b0803cf4429ac9e9f09e401d0d2b0f1a2b5a98"

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
