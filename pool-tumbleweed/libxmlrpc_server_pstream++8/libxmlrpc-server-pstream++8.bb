SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server_pstream++8-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "c9d9f874b75cc1ad5d711aaedc3a65fc18ac83216a0c5a1b06e16bd0acbf81e51ed3bd3e5912966b7eedad7a7cd56c615c01955e1694116c63ee6be600b7af0b"

RPROVIDES:${PN} += "libxmlrpc-server-pstream++.so.8 \
libxmlrpc-server-pstream++8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-packetsocket.so.8 \
libxmlrpc-server++.so.8 \
libxmlrpc-util++.so.8"

inherit rpm
