SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_cpp8-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "e6546818427844720ab51d590ca5c138edbe0f665d21cd66ccdb78df1646b36de0e20580b68bfb17975461578ab5c6f3f15e85b17e8430670743beb9f739b38e"

RPROVIDES:${PN} += "libxmlrpc-cpp.so.8 \
libxmlrpc-cpp8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-server.so.3 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
