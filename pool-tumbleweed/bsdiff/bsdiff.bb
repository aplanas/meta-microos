SUMMARY = "Tools for binary file patches"
DESCRIPTION = "bsdiff and bspatch are tools for building and applying patches to \
binary files. By using suffix sorting (specifically, Larsson and \
Sadakane's qsufsort) and taking advantage of how executable files \
change, bsdiff routinely produces binary patches 50-80% smaller \
than those produced by Xdelta, and 15% smaller than those produced \
by .RTPatch."
LICENSE = "BSD-2-Clause"

PV = "4.3"

RPM_NAME = "bsdiff-4.3-5.29.aarch64.rpm"
RPM_HASH = "d309bf84fe40e995f3b56b680a14cd281a864a83e115dd539a9d07b52f70f544f88f8cc813136fa60b7445140fb9085f4730a9e632235ce2010fa4efc52cf936"

RPROVIDES:${PN} += "bsdiff \
bsdiff(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
