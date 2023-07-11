SUMMARY = "Lua bindings for Clingo"
DESCRIPTION = "Lua bindings for Clingo, a grounder and solver for logic programs. \
 \
Detailed information (including a User's manual), source code, and pre-compiled \
binaries are available at: http://potassco.org/"
LICENSE = "MIT"

PV = "5.6.2"

RPM_NAME = "lua-clingo-5.6.2-2.1.aarch64.rpm"
RPM_HASH = "389b641d86d1d88dcaf9cb31f8c61fbc83a1cd5d91f51124992f9697c7c6fa756cdace924ee04151c5092d6516d91f068c0b38853423442958a6871c943c0d70"

RPROVIDES:${PN} += "lua-clingo"

RDEPENDS:${PN} += "clingo \
libc.so.6 \
libclingo.so.4 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6"

inherit rpm
