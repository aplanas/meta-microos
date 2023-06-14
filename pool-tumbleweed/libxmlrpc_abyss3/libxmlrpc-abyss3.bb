SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_abyss3-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "b75678c8ed12a0be65c28d6dd6ebb5f2b563dc26c6e43387cded1979839e01cf9fe1b00c8613d6cd10cc66dbfbf399e2925cb5415608e786e5e2aa152f3053c6"

RPROVIDES:${PN} += "libxmlrpc-abyss.so.3 \
libxmlrpc-abyss3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxmlrpc-util.so.4"

inherit rpm
