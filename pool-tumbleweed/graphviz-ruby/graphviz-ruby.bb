SUMMARY = "Ruby Extension for Graphviz"
DESCRIPTION = "The graphviz-ruby package contains the ruby extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-ruby-2.49.3-6.9.aarch64.rpm"
RPM_HASH = "474c6925e419f6cd5f059d9c414a14844ee2e183090f9a0dcb351d0f5ab7a71a2cd1503c30981c8763fec375caf84b57a11a9d8c4ebd23289898a6b2f2cc6ee5"

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
