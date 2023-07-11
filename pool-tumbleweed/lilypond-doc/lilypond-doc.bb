SUMMARY = "Documentation for the LilyPond Typesetter"
DESCRIPTION = "Common and english documentation files for the \
GNU LilyPond music typesetter."
LICENSE = "GFDL-1.3-only"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-2.24.1-2.4.noarch.rpm"
RPM_HASH = "1c19980dfe7a9722470ba25dbe981e238a848ef0d72494b52dbd060e007f7ffc3b53172bc0579c2d88594abd1d40770aa27a2fd7d81eb55933ed2e13da3aeaf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc \
lilypond-documentation"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
