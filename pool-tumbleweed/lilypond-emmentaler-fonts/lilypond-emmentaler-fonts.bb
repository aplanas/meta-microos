SUMMARY = "Lilypond emmentaler fonts"
DESCRIPTION = "LilyPond is an automated music engraving system. It formats music \
beautifully and automatically, and has a friendly syntax for its input \
files. \
These are the lilypond emmentaler fonts."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-emmentaler-fonts-2.24.1-2.3.noarch.rpm"
RPM_HASH = "2ffe960ff5f2bcb1035b126901b3edab829d1dc080275959c01695b807e5b97fe430cec8d7cc2ba6a4b5de2009ab739e359e648e0c8aae2d0fc6fce454238ae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(emmentaler-11) \
font(emmentaler-13) \
font(emmentaler-14) \
font(emmentaler-16) \
font(emmentaler-18) \
font(emmentaler-20) \
font(emmentaler-23) \
font(emmentaler-26) \
font(emmentaler-brace) \
lilypond-emmentaler-fonts"
RDEPENDS:${PN} += ""

inherit rpm
