SUMMARY = "Lilypond fonts common dir"
DESCRIPTION = "LilyPond is an automated music engraving system. It formats music \
beautifully and automatically, and has a friendly syntax for its input \
files. \
This contains the directory common to all lilypond fonts."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-fonts-common-2.24.1-2.4.noarch.rpm"
RPM_HASH = "004ca8b3c3c44df5d5e1628c8cac88c09483f70b726d56daa7284c07e235933d25a25fbad65f22dd905d7c5e39a8400e48bbe91acc5b6d576291e26d4e6073b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-fonts-common"

RDEPENDS:${PN} += "lilypond-emmentaler-fonts"

inherit rpm
