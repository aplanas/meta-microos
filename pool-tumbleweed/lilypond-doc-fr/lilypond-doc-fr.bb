SUMMARY = "Documentation for the LilyPond Typesetter (fr)"
DESCRIPTION = "French documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.2"

RPM_NAME = "lilypond-doc-fr-2.24.2-1.1.noarch.rpm"
RPM_HASH = "a47887b5db37d7487f27e5978fd9df8938f2635e4490cf38a98d44dd408c6003b3f57a2913df4b988b49e47ff0a7b5d53dc0bdb52f1af473bf8f17edb65bfd38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-fr"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
