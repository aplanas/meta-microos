SUMMARY = "A Computer algebra package for Lie group computations"
DESCRIPTION = "LiE is a computer algebra system that is specialised in computations \
involving (reductive) Lie groups and their representations."
LICENSE = "LGPL-3.0+"

PV = "2.2.2"

RPM_NAME = "LiE-2.2.2-6.31.aarch64.rpm"
RPM_HASH = "c24c57ddf7567c5825706a01fdce63931d0c66616df73b15fafc3be258ba31d67efdc51f89ef526c65b04b0173aa833e7bde344ecff95c943844bf0251990b6b"

RPROVIDES:${PN} += "LiE \
LiE(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
libc.so.6(GLIBC_2.34)(64bit) \
libreadline.so.8()(64bit)"

inherit rpm
