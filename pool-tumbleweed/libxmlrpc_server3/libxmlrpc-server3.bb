SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_server3-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "45f34c1f882154e5f9586bfc3613d671ddabc46cbb19ad176ae8da86a4572bf9d999784439f307f72c57227bac33cb2eadc9e860f501407529e1548f94f141ac"

RPROVIDES:${PN} += "libxmlrpc-server.so.3 \
libxmlrpc-server3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
