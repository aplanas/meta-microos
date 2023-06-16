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

RPROVIDES:${PN} += "cmh \
libparsepari.so.0"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcmh.so.0 \
libfplll.so.8 \
libgcc-s.so.1 \
libgmp.so.10 \
libmpc.so.3 \
libmpfr.so.6 \
libmpfrcx.so.1 \
libpari-gmp-tls.so.8 \
libstdc++.so.6"

inherit rpm
