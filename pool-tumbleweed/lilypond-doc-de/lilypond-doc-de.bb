SUMMARY = "Documentation for the LilyPond Typesetter (de)"
DESCRIPTION = "German documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-de-2.24.1-2.4.noarch.rpm"
RPM_HASH = "f5efeaca483df3b5bb8682fa6e0273dfdcdb424124c21d1ad018240a1cd36f0fa05f1da68cefdb35205d0501ba1d0695489fb032c2a36dc1a9c001178f55e539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-de"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
