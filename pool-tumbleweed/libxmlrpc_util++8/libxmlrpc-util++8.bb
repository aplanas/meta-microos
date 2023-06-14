SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_util++8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "c5458f4aef0e32a045e516b2f9dc7260926db41899b68537555524acf31c3101c2be57e4c2c4ca1df66217b5b2bbef2228fc0422465ffdb1135159403c8ec0dd"

RPROVIDES:${PN} += "libxmlrpc-util++.so.8 \
libxmlrpc-util++8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-util.so.4"

inherit rpm
