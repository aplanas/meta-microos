SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_abyss3-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "12d500a9f6096aa917543747b2ebe5bbb8d7c7a407fd1aaa6e27e23aa72e3c630ba850d7ba5c19afc99856ee81b75284741db20dfc24071d344738ba92d8b75f"

RPROVIDES:${PN} += "libxmlrpc-abyss.so.3 \
libxmlrpc-abyss3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxmlrpc-util.so.4"

inherit rpm
