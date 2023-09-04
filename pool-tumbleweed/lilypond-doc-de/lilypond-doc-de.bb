SUMMARY = "Documentation for the LilyPond Typesetter (de)"
DESCRIPTION = "German documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.2"

RPM_NAME = "lilypond-doc-de-2.24.2-1.1.noarch.rpm"
RPM_HASH = "e998dff5bd9cc28079f32084475d3b881affb29a38322888c972c8e1ed71d296e6b7fc6124f5dd4a0ceaf3bd339df0e3790d28c4c5485e0746d5a0d29239d1dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-de"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
