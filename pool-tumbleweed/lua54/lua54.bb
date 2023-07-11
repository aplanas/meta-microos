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
LICENSE = "GPL-3.0-or-later"

PV = "5.4.6"

RPM_NAME = "lua54-5.4.6-1.2.aarch64.rpm"
RPM_HASH = "bf3cf0ffdd708d4ac5559c726fe35d1f302841c0f51279d122236694db714d102995a48cf29411bffb0ae73b346c462be47baec4dbdf5fb080dc00ef5f183e6e"

RPROVIDES:${PN} += "Lua-API \
lua \
lua54"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
libreadline.so.8 \
update-alternatives"

inherit rpm
