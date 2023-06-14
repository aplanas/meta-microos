SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server_abyss++8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "982dd6dab770eda977e962c5ef44c6006a1e771ba50cf4e1b196d276dd53d3be7729fc50faac22a3165a4dcb8a01dfa6ac70ee394366d95c5101ddbc7561f416"

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
