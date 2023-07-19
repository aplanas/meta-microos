SUMMARY = "Development files for the VISL Constraint Grammar library"
DESCRIPTION = "Constraint Grammar (CG) is a methodological paradigm for natural \
language processing (NLP). Linguist-written, context dependent rules \
are compiled into a grammar that assigns grammatical tags \
('readings') to words or other tokens in running text. \
 \
This subpackage contains the files needed to build programs \
that want to use VISL CG-3."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.5"

RPM_NAME = "cg3-devel-1.4.5-1.1.aarch64.rpm"
RPM_HASH = "41ce13a5d818a49bbb4f59aa8f8b7e090e60ddd25361f0afb4a7e6e606d9eae6e40f17b6bc7c27c3a4ac6e1e461732767451420623e5501cdcee9816b58fd5a6"

RPROVIDES:${PN} += "cg3-devel \
pkgconfig-cg3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcg3-1"

inherit rpm
