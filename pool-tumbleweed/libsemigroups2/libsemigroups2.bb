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

RPM_NAME = "libsemigroups2-2.7.1-1.1.aarch64.rpm"
RPM_HASH = "9b0d9d65a40bf95c51fd37d98ba923258c8994de60dd86148e8ae4b5a3988f9d78a6aa6dc561c5e6bf34a51ee465c1bd1c2f736c82839c22f3f50a3260186e7d"

RPROVIDES:${PN} += "libsemigroups.so.2()(64bit) \
libsemigroups2 \
libsemigroups2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
