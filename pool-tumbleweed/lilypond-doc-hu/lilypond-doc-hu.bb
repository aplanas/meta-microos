SUMMARY = "Documentation for the LilyPond Typesetter (hu)"
DESCRIPTION = "Hungary documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.2"

RPM_NAME = "lilypond-doc-hu-2.24.2-1.1.noarch.rpm"
RPM_HASH = "13a46f8168ceb411b3add0744667d4e96552a485b6e01ade63d2aac17c0fb9207df7af4e45b0028d8acda680a57fcbe4a529e600936c96ccf06a01692fa7e93d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-hu"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
