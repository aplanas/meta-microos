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

RPROVIDES:${PN} += "libangelscript_addons.so.2.35.1()(64bit) \
libangelscript_addons2_35_1 \
libangelscript_addons2_35_1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libangelscript.so.2.35.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
