SUMMARY = "Documentation for the LilyPond Typesetter (hu)"
DESCRIPTION = "Hungary documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-hu-2.24.1-2.3.noarch.rpm"
RPM_HASH = "a979b38b1a4956e0d6b26fb61b2591ee3287acd74569733346b29c6083438eebc534fda838327555f76ba84e44f2d65f300ff936dfa6ad79dc27866f176096c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-hu"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
