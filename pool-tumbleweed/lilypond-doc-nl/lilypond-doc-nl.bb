SUMMARY = "Documentation for the LilyPond Typesetter (nl)"
DESCRIPTION = "Dutch documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-nl-2.24.1-2.3.noarch.rpm"
RPM_HASH = "169475c3ee992a75e1de5f3686d00cf2dea5b890076f651b7293cef1cee11e5eb0b0a6b514ac3f61d6aa8714e263ff1ffea074c9f83e12b48a6eb146598155dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-nl"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
