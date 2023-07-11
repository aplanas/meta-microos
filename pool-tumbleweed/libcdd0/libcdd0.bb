SUMMARY = "Library for finding vertices of convex polytopes"
DESCRIPTION = "cddlib is a C implementation of the Double Description Method of \
Motzkin et al. for generating all vertices (i.e. extreme points) and \
extreme rays of a general convex polyhedron in R^d given by a system \
of linear inequalities."
LICENSE = "GPL-2.0-or-later"

PV = "0.94m"

RPM_NAME = "libcdd0-0.94m-1.11.aarch64.rpm"
RPM_HASH = "c7b604350643a6368ebe2cbcd1818651860a6c2eaaa3efd4e22f222444cfc23505c96e70dd1b59495c94029e231b521eae5f1f85224ad1561ff2f433255e8843"

RPROVIDES:${PN} += "libcdd.so.0 \
libcdd0 \
libcddgmp.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
