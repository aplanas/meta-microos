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

RPM_NAME = "liblua5_3-5-5.3.6-2.3.aarch64.rpm"
RPM_HASH = "76d602fc095dc6bd1632f15dff6f80bc51ae19c0a089e48445722d9b310484fda1b5b1aa9c2760d8dd7a7bc3d8fbd365365fc3b4cae18307be5098341c71d836"

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
