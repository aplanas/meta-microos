SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server_cgi++8-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "71ec808e119203fa3fe62aa7b682a064438d3f35ded48d3a38b7741a01d93024724800ba091c99573b328b2a07f42f47af5c99bb66e7d40e7a658d40434a217d"

RPROVIDES:${PN} += "libxmlrpc-server-cgi++.so.8 \
libxmlrpc-server-cgi++8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc++.so.8 \
libxmlrpc-server++.so.8 \
libxmlrpc-util++.so.8 \
libxmlrpc.so.3"

inherit rpm
