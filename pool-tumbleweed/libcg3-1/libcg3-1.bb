SUMMARY = "VISL Constraint Grammar shared library"
DESCRIPTION = "Constraint Grammar (CG) is a methodological paradigm for natural \
language processing (NLP). Linguist-written, context dependent rules \
are compiled into a grammar that assigns grammatical tags \
('readings') to words or other tokens in running text."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.9"

RPM_NAME = "libcg3-1-1.3.9-1.5.aarch64.rpm"
RPM_HASH = "c8e034decfdb8b29569924aa17496a4595d00a7cb69e64258f053444ce026fabaff6afc3539fb5b3a0b228df987628e92f78b08b7dcab737762649bd214b583c"

RPROVIDES:${PN} += "libcg3-1 \
libcg3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuio.so.73 \
libicuuc.so.73 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
