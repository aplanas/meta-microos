SUMMARY = "Perl extension for Graphviz"
DESCRIPTION = "The graphviz-perl package contains the Perl extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-perl-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "3897ac5f537cdf072ddc4a7fe279c8220e6c9fbcd7284fffcd7b95de29df2325177cfb6da154e7142515305449836ffd11992b5262fbe4ec8a3646593d046261"

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
