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

PV = "5.1.5"

RPM_NAME = "liblua5_1-5-5.1.5-15.17.aarch64.rpm"
RPM_HASH = "41f45b609eda3038b6b8a52a80ded334f86732c80d899ee845dbfe23b7f4f904df545f8117a311a320e13758fb124c8c4cd2b9760a938c77fe39c2db461ea31a"

RPROVIDES:${PN} += "liblua5-1 \
liblua5-1-5 \
liblua5.1.so.5 \
lua51-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
