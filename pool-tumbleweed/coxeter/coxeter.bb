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

RPM_NAME = "coxeter-3.1+git7-1.11.aarch64.rpm"
RPM_HASH = "e4beed23f7b15fc1338a3f3a77116259fcc52e058296ae29ca7369ed48e047f04dcca8010c47d0914dd256c2f1f4d5a35856b4687ad816eeec5b8f3251f3b3f9"

RPROVIDES:${PN} += "coxeter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
