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

RPM_NAME = "liblua5_1-5-5.1.5-15.16.aarch64.rpm"
RPM_HASH = "16d04955823bc75bdf5d4e46b03b4d29cb12b05e53be37eac5f22d3dce3fec51a0ca976502e13cfd66d81192f8bd7390e15a763357d996356fa2e89d1d9658fc"

RPROVIDES:${PN} += "liblua5.1.so.5()(64bit) \
liblua5_1 \
liblua5_1-5 \
liblua5_1-5(aarch-64) \
lua51-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
