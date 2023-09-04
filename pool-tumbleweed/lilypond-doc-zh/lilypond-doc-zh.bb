SUMMARY = "Documentation for the LilyPond Typesetter (zh)"
DESCRIPTION = "Chinese documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.2"

RPM_NAME = "lilypond-doc-zh-2.24.2-1.1.noarch.rpm"
RPM_HASH = "e07e1d8aa3195c191ab9ca90ac39fd5175ae987156bd5172876fe563730dc030a7514c559987c25b8a3f952540bcc2ed647392ae4d6bd5b5351eea74180bcca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-zh"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
