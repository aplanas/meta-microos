SUMMARY = "The Lua integration library"
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

RPM_NAME = "liblua5_3-5-5.3.6-2.4.aarch64.rpm"
RPM_HASH = "86dd51d8506d3f1c0f465c85763914d3a8c255efc2f483df5a419570cdbb43724e52856cbe86e4b5f63e946f0dbb3a9af80896595da98a9e79793a69315f1a20"

RPROVIDES:${PN} += "liblua.so.5.3 \
liblua5-3 \
liblua5-3-5 \
liblua5.3.so.5 \
lua53-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
