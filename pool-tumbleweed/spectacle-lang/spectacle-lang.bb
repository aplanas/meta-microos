SUMMARY = "Translations for package spectacle"
DESCRIPTION = "Provides translations for the 'spectacle' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "spectacle-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "ec532d1d4f8ca8cbea46648ca2fe22213505e6054819199892abbf717cb39e8a8eebf2531a5b563c6e4bb05f681e611c625fa11cc02d417d7ac473d09cdd9387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-spectacle-ar \
locale-spectacle-az \
locale-spectacle-bg \
locale-spectacle-ca \
locale-spectacle-ca@valencia \
locale-spectacle-cs \
locale-spectacle-da \
locale-spectacle-de \
locale-spectacle-el \
locale-spectacle-en-GB \
locale-spectacle-es \
locale-spectacle-et \
locale-spectacle-eu \
locale-spectacle-fi \
locale-spectacle-fr \
locale-spectacle-gl \
locale-spectacle-he \
locale-spectacle-hu \
locale-spectacle-ia \
locale-spectacle-id \
locale-spectacle-is \
locale-spectacle-it \
locale-spectacle-ja \
locale-spectacle-ka \
locale-spectacle-ko \
locale-spectacle-lt \
locale-spectacle-ml \
locale-spectacle-nl \
locale-spectacle-nn \
locale-spectacle-pa \
locale-spectacle-pl \
locale-spectacle-pt \
locale-spectacle-pt-BR \
locale-spectacle-ro \
locale-spectacle-ru \
locale-spectacle-sk \
locale-spectacle-sl \
locale-spectacle-sr \
locale-spectacle-sr@ijekavian \
locale-spectacle-sr@ijekavianlatin \
locale-spectacle-sr@latin \
locale-spectacle-sv \
locale-spectacle-ta \
locale-spectacle-tr \
locale-spectacle-uk \
locale-spectacle-zh-CN \
locale-spectacle-zh-TW \
spectacle-lang \
spectacle-lang-all"

RDEPENDS:${PN} += "spectacle"

inherit rpm
