SUMMARY = "Program to compute symmetric power elliptic curve L-functions"
DESCRIPTION = "SYMPOW is a mathematical program to compute special values of \
symmetric power elliptic curve L-functions; it can compute up to \
about 64 digits of precision."
LICENSE = "BSD-2-Clause"

PV = "2.023.6"

RPM_NAME = "sympow-2.023.6-1.12.aarch64.rpm"
RPM_HASH = "fe41431b6e57e761ceb6bcf5e612f74c0606fd7566777fa3363d73cf257db65ecaadf5aa4a824cbd15d005f9e18a783156a70337dd320ab0060d3a5ac524460b"

RPROVIDES:${PN} += "sympow"

RDEPENDS:${PN} += "/usr/bin/sh \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
pari-gp \
sed"

inherit rpm
