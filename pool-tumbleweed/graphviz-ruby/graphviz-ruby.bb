SUMMARY = "Ruby Extension for Graphviz"
DESCRIPTION = "The graphviz-ruby package contains the ruby extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-ruby-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "a8a7c169a1782d4aeda423b920da0fffa0e70a7491e51b03ad0f11cdf30a88e9872226526054b4d0c4359b1474328a8f7758f5b9ded4e9782696b08d4d100b1d"

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
