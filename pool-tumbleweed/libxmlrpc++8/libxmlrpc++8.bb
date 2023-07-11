SUMMARY = "A library implementing XML-based remote procedure calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc++8-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "a708f9371aa125fd086f07ff13923a429f0b0581165b3fc09b438932170e36cfe38c2e29f4d7f98a3081ce91295447c9f38c26da59692d4c5dd718655d69de98"

RPROVIDES:${PN} += "libxmlrpc++.so.8 \
libxmlrpc++8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-util++.so.8 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
