SUMMARY = "Translations for package gnubg"
DESCRIPTION = "Provides translations for the 'gnubg' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.06.002"

RPM_NAME = "gnubg-lang-1.06.002-3.5.noarch.rpm"
RPM_HASH = "071c876a5570a617892441e610fb0f52101638541e156101a0f823860b78400a8d2c4da8a1e892b0089b394ceb507bbec67fde1a997c479ab7086fb65789e582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnubg-lang \
gnubg-lang-all \
locale-gnubg-cs \
locale-gnubg-da \
locale-gnubg-de \
locale-gnubg-el \
locale-gnubg-en-US \
locale-gnubg-es \
locale-gnubg-fr \
locale-gnubg-is \
locale-gnubg-it \
locale-gnubg-ja \
locale-gnubg-ro \
locale-gnubg-ru \
locale-gnubg-tr"

RDEPENDS:${PN} += "gnubg"

inherit rpm
