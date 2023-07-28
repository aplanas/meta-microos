SUMMARY = "Frontend to the PARI Computer Algebra System"
DESCRIPTION = " \
PARI/GP is a computer algebra system designed for computations \
in number theory (factorizations, algebraic number theory, elliptic \
curves) and other entities like matrices, polynomials, \
power series, algebraic numbers, and transcendental functions."
LICENSE = "GPL-2.0-only"

PV = "2.15.4"

RPM_NAME = "pari-gp-2.15.4-1.1.aarch64.rpm"
RPM_HASH = "4bae2443e3323d5a42390cb0b260fbdebc9a77591ac5376b60c22fcfdcf64386d0c89187593d3f4b007cb7a39434daa11410aaaa4c18f1a3b4d067a7d7ebbdbe"

RPROVIDES:${PN} += "config-pari-gp \
pari-gp \
perl-PARI--822"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libpari-gmp-tls.so.8 \
libreadline.so.8"

inherit rpm
