SUMMARY = "Main libint library v2"
DESCRIPTION = "LIBINT computes the Coulomb and exchange integrals, which in electronic \
structure theory are called electron repulsion integrals (ERIs). This is by \
far the most common type of integrals in molecular structure theory. \
 \
LIBINT uses recursive schemes that originate in seminal Obara-Saika method and \
Head-Gordon and Pople’s variation thereof. The idea of LIBINT is to optimize \
computer implementation of such methods by implementing an optimizing compiler \
to generate automatically highly-specialized code that runs well on \
super-scalar architectures. \
 \
This package contains the library of the libint package."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libint2-2-2.7.2-2.3.aarch64.rpm"
RPM_HASH = "2c3597c45ed4de62eed8178354a6cc81e41fd079a5c1d9e0321bed56c3ca79fa1ad24a62cd289f075e32218502714f4f39727799c9b6fa70c9e9c49f8ecdf728"

RPROVIDES:${PN} += "libint2-2 \
libint2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
