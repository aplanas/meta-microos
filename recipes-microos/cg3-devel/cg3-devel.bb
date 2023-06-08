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

RPM_NAME = "cg3-devel-1.3.9-1.4.aarch64.rpm"
RPM_HASH = "fac9e0696aafaf2fbdea0f42060c52339fdde8bf7a48d7f0ba94e0518a3c280a25d7e3c050e8887ea8f64bdfea04dd88156e9dee601518cc8e9a73d7c98050a1"

RPROVIDES:${PN} += "cg3-devel cg3-devel(aarch-64) pkgconfig(cg3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcg3-1"

inherit rpm
