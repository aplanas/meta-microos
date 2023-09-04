SUMMARY = "Documentation for the LilyPond Typesetter (cs)"
DESCRIPTION = "Czech documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.2"

RPM_NAME = "lilypond-doc-cs-2.24.2-1.1.noarch.rpm"
RPM_HASH = "e5f03d6cd3efbed325e70031dbc60ff47f03128730dcbd4e04cd4163c5fbd2d1fc41068bf1f8f0dc24abe42b146871e8c82977f0c65e434f19d1fcea9e337605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-cs"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
