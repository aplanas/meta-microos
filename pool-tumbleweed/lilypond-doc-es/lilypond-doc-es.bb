SUMMARY = "Documentation for the LilyPond Typesetter (es)"
DESCRIPTION = "Spanish documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-es-2.24.1-2.3.noarch.rpm"
RPM_HASH = "19a33888e48498cb420c7c948801bd034300ee75025d84d045e2fbbfb681c604f3e2a448abf6c2acd783ac94dea4fd8b8ca2b5c9ed8399ccde0096c799099331"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-es"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
