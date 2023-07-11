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

PV = "5.4.6"

RPM_NAME = "liblua5_4-5-5.4.6-1.2.aarch64.rpm"
RPM_HASH = "e4b5789a27956c73141d9d5bffe53375a7d18c882e6a8bf6667b2a15fb0b34d0d54d13859c6a840ea58be9970f26d55edc2f72c6d8c5ee24e54fdd8c44feb1ce"

RPROVIDES:${PN} += "liblua.so.5.4 \
liblua5-4 \
liblua5-4-5 \
liblua5.4.so.5 \
lua54-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
