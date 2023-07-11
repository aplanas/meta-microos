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

PV = "5.1.5"

RPM_NAME = "lua51-5.1.5-15.17.aarch64.rpm"
RPM_HASH = "ee368eeec60ef1350de51f35106723ae2cf98517782bee212429d510a0436b21f3fc52490563709d2a7992c1afabd0ac6d53d3d43c321fe56abd6163ec6a5522"

RPROVIDES:${PN} += "Lua-API \
lua \
lua51"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libreadline.so.8 \
update-alternatives"

inherit rpm
