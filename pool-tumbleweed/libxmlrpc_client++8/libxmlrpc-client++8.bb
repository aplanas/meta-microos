SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_client++8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "2adb902e31df252a35283da8ee1782c03d301187edad85e2084eea5abf759557bacd4d410e35a06b5b6133982b71ea7dee08e0570b1f0100de9d1533e128bec8"

RPROVIDES:${PN} += "libxmlrpc-client++.so.8 \
libxmlrpc-client++8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc++.so.8 \
libxmlrpc-client.so.3 \
libxmlrpc-packetsocket.so.8 \
libxmlrpc-util++.so.8 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
