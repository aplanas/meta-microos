SUMMARY = "Library with algorithms for computing finite and finitely presented semigroups"
DESCRIPTION = "A C++14 library containing implementations of several algorithms for \
computing finite and finitely presented semigroups, namely: \
 \
  * the Froidure-Pin algorithm for computing finite semigroups \
  * the Todd-Coxeter algorithm for finitely presented semigroups and monoids; \
  * the Knuth-Bendix algorithm for finitely presented semigroups and monoids; \
  * the Schreier-Sims algorithm for permutation groups."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "libsemigroups2-2.7.1-1.2.aarch64.rpm"
RPM_HASH = "155382a0e6eeb91422296e4407b9e5f933fd44069238893b3c6f39b4ff56a4c11f7f082e9df46272e99296da48c8c4bdbfc7293f7ec0a1402b896c72d7a8c45c"

RPROVIDES:${PN} += "libsemigroups.so.2 \
libsemigroups2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfmt.so.9 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
