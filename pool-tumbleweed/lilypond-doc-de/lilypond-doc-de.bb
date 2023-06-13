SUMMARY = "Documentation for the LilyPond Typesetter (de)"
DESCRIPTION = "German documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-de-2.24.1-2.3.noarch.rpm"
RPM_HASH = "8c33f4e0c81e74981694dd2739ff4465c2b5e04ce6e705ac84f03f317bf967f189565644e25b5c78d301a619afd43ca86ba55c32c4b20fed37f2d87b24feaf1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-de"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
