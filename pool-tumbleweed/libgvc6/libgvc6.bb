SUMMARY = "Graphviz context library"
DESCRIPTION = "libgvc provides a context for applications wishing to manipulate and render \
graphs. It provides a command line parsing, common rendering code, and a \
plugin mechanism for renderers."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "libgvc6-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "23bf9332553492c7cc096cb57aa2d8a89afdd6d1683755c003a773024280ad7b030e217011f307b8a481483050184e74d6863a2c04237e88c94c6696ec8bb04f"

RPROVIDES:${PN} += "libgraphviz6-/usr/lib64/libgvc.so.6 \
libgvc.so.6 \
libgvc6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdt.so.5 \
libcgraph.so.6 \
libexpat.so.1 \
libltdl.so.7 \
libm.so.6 \
libpathplan.so.4 \
libz.so.1"

inherit rpm
