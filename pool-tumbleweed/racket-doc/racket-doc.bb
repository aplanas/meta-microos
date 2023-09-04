SUMMARY = "Documentation HTML files for Racket"
DESCRIPTION = "A local installation of the Racket documentation system."
LICENSE = "Apache-2.0 | MIT"

PV = "8.10"

RPM_NAME = "racket-doc-8.10-1.1.noarch.rpm"
RPM_HASH = "ab07102a8deaf2438f74bb23211cfbbed1526787a31dc3e2d5744289b2dcd04872081bfcf1e84cbc3dd0ebe5234777acaf2943561f1eb7bbebe93eb8432a84dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "racket-/usr/share/doc/packages/racket/docindex.sqlite \
racket-doc"

RDEPENDS:${PN} += ""

inherit rpm
