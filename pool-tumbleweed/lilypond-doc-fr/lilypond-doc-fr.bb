SUMMARY = "Documentation for the LilyPond Typesetter (fr)"
DESCRIPTION = "French documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-fr-2.24.1-2.3.noarch.rpm"
RPM_HASH = "1c46624ea75f44866f6f6557d77f9b5d56e61c40cdea75378d30c1f1d60569e6d539955591a5c1ac048f8cf03ab71020abf6dcb3bb7f2cd1964f1b6477df76ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-fr"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
