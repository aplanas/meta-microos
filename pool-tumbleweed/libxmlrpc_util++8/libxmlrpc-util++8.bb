SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_util++8-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "48aa2f088a92e13bf573ae5358f84bcfc9e2a4b52054d74a29ca0853b8f1b6eebef86c371d20c808fe174292ac6b540189c619cde59f8d9c7b0a45d61afe9f36"

RPROVIDES:${PN} += "libxmlrpc-util++.so.8 \
libxmlrpc-util++8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-util.so.4"

inherit rpm
