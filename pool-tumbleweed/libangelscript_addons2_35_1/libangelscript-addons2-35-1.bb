SUMMARY = "Scripting library"
DESCRIPTION = "The AngelCode Scripting Library, or AngelScript as it is also known, \
is a scripting library designed to allow applications to extend their \
functionality through external scripts. \
 \
It supports Unix sockets and TCP/IP sockets with optional \
SSL/TLS support."
LICENSE = "Zlib"

PV = "2.35.1"

RPM_NAME = "libangelscript_addons2_35_1-2.35.1-1.8.aarch64.rpm"
RPM_HASH = "5c15d9b9f172773fb68dd53a89ff05a1816c2f1bacbf0645d36c4de286d31d5a8a3e1c3aa5fb28649eb8c3e690401af78c62546efa73b7e9db0eab9b4ca926bf"

RPROVIDES:${PN} += "libangelscript-addons.so.2.35.1 \
libangelscript-addons2-35-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libangelscript.so.2.35.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
