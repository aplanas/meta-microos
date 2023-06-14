SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "This is a library for computing homotopy continuation of a given root \
of one dimensional sections of bivariate complex polynomials."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.6"

RPM_NAME = "barvinok-0.41.6-1.4.aarch64.rpm"
RPM_HASH = "5cffc31e58c7b300e7a72ac1408f786dbd01c3cd35baa8fed0b5021ac4f0dc165686d0c837f5e465d7c9d103fc4e8aeda52c5b30d8192159d00c27c3bca4a6e7"

RPROVIDES:${PN} += "barvinok \
bundled-4ti2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbarvinok.so.23 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libisl.so.23 \
libntl.so.44 \
libpolylibgmp.so.8 \
libstdc++.so.6"

inherit rpm
