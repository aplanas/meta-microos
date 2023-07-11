SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_client++8-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "2b82d024330383b34de01e1f94cd2d2ce03e00055507a6a415d7d63b3a2b50b67fa518d0f4fe43e4644d69c520d49e62bca6844eccc62076c4c3f97298191a57"

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
