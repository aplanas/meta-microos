SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_abyss++8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "ad06193afacb190e2282959de6abcce239227aa525458dc8e98c8eb9917c1bd419e5397c56239bacfb405d1159325a19ade53fea958ba1b8691340c03be88dcc"

RPROVIDES:${PN} += "libxmlrpc-abyss++.so.8 \
libxmlrpc-abyss++8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-abyss.so.3 \
libxmlrpc-util++.so.8 \
libxmlrpc-util.so.4"

inherit rpm
