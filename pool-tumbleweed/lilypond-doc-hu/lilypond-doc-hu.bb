SUMMARY = "Documentation for the LilyPond Typesetter (hu)"
DESCRIPTION = "Hungary documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-hu-2.24.1-2.4.noarch.rpm"
RPM_HASH = "4ad50772eef0b2140783e54a1e3bab69a84f03a42a5a2149b8d5a7f590270755ae1dad7b825e961afe6ae6e1829c390655ed9b2f3f388f7dd64b96e508e1bde3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-hu"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
