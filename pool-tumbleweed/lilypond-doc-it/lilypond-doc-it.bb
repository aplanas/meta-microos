SUMMARY = "Documentation for the LilyPond Typesetter (it)"
DESCRIPTION = "Italian documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-it-2.24.1-2.4.noarch.rpm"
RPM_HASH = "5898943acfd4f653d7740593aa4b28c0dacb3e40aec60d319c052ff28de5549ec1398773d25695d99a5471d8241d350aeacc0d9b49472df118c857b80766b0f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-it"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
