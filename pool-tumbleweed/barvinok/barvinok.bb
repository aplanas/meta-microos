SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "This is a library for computing homotopy continuation of a given root \
of one dimensional sections of bivariate complex polynomials."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.7"

RPM_NAME = "barvinok-0.41.7-1.1.aarch64.rpm"
RPM_HASH = "6068f85f8e454ade7e8a8883f7ccabff0625b17c7f4d536c2e76ba497875c0b6ae58b62b28793c9d88916549dce40ba9f1cd770badb86890259d61783bd48ec7"

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
