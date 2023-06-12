SUMMARY = "Documentation for the LilyPond Typesetter (zh)"
DESCRIPTION = "Chinese documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-zh-2.24.1-2.3.noarch.rpm"
RPM_HASH = "6dd12e783537bafa63522a8f06519f08e35adb7d3968579a9392cde5e748535f707ad6dd364e17c8cd0eac559d9e101ff1a979d8b0b3fe4ea7986fd9761f793b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-zh"
RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
