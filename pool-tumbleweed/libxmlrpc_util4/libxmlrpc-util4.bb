SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_util4-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "662fc567a76b5d18f4e11453309f96bd9007f242928432d17e1aa829d2fe797641f1292771eb63dadabd38639bcbeb90dd4707e99a42f802a1c2499173b6a4dd"

RPROVIDES:${PN} += "libxmlrpc-util.so.4 \
libxmlrpc-util4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
