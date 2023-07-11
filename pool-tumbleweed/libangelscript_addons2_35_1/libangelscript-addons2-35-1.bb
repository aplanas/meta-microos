SUMMARY = "Scripting library"
DESCRIPTION = "The AngelCode Scripting Library, or AngelScript as it is also known, \
is a scripting library designed to allow applications to extend their \
functionality through external scripts. \
 \
It supports Unix sockets and TCP/IP sockets with optional \
SSL/TLS support."
LICENSE = "Zlib"

PV = "2.35.1"

RPM_NAME = "libangelscript_addons2_35_1-2.35.1-1.9.aarch64.rpm"
RPM_HASH = "079686a71b3ba882e6fca51d2072e1b72546fe386346d27ce37571a6f956caee0e6d0261d31671ce9c0fdf33e13388f11c1181f9a080ebc58028d56c470f20d8"

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
