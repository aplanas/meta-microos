SUMMARY = "Library for studying combinatorics and geometry of convex polytopes"
DESCRIPTION = "polymake is a tool to study the combinatorics and the geometry of \
convex polytopes and polyhedra. It is also capable of dealing with \
simplicial complexes, matroids, polyhedral fans, graphs, tropical \
objects, and other objects."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "libpolymake4_9-4.9-1.3.aarch64.rpm"
RPM_HASH = "8e4f73ab03e5d28f32b426ebc90d500a1c16a269296cc4d9034ab02247a6776f2559c8232d962159927a8984b31d7755db68dc231f531da74bbedf0b9d83b98c"

RPROVIDES:${PN} += "libpolymake-apps-rt.so.4.9 \
libpolymake.so.4.9 \
libpolymake4-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflint.so.17 \
libgcc-s.so.1 \
libgmp.so.10 \
libgomp.so.1 \
libm.so.6 \
libmpfr.so.6 \
libperl.so \
libstdc++.so.6"

inherit rpm
