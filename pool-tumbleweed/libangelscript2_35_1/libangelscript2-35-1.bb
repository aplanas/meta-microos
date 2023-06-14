SUMMARY = "Scripting library"
DESCRIPTION = "The AngelCode Scripting Library, or AngelScript as it is also known, \
is a scripting library designed to allow applications to extend their \
functionality through external scripts. \
 \
It supports Unix sockets and TCP/IP sockets with optional \
SSL/TLS support."
LICENSE = "Zlib"

PV = "2.35.1"

RPM_NAME = "libangelscript2_35_1-2.35.1-1.8.aarch64.rpm"
RPM_HASH = "d2e944e3327664b460c632d8b639c9bdf038ccd7b93df86161a9eb5caa22e3d4d9416fced35843e819620426d5eb72b307df5aa24f52f59163ff6b0283fce2c1"

RPROVIDES:${PN} += "libangelscript.so.2.35.1 \
libangelscript2-35-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
