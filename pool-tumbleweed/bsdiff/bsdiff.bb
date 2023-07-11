SUMMARY = "Tools for binary file patches"
DESCRIPTION = "bsdiff and bspatch are tools for building and applying patches to \
binary files. By using suffix sorting (specifically, Larsson and \
Sadakane's qsufsort) and taking advantage of how executable files \
change, bsdiff routinely produces binary patches 50-80% smaller \
than those produced by Xdelta, and 15% smaller than those produced \
by .RTPatch."
LICENSE = "BSD-2-Clause"

PV = "4.3"

RPM_NAME = "bsdiff-4.3-6.1.aarch64.rpm"
RPM_HASH = "ecf7792d0b45a04696b3695cc4ef4a619d02cb2c291ac91b38666b5367f892ddebea7a03fa67243f2f28a142a9436527bc9a8b468a28ac28139d6049ebf0382a"

RPROVIDES:${PN} += "bsdiff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6"

inherit rpm
