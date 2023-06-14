SUMMARY = "Lua bindings for Clingo"
DESCRIPTION = "Lua bindings for Clingo, a grounder and solver for logic programs. \
 \
Detailed information (including a User's manual), source code, and pre-compiled \
binaries are available at: http://potassco.org/"
LICENSE = "MIT"

PV = "5.6.2"

RPM_NAME = "lua-clingo-5.6.2-1.3.aarch64.rpm"
RPM_HASH = "472f40d8d63bf0dd18caacddf476c3cef21d167a5d9bce820c305d2d53f0925916de2c1a878e6552277bdbed7e328cf622dcf5685d2db81ba7a2fc25e980b5b7"

RPROVIDES:${PN} += "lua-clingo"

RDEPENDS:${PN} += "clingo \
libc.so.6 \
libclingo.so.4 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6"

inherit rpm
