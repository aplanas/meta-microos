SUMMARY = "Lua extension for graphviz"
DESCRIPTION = "The graphviz-lua package contains the lua extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-lua-2.49.3-6.8.aarch64.rpm"
RPM_HASH = "cae80ad3e7a7eeb3ef808756cf8937564ca3a2678eba747da57eaa0c8b0c973d4e3fa8455b86e8e43cff536eac9d34a35873974246451fe6240e1448e067da15"

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
