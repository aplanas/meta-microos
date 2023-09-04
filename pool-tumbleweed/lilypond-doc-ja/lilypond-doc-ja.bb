SUMMARY = "Documentation for the LilyPond Typesetter (ja)"
DESCRIPTION = "Japanese documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.2"

RPM_NAME = "lilypond-doc-ja-2.24.2-1.1.noarch.rpm"
RPM_HASH = "c9521b0b37399f18c19428979b805e86905d378857ffa481a3f2e87a9e3248abbbb92049e0de1ffc3fda7794c027c49f3e7956a7abbfbde67657b29ba759cc23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-ja"

RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
