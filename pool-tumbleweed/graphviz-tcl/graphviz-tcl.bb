SUMMARY = "Tcl extension tools for graphviz"
DESCRIPTION = "The graphviz-tcl package contains the various tcl packages (extensions) \
for the graphviz tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-tcl-2.49.3-6.9.aarch64.rpm"
RPM_HASH = "44c6c053165ffbc8bf37507656bfd2aa027687c50f32256cac3fed5eed3250e6ff00e2241c3867ca55c914e803955eee05081fe56b500f2ad0bc2bd6f99c8945"

RPROVIDES:${PN} += "graphviz-tcl \
libgdtclft.so.0 \
libgv-tcl.so \
libtcldot-builtin.so.0 \
libtcldot.so.0 \
libtclplan.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcgraph.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libgd.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgts-0.7.so.5 \
libgvc.so.6 \
libltdl.so.7 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpathplan.so.4 \
libstdc++.so.6 \
libz.so.1 \
tcl \
tk"

inherit rpm
