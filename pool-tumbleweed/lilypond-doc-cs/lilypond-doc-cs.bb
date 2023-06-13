SUMMARY = "Documentation for the LilyPond Typesetter (cs)"
DESCRIPTION = "Czech documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-cs-2.24.1-2.3.noarch.rpm"
RPM_HASH = "de150f3329d0a73bfd0b38c8567d3bfb347701f10e11332c94edd12e7bd3a318388d21b9bd6c18e35824b8284111eb6aaeb090fe745a2a173e78e18a0450d3de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-cs"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
