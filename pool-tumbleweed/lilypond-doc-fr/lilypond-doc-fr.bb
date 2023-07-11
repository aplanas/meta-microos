SUMMARY = "Documentation for the LilyPond Typesetter (fr)"
DESCRIPTION = "French documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-fr-2.24.1-2.4.noarch.rpm"
RPM_HASH = "07a3125dbd3babf7d03c5946dff6ebcb6d74f13e2d84d2f31ede8219cec9926c8c5b074bcf38c1bfee6ba6b97c71f40ce39e472a1c51484310f3e5222740c1ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-fr"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
