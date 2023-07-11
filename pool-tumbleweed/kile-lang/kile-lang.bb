SUMMARY = "Translations for package kile"
DESCRIPTION = "Provides translations for the 'kile' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.93"

RPM_NAME = "kile-lang-2.9.93-2.22.noarch.rpm"
RPM_HASH = "5af443fc60ede3a2156ba7253bef0330d1ed5a2d55396bcd2ca6cc9c72ecc88a816ed1ed39cc21a57b9ce3d363917be6ee79a024764cdc0de03d1713bd604df9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kile-lang \
kile-lang-all \
locale-kile-ar \
locale-kile-bg \
locale-kile-bs \
locale-kile-ca \
locale-kile-ca@valencia \
locale-kile-cs \
locale-kile-da \
locale-kile-de \
locale-kile-el \
locale-kile-en-GB \
locale-kile-eo \
locale-kile-es \
locale-kile-et \
locale-kile-fi \
locale-kile-fr \
locale-kile-ga \
locale-kile-gl \
locale-kile-hi \
locale-kile-hu \
locale-kile-ia \
locale-kile-it \
locale-kile-ja \
locale-kile-kk \
locale-kile-ko \
locale-kile-lt \
locale-kile-mai \
locale-kile-mr \
locale-kile-ms \
locale-kile-nb \
locale-kile-nds \
locale-kile-nl \
locale-kile-nn \
locale-kile-pl \
locale-kile-pt \
locale-kile-pt-BR \
locale-kile-ro \
locale-kile-ru \
locale-kile-sk \
locale-kile-sl \
locale-kile-sv \
locale-kile-tr \
locale-kile-ug \
locale-kile-uk \
locale-kile-zh-CN \
locale-kile-zh-TW"

RDEPENDS:${PN} += "kile"

inherit rpm
