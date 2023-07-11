SUMMARY = "Documentation for the LilyPond Typesetter (cs)"
DESCRIPTION = "Czech documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-cs-2.24.1-2.4.noarch.rpm"
RPM_HASH = "6253335aba5f8e40f5834bd2afaa0f3ef6f188f8e63a91046d3aa60745e783ee57aa2f89e9d7d1a6137fa14475724327ba992a5e43fe19363d084bfb31cd9722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-cs"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
