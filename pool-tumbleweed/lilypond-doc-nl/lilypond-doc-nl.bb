SUMMARY = "Documentation for the LilyPond Typesetter (nl)"
DESCRIPTION = "Dutch documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-nl-2.24.1-2.4.noarch.rpm"
RPM_HASH = "847bd5cfa2fe1f487d3bf107fb254cd0196426fe32cdd736a7be31a2019a4412c20e1449621094e6061b20004a0f4348cd4048e6cde29c27efa10fe5eb8a9650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-nl"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
