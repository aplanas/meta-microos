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

RPM_NAME = "lua53-5.3.6-2.3.aarch64.rpm"
RPM_HASH = "389601b98d47597ca058a4d6b8486c47538475ba8ea078e6238d1755f8cf5c1376dba1c9d08cd8e8f22bf32379286288d503e356b97f85100ae681d2405eae5e"

RPROVIDES:${PN} += "Lua-API \
lua \
lua53"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.3.so.5 \
libreadline.so.8 \
update-alternatives"

inherit rpm
