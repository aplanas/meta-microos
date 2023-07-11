SUMMARY = "Multiplatform programming language"
DESCRIPTION = "Haxe is a high-level multiplatform programming language and compiler \
that can produce applications and source code for many different \
platforms from a single code-base. The Haxe compiler can compile Haxe \
source code to Adobe Flash SWF files, ActionScript 3, JavaScript, \
C++, PHP, C#, Java, Python, Lua, and Neko VM binary files."
LICENSE = "GPL-2.0+ & MIT"

PV = "4.3.1"

RPM_NAME = "haxe-4.3.1-2.2.aarch64.rpm"
RPM_HASH = "79783f2df0f7457eb3a2d18e8f93a4496e0f3cba57aa88b1d0f70a0d6d5bd9a16f0352b7a68d44687fd0bea6168c3ab81a85bca1f536f947ea4e081d13aba7d5"

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
