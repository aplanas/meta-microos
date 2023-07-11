SUMMARY = "Lilypond emmentaler fonts"
DESCRIPTION = "LilyPond is an automated music engraving system. It formats music \
beautifully and automatically, and has a friendly syntax for its input \
files. \
These are the lilypond emmentaler fonts."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-emmentaler-fonts-2.24.1-2.4.noarch.rpm"
RPM_HASH = "f862059e44fdfe25846f9293ab694d0916bdcac8c5b638588dd244fc44a7c804b10cb710dc443071797a4ad8acbe51d124e521c2f4d2aecd7f39d83a661d5b33"
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
