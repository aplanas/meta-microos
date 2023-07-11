SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "This is a library for computing homotopy continuation of a given root \
of one dimensional sections of bivariate complex polynomials."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "libsirocco0-2.1.0-1.9.aarch64.rpm"
RPM_HASH = "2a528e792c84e54e3ef87b86b9382a23e8f1bb486a4e7fcd8204044e6e868b504bbbc6be2c9d2aa31b6f50c4f1f093119b417a428cb547c6d9961bd434b21c6e"

RPROVIDES:${PN} += "libsirocco.so.0 \
libsirocco0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
