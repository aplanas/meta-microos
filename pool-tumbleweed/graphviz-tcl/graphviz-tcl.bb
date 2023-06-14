SUMMARY = "Tcl extension tools for graphviz"
DESCRIPTION = "The graphviz-tcl package contains the various tcl packages (extensions) \
for the graphviz tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-tcl-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "de230cb7071698f5ff720617bcc08002c3f73aea00be2f090e4452f2a807658c2dcc6c85996bbc8c16af3ead3033bf891228a35be193ec36a41c0485f7d21717"

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
