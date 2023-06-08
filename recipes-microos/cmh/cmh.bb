SUMMARY = "Igusa (genus 2) class polynomial computation"
DESCRIPTION = "This software package computes Igusa (genus 2) class polynomials, \
which parameterise the CM points in the moduli space of 2-dimensional \
abelian varieties, i.e. Jacobians of hyperelliptic curves. \
 \
This program is also able to compute theta constants at arbitrary \
precision."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.1"

RPM_NAME = "cmh-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "9b9b9bc13d8c51b2e21c4dd662367314468d2fd5cea486829e492c968b1a677346f9e651d1aa0688d3d35932393d108e2bebfd512acf9155aaf0a91706f220df"

RPROVIDES:${PN} += "cmh cmh(aarch-64) libparsepari.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcmh.so.0()(64bit) libfplll.so.8()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgmp.so.10()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libmpfrcx.so.1()(64bit) libpari-gmp-tls.so.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
