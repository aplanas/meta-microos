SUMMARY = "Igusa (genus 2) class polynomial computation"
DESCRIPTION = "This software package computes Igusa (genus 2) class polynomials, \
which parameterise the CM points in the moduli space of 2-dimensional \
abelian varieties, i.e. Jacobians of hyperelliptic curves. \
 \
This program is also able to compute theta constants at arbitrary \
precision."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.1"

RPM_NAME = "cmh-1.1.1-1.5.aarch64.rpm"
RPM_HASH = "2021c89fed2c16c03ba4178ab2570dc50184d1beeae6579e767d4b081b99e50dd1b835a9020e5935a80ea5a16f4d0956bf6b2a4d233990976f19096caeb4c463"

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
