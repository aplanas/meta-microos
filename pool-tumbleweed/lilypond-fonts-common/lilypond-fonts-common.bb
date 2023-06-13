SUMMARY = "Lilypond fonts common dir"
DESCRIPTION = "LilyPond is an automated music engraving system. It formats music \
beautifully and automatically, and has a friendly syntax for its input \
files. \
This contains the directory common to all lilypond fonts."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-fonts-common-2.24.1-2.3.noarch.rpm"
RPM_HASH = "92dd7ac325d662643f4d2353d4fdf941851f1ea51fd0a1ecfb71ad19cf0b556000e785109b535942f0f50d5961425d0ea217355d56d603b9a250741a07f890b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-fonts-common"

RDEPENDS:${PN} += "lilypond-emmentaler-fonts"

inherit rpm
