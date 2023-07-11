SUMMARY = "Development headers and libraries for libint"
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
This package contains development headers and libraries for libint."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libint-devel-2.7.2-2.4.aarch64.rpm"
RPM_HASH = "1e4fea9879d9bc25fd12a94c6669e7628d380385bfb8bf25a9c6b43f86a72c6ca23d49eef7a7e3fd2c80cc5cbe824e34e811e253a2617c61dedad01c9b0393ce"

RPROVIDES:${PN} += "libint-devel \
pkgconfig-libint2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
eigen3-devel \
libint2-2"

inherit rpm
