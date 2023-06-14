SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server++8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "cfe770b33ca93bd2b80b062622510731c70ade268daacf751b089502abf9a07ef88a5fbe3d43e953bbdfcd3836d6bfd1b975820b7e63fa623c6420c4236ae761"

RPROVIDES:${PN} += "libxmlrpc-server++.so.8 \
libxmlrpc-server++8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc++.so.8 \
libxmlrpc-server.so.3 \
libxmlrpc-util++.so.8 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
