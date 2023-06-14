SUMMARY = "Multiplatform programming language"
DESCRIPTION = "Haxe is a high-level multiplatform programming language and compiler \
that can produce applications and source code for many different \
platforms from a single code-base. The Haxe compiler can compile Haxe \
source code to Adobe Flash SWF files, ActionScript 3, JavaScript, \
C++, PHP, C#, Java, Python, Lua, and Neko VM binary files."
LICENSE = "GPL-2.0+ & MIT"

PV = "4.3.1"

RPM_NAME = "haxe-4.3.1-2.1.aarch64.rpm"
RPM_HASH = "17d2b6625e06533191eeca06fe5c8831d0961e83721fddbe371ef67e268b2abba66cbdfbae3185c8e2a8aaf24216d39d56aef1ed0878c73f7fcd52bef88ba62d"

RPROVIDES:${PN} += "haxe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmbedcrypto.so.7 \
libmbedtls.so.14 \
libmbedx509.so.1 \
libneko.so.2 \
libpcre2-8.so.0 \
libuv.so.1 \
libz.so.1 \
neko"

inherit rpm
