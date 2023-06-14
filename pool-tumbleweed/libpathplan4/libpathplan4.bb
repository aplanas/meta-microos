SUMMARY = "Library for finding smooth shortest paths"
DESCRIPTION = "The pathplan library contains functions for finding shortest paths in polygons \
in fitting bezier curves to those paths."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "libpathplan4-2.49.3-6.3.aarch64.rpm"
RPM_HASH = "1ea57237790c3ebf3f93d5ae51984b90f7066fc15dc899dec31db7be735db6778887595a024e10f9f435a0a877de77f934eea65f53e780ce6dd46539d4b90314"

RPROVIDES:${PN} += "libgraphviz6-/usr/lib64/libpathplan.so.4 \
libpathplan.so.4 \
libpathplan4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
