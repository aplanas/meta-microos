SUMMARY = "Small Embeddable Language with Procedural Syntax"
DESCRIPTION = "Lua is a programming language originally designed for extending \
applications, but is also frequently used as a general-purpose, \
stand-alone language. \
 \
Lua combines procedural syntax (similar to Pascal) with \
data description constructs based on associative arrays and extensible \
semantics. Lua is dynamically typed, interpreted from byte codes, and \
has automatic memory management, making it suitable for configuration, \
scripting, and rapid prototyping. Lua is implemented as a small library \
of C functions, written in ANSI C."
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "lua53-5.3.6-2.4.aarch64.rpm"
RPM_HASH = "3be671cc5d0ecf7fd3ad522a6748a89137e6d95f82ac35bf54ad9a75e05358f622fcfce7c00e2f7e344bb7b0121e16f2db293eb8ffa1c089c8c35eb9c6d2077d"

RPROVIDES:${PN} += "Lua-API \
lua \
lua53"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.3.so.5 \
libreadline.so.8 \
update-alternatives"

inherit rpm
