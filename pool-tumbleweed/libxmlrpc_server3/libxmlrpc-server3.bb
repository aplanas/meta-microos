SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server3-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "efc3222a498809f79b5eab83970d6d48b30bf3b1992862d0203367990cfe3a268b11c1d56746baf47485f89b7acddec212417cffaa9b5c2cf8f2825cdcafbb3a"

RPROVIDES:${PN} += "libxmlrpc-server.so.3 \
libxmlrpc-server3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
