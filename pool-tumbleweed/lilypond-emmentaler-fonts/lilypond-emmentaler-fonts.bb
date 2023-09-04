SUMMARY = "Lilypond emmentaler fonts"
DESCRIPTION = "LilyPond is an automated music engraving system. It formats music \
beautifully and automatically, and has a friendly syntax for its input \
files. \
These are the lilypond emmentaler fonts."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.2"

RPM_NAME = "lilypond-emmentaler-fonts-2.24.2-1.1.noarch.rpm"
RPM_HASH = "9fc354048c7307674d015a890d9e7afa930560834ee8ec9635004154a4b5ad7a7f5257e8456bb87a4cffbebea4df7c5e52a3874d2d49de1f20707708a994ec27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-emmentaler-11 \
font-emmentaler-13 \
font-emmentaler-14 \
font-emmentaler-16 \
font-emmentaler-18 \
font-emmentaler-20 \
font-emmentaler-23 \
font-emmentaler-26 \
font-emmentaler-brace \
lilypond-emmentaler-fonts"

RDEPENDS:${PN} += ""

inherit rpm
