SUMMARY = "Lua extension for graphviz"
DESCRIPTION = "The graphviz-lua package contains the lua extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-lua-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "4e1bfafd8c236ed840a6721d6c148f9c614438d02fdebfdfef0297bb520321eca9552fe8d7fac95227b308d22bea85da7ab6ff7d251f8a6369ba56b575f5aa94"

RPROVIDES:${PN} += "graphviz-lua \
libgv-lua.so"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.6 \
libgcc-s.so.1 \
libgvc.so.6 \
liblua5.4.so.5 \
libstdc++.so.6 \
lua"

inherit rpm
