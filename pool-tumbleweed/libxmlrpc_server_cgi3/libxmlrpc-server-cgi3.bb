SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server_cgi3-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "963f043930bd40954fbb0feef91d67ad64876177307cb1aeb21e7ae7cf6d4ae3750ccb2b9ffd8652fc422a483ee3ff3bb7086d584d7d4e2fdf15c1f24323a437"

RPROVIDES:${PN} += "libxmlrpc-server-cgi.so.3 \
libxmlrpc-server-cgi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxmlrpc-server.so.3 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
