SUMMARY = "Lua extension for graphviz"
DESCRIPTION = "The graphviz-lua package contains the lua extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-lua-2.49.3-6.9.aarch64.rpm"
RPM_HASH = "a50a65be111de7af6162166e7273bbc8d04c49d029dc28ea93249bad44b4dad496fb216ec146251b4b875fbbc6c24bdfe79d17ceb73c5bebf2bfd1a66f4e1464"

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
