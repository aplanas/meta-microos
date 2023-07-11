SUMMARY = "Translations for package warpinator"
DESCRIPTION = "Provides translations for the 'warpinator' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.3"

RPM_NAME = "warpinator-lang-1.6.3-1.2.noarch.rpm"
RPM_HASH = "a96007b62345ead32d2bf77fa0a662068611a146aefaa44c5a2d4b99f9b720479065efc1307a3c5c8390bb669677ff7141ee8c3d6035b608ba110214c6cb62f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-warpinator-ar \
locale-warpinator-be \
locale-warpinator-bn \
locale-warpinator-ca \
locale-warpinator-cs \
locale-warpinator-cy \
locale-warpinator-da \
locale-warpinator-de \
locale-warpinator-el \
locale-warpinator-en-GB \
locale-warpinator-eo \
locale-warpinator-es \
locale-warpinator-et \
locale-warpinator-eu \
locale-warpinator-fi \
locale-warpinator-fr \
locale-warpinator-fr-CA \
locale-warpinator-he \
locale-warpinator-hi \
locale-warpinator-hr \
locale-warpinator-hu \
locale-warpinator-ia \
locale-warpinator-id \
locale-warpinator-is \
locale-warpinator-it \
locale-warpinator-ja \
locale-warpinator-kk \
locale-warpinator-kn \
locale-warpinator-ko \
locale-warpinator-lt \
locale-warpinator-nl \
locale-warpinator-oc \
locale-warpinator-pl \
locale-warpinator-pt \
locale-warpinator-pt-BR \
locale-warpinator-ro \
locale-warpinator-ru \
locale-warpinator-sk \
locale-warpinator-sr \
locale-warpinator-sr@latin \
locale-warpinator-sv \
locale-warpinator-tr \
locale-warpinator-uk \
locale-warpinator-zh-CN \
locale-warpinator-zh-HK \
warpinator-lang \
warpinator-lang-all"

RDEPENDS:${PN} += "warpinator"

inherit rpm
