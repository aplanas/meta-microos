SUMMARY = "Documentation for the LilyPond Typesetter (nl)"
DESCRIPTION = "Dutch documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.2"

RPM_NAME = "lilypond-doc-nl-2.24.2-1.1.noarch.rpm"
RPM_HASH = "527720556e7cee11c3866481b7ea62138bee8b1763d905295d43f0b4888bbdf6ca3bfd2b1c95b2d68559526abe8ac07dafb5542494c358273b747fa33b80f59c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-nl"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
