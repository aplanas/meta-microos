SUMMARY = "Luabind Library"
DESCRIPTION = "Luabind is a library that helps you create bindings between C++ and Lua. \
It has the ability to expose functions and classes, written in C++, to Lua. \
This package contains the library."
LICENSE = "MIT"

PV = "0.9.1+git20150408.a0edf58"

RPM_NAME = "libluabind0_9_1-0.9.1+git20150408.a0edf58-2.14.aarch64.rpm"
RPM_HASH = "d0da6819384ff5d1dbd22c519837c64784a79afd93755cf15d7fcf2c240d8113cae12003f7d8b017d6385fcc5865b75af3f882849ba582094d07576d85bb63a8"

RPROVIDES:${PN} += "libluabind.so.0.9.1 \
libluabind0-9-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.3.so.5 \
libstdc++.so.6"

inherit rpm
