SUMMARY = "Documentation for texlive-context-bnf"
DESCRIPTION = "This package includes the documentation for texlive-context-bnf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-bnf-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "c4992d550e02f741fef4ce1e8defd00ecf2dd699e5c44834d592f989b5591b94b4a5c24337bb0a8081608b82cbcf98e3048041c05002fdde2840c5b2dc180e63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-bnf-doc"
RDEPENDS:${PN} += ""

inherit rpm
