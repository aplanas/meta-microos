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

RPM_NAME = "libint2-2-2.7.2-2.4.aarch64.rpm"
RPM_HASH = "df3d39342c0757df5e5cb30f7e0d275b004398a010874f968275f6aa40452ece192e2782a38faeb46c86d1eb780f0d069556d0c18e6203b70e5c947ff298842f"

RPROVIDES:${PN} += "libint2-2 \
libint2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
