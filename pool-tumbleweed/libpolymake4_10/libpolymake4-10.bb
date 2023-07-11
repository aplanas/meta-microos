SUMMARY = "Library for studying combinatorics and geometry of convex polytopes"
DESCRIPTION = "polymake is a tool to study the combinatorics and the geometry of \
convex polytopes and polyhedra. It is also capable of dealing with \
simplicial complexes, matroids, polyhedral fans, graphs, tropical \
objects, and other objects."
LICENSE = "GPL-2.0-or-later"

PV = "4.10"

RPM_NAME = "libpolymake4_10-4.10-1.1.aarch64.rpm"
RPM_HASH = "a1c1ba69428b3f76c02c34354e4eb6b6039cc0f390231a53ad9bffe41e79aad664d79b7711070fb3b71750a1c10fe396f350727aa71b67d55479eb8731c39b36"

RPROVIDES:${PN} += "libpolymake-apps-rt.so.4.10 \
libpolymake.so.4.10 \
libpolymake4-10"

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
