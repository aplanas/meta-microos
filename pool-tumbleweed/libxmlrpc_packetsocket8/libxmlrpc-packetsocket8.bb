SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_packetsocket8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "93b1646b24c68d8df75acff3fe4b47a2bf57394fc867619a48ee30a0517e611bb09d356247a429c9257e0a1437761fc242e42ed82949719d16eb22de701a0ac6"

RPROVIDES:${PN} += "libxmlrpc-packetsocket.so.8 \
libxmlrpc-packetsocket8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-util++.so.8"

inherit rpm
