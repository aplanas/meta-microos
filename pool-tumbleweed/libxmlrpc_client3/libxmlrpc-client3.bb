SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_client3-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "9d68e118ae280fbfda1e6a12f4a2565febabac8cea852928fb86595c88de79f184420e9adb6ff21946b27eed219af79cef5c0d675a7bf20f0f4a3f6fef88c43d"

RPROVIDES:${PN} += "libxmlrpc-client.so.3 \
libxmlrpc-client3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
