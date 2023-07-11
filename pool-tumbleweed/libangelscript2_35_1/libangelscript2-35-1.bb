SUMMARY = "Scripting library"
DESCRIPTION = "The AngelCode Scripting Library, or AngelScript as it is also known, \
is a scripting library designed to allow applications to extend their \
functionality through external scripts. \
 \
It supports Unix sockets and TCP/IP sockets with optional \
SSL/TLS support."
LICENSE = "Zlib"

PV = "2.35.1"

RPM_NAME = "libangelscript2_35_1-2.35.1-1.9.aarch64.rpm"
RPM_HASH = "4c583beda761b165b47ecffaefc6c17655c2ac69d37e55c07d658a5501241a1e49d7c3099b4ee72d5052badce487f0f0ed67444792a1c0cf95f2ec188911c1b4"

RPROVIDES:${PN} += "libangelscript.so.2.35.1 \
libangelscript2-35-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
