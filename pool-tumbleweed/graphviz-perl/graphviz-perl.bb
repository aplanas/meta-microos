SUMMARY = "Perl extension for Graphviz"
DESCRIPTION = "The graphviz-perl package contains the Perl extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-perl-2.49.3-6.8.aarch64.rpm"
RPM_HASH = "b7bbdf4eca89bf5ba0af624c15f17b51c9e67dc1108e7c9f516fcd04a09b2e31d5ce7953322bcd16c2bb1b3034eeb43d3b17f8eef7aea8e38e5446abf851b359"

RPROVIDES:${PN} += "graphviz-perl \
libgv-perl.so \
perl-gv \
perl-gvc"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.6 \
libgcc-s.so.1 \
libgvc.so.6 \
libperl.so \
libstdc++.so.6 \
perl"

inherit rpm
