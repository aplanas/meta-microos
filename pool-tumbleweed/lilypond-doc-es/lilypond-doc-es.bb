SUMMARY = "Documentation for the LilyPond Typesetter (es)"
DESCRIPTION = "Spanish documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.2"

RPM_NAME = "lilypond-doc-es-2.24.2-1.1.noarch.rpm"
RPM_HASH = "bd45bf32cf7eeca08d80d340f63d09021bb6e2749e3737f345639fb01406b93184463a844c0fd64f3c02361522173d3ca5ee6b33ded4fe6bc868a2fb229ca6b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-es"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
