SUMMARY = "Perl extension for Graphviz"
DESCRIPTION = "The graphviz-perl package contains the Perl extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-perl-2.49.3-6.9.aarch64.rpm"
RPM_HASH = "64a180f96ef8c48d8da233fa15533a4a170972f120f96a1843fb1a2c288e77f6d68a3d1dbe81d1b35d97fcaa02f12a8c2edb7dfd2c028355f6ff4043282931fe"

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
