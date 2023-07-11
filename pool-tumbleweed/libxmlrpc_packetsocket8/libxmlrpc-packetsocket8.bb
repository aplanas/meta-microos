SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_packetsocket8-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "6038075a5d0345d69d6f58c99ba79113bb1dda5e15c0f0ae48d024f025e140dcb07a5e24e77f6ec3ad2e84d6364deacc06f99b6893abc70f5a22e99b399118fe"

RPROVIDES:${PN} += "libxmlrpc-packetsocket.so.8 \
libxmlrpc-packetsocket8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-util++.so.8"

inherit rpm
