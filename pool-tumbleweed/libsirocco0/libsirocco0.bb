SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "This is a library for computing homotopy continuation of a given root \
of one dimensional sections of bivariate complex polynomials."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "libsirocco0-2.1.0-1.8.aarch64.rpm"
RPM_HASH = "9c4a400434c22d3ae61b48c608619d209450e5ab77bc927e80d04ce1f8d867295e31c410020b2c3bcd13dbbb38ea92f03673982285f55085909b6301ac47f36a"

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
