SUMMARY = "Documentation for the LilyPond Typesetter (it)"
DESCRIPTION = "Italian documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.2"

RPM_NAME = "lilypond-doc-it-2.24.2-1.1.noarch.rpm"
RPM_HASH = "12b477cd59c68e4b482837cdb73ed7fdb70b932c3d2c70cf5100d1efcd9f1b11b16842f8385c0ddce3fe6a4f9e6579b3ee47d395bd5a6b7d64d0352fbcdb7498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-it"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
