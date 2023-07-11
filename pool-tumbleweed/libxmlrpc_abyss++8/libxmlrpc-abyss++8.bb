SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_abyss++8-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "51a4d824047c38292479e1ca4b33f9f747785193be112144e26ed218d5b6a2306ef8e8576735b7f97f4bc1e9c4b88165a5b718c5daaf5dca3d86cd18c403c040"

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
