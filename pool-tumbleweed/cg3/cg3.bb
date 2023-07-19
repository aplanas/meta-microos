SUMMARY = "VISL Constraint Grammar implementation"
DESCRIPTION = "Constraint Grammar (CG) is a methodological paradigm for natural \
language processing (NLP). Linguist-written, context dependent rules \
are compiled into a grammar that assigns grammatical tags \
('readings') to words or other tokens in running text."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GPL-3.0-or-later & MIT"

PV = "1.4.5"

RPM_NAME = "cg3-1.4.5-1.1.aarch64.rpm"
RPM_HASH = "bfa447b77c78d071b3768b4e3ae91a5ff0acb64b35a5f0280f9fb3f8f867a010e8454887eb69a3d04605c2a793cddf659f803d169b7e87651d5fc9308dddc84d"

RPROVIDES:${PN} += "cg3"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcg3.so.1 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libstdc++.so.6 \
perl-Digest--SHA1 \
perl-File--Spec \
perl-Getopt--Long"

inherit rpm
