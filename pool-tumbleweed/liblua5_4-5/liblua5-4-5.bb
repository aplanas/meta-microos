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

RPM_NAME = "liblua5_4-5-5.4.6-1.1.aarch64.rpm"
RPM_HASH = "520a17946d3c7cd813d30f8220cf3bb030971a2f28158f499d7a54b2b32e2a3992190868cb0967ed4dc12eed4165dfc76008284d4ce77547ba9736e09ae02034"

RPROVIDES:${PN} += "liblua.so.5.4()(64bit) \
liblua5.4.so.5()(64bit) \
liblua5_4 \
liblua5_4-5 \
liblua5_4-5(aarch-64) \
lua54-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
