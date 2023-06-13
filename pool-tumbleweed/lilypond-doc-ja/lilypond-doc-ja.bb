SUMMARY = "Documentation for the LilyPond Typesetter (ja)"
DESCRIPTION = "Japanese documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-ja-2.24.1-2.3.noarch.rpm"
RPM_HASH = "81a26e3b093bd19e4b5bb9e84f61085f19237b4267b45a449d7df144c316baddc7314157fa5542ce57eb4784a1b2fb1f3e1f01931684c503b4a8944a8f7e6563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-ja"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
