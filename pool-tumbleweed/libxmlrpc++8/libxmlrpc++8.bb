SUMMARY = "A library implementing XML-based remote procedure calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc++8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "ab9c8666be63c3cbfbe1a34f1dba36864263ad4bc35406513e9930311707990a224565ee5c295e130e0b75a0d76fb35d4ff34f0a66ac2a4a80f307b2bcd0a625"

RPROVIDES:${PN} += "libxmlrpc++.so.8 \
libxmlrpc++8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-util++.so.8 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
