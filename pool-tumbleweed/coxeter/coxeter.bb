SUMMARY = "Computation on Coxeter groups"
DESCRIPTION = "The Coxeter 3 C++ library can be used to do computation on and with \
 \
  * General Coxeter groups, implemented through the combinatorics of \
    reduced words; \
  * Reduced expression and normal form computations; \
  * Bruhat ordering; \
  * Ordinary Kazhdan-Lusztig polynomials; \
  * Kazhdan-Lusztig polynomials with unequal parameters; \
  * Inverse Kazhdan-Lusztig polynomials; \
  * Cells and W-graphs;"
LICENSE = "GPL-2.0-or-later"

PV = "3.1+git7"

RPM_NAME = "coxeter-3.1+git7-1.12.aarch64.rpm"
RPM_HASH = "dc2acc87f89f345abb78b272e122aae0ed389cb24556841832cd6205f5d830d5dd70e2988311e604b556531f958bb4d46811ebbbb39bf6d435161bdae17abc27"

RPROVIDES:${PN} += "coxeter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
