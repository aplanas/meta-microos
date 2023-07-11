SUMMARY = "Frontend to the PARI Computer Algebra System"
DESCRIPTION = " \
PARI/GP is a computer algebra system designed for computations \
in number theory (factorizations, algebraic number theory, elliptic \
curves) and other entities like matrices, polynomials, \
power series, algebraic numbers, and transcendental functions."
LICENSE = "GPL-2.0-only"

PV = "2.15.3"

RPM_NAME = "pari-gp-2.15.3-1.2.aarch64.rpm"
RPM_HASH = "f177629ed3c8424f9aab8d794b220b20655993ee68cf4155bace20bef507645dc9d251d5fa9902e19d48f9a9eaa26b80b576df54b1ca2049da0ce0c3f6540f08"

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
