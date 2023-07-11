SUMMARY = "Tcl extension tools for graphviz"
DESCRIPTION = "The graphviz-tcl package contains the various tcl packages (extensions) \
for the graphviz tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-tcl-2.49.3-6.8.aarch64.rpm"
RPM_HASH = "e3d7a257d2cce67df049b3ad2dcf191a1d836113434c72b31c3411ba633fcb7632dfe71055b13de94839a1dcf7e58c018fc6dcaf615b8aa168db9b86e82a9f40"

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
