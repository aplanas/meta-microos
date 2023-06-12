SUMMARY = "Library for finding vertices of convex polytopes"
DESCRIPTION = "cddlib is a C implementation of the Double Description Method of \
Motzkin et al. for generating all vertices (i.e. extreme points) and \
extreme rays of a general convex polyhedron in R^d given by a system \
of linear inequalities."
LICENSE = "GPL-2.0-or-later"

PV = "0.94m"

RPM_NAME = "libcdd0-0.94m-1.10.aarch64.rpm"
RPM_HASH = "b17a7bbe79bc21c931a193da01f23a544397a0304f97e7b771d2d9dc9355fc3afd2968eee8060a8d94fe530cca531c8bcb5000fd825aeaa1d12ece596d940f1c"

RPROVIDES:${PN} += "libcdd.so.0()(64bit) \
libcdd0 \
libcdd0(aarch-64) \
libcddgmp.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit)"

inherit rpm
