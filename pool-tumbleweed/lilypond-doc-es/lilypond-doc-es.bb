SUMMARY = "Documentation for the LilyPond Typesetter (es)"
DESCRIPTION = "Spanish documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-es-2.24.1-2.4.noarch.rpm"
RPM_HASH = "9679680df3625371bb20aa1f1fec092a53674bbd5e3ccbf08ea6b508407774ad1fad991b06abb2b75ae4bcee6d30b90a54877d4c8529cd3e0d31381224b3a3de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-es"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
