SUMMARY = "Ruby Extension for Graphviz"
DESCRIPTION = "The graphviz-ruby package contains the ruby extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-ruby-2.49.3-6.8.aarch64.rpm"
RPM_HASH = "86cf5ccb03d6db3593b206113fa3d4e2aa146660496fc36e6bf200013f7337044b35642af68209914401cbc877be5f9210fd25b7c72c60b55c0dbc75cfff11cf"

RPROVIDES:${PN} += "graphviz-ruby \
libgv-ruby.so"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.6 \
libgcc-s.so.1 \
libgvc.so.6 \
libruby3.2.so.3.2 \
libstdc++.so.6 \
ruby"

inherit rpm
