SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server_abyss++8-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "4badd366e015c8df17d6f4cf82349fdbfd5348305fa23cd4e8c93978cd5b6543f26cb42bad85e1af1599403b3028357d37ac97702506b60e12b5b2678966c833"

RPROVIDES:${PN} += "libxmlrpc-server-abyss++.so.8 \
libxmlrpc-server-abyss++8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-abyss++.so.8 \
libxmlrpc-abyss.so.3 \
libxmlrpc-server++.so.8 \
libxmlrpc-server-abyss.so.3 \
libxmlrpc-util++.so.8 \
libxmlrpc-util.so.4"

inherit rpm
