SUMMARY = "Documentation for the LilyPond Typesetter"
DESCRIPTION = "Common and english documentation files for the \
GNU LilyPond music typesetter."
LICENSE = "GFDL-1.3-only"

PV = "2.24.2"

RPM_NAME = "lilypond-doc-2.24.2-1.1.noarch.rpm"
RPM_HASH = "3aef11fc64584714b0534102e7882af911b48a9a200c1df11c3c29e11f75a322dd85948e5584553d8b8cb75e11d130cd2764ce5d074f2ec498aacc0d2c99f59b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc \
lilypond-documentation"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
