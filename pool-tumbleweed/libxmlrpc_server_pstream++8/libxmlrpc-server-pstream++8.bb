SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server_pstream++8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "f09483336f33d87f65c475e057ff8c394b7083d3b366dc62cd4d10375a997a33d77971dcdb6eba5e56690899ec1e3757ad25b7ca57c13f10d5fb99f75a9964fa"

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
