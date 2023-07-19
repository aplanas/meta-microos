SUMMARY = "VISL Constraint Grammar shared library"
DESCRIPTION = "Constraint Grammar (CG) is a methodological paradigm for natural \
language processing (NLP). Linguist-written, context dependent rules \
are compiled into a grammar that assigns grammatical tags \
('readings') to words or other tokens in running text."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.5"

RPM_NAME = "libcg3-1-1.4.5-1.1.aarch64.rpm"
RPM_HASH = "6de4e2a5b006610618ec9409a2f9aea925841f684c3348a89822907df73ba1c5d7ac5f9ad0b07e24a4f0d96fa8ddd60b4befcd6ad2eb58f7e21c985bd94e7886"

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
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
