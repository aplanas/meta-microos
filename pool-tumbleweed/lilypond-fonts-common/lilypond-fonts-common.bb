SUMMARY = "Lilypond fonts common dir"
DESCRIPTION = "LilyPond is an automated music engraving system. It formats music \
beautifully and automatically, and has a friendly syntax for its input \
files. \
This contains the directory common to all lilypond fonts."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.2"

RPM_NAME = "lilypond-fonts-common-2.24.2-1.1.noarch.rpm"
RPM_HASH = "832cc692c7d6aef7542c88c86e8118c76756487f741f25ff8317477f8778c99c4af17986e28abf71da16486f5f6b488f39c4454c358cd5257ccd5298fad4f3f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-fonts-common"

RDEPENDS:${PN} += "lilypond-emmentaler-fonts"

inherit rpm
