SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server++8-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "9c366e2cdcb0a991ea36c58c70479c8e5becfee602860360f413b7f7621d7348f8be822f858d416b7c47551ab44f5e8501484242c3ecdc2b2c449f09327503fd"

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
