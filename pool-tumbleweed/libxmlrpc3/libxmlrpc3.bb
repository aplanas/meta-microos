SUMMARY = "A library implementing XML-based remote procedure calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc3-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "7032895fdc8671cbb50cb1cd25c14634d4960f18e295ed8e87b54894d8b17b5d67afc1e07748892be797e2f6fe6e6ed5829e6eba9467e82ca41b510f2cb05c36"

RPROVIDES:${PN} += "libxmlrpc.so.3 \
libxmlrpc3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
libxmlrpc-util.so.4"

inherit rpm
