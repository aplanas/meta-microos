SUMMARY = "Documentation for the LilyPond Typesetter (ja)"
DESCRIPTION = "Japanese documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-ja-2.24.1-2.4.noarch.rpm"
RPM_HASH = "e37cc993e6c88b2b01c8a4eff2b6294113a8089216f75205da67cd8f62d74aaa884afaf5d6deb63fd4c10c8a0eabc1e195af421a4e7e5c95462b8d08f1e9b8a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-ja"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
