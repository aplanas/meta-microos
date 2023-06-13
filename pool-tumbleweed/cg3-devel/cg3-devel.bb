SUMMARY = "Development files for the VISL Constraint Grammar library"
DESCRIPTION = "Constraint Grammar (CG) is a methodological paradigm for natural \
language processing (NLP). Linguist-written, context dependent rules \
are compiled into a grammar that assigns grammatical tags \
('readings') to words or other tokens in running text. \
 \
This subpackage contains the files needed to build programs \
that want to use VISL CG-3."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.9"

RPM_NAME = "cg3-devel-1.3.9-1.5.aarch64.rpm"
RPM_HASH = "81768ece96a3da763f50eef14f578a374822b613032c433000e002c1d244371db798b73944b58224fa70cb8f6b646c8a7efbb6511666ffdcfb9d78d353c324f7"

RPROVIDES:${PN} += "cg3-devel \
cg3-devel(aarch-64) \
pkgconfig(cg3)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcg3-1"

inherit rpm
