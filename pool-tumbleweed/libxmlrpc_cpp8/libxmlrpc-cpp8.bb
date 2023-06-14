SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "libxmlrpc_cpp8-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "26e335167fe9e3e5113b126e7820a40cbe90b14c1bcab88fa8afb4b584a0beede4c9ed9e17ad2b80b9b93504c4687cee5093201ca268318fa63890ac5d30121a"

RPROVIDES:${PN} += "libxmlrpc-cpp.so.8 \
libxmlrpc-cpp8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-server.so.3 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
