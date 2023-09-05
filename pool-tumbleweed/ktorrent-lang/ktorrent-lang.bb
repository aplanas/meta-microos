SUMMARY = "Translations for package ktorrent"
DESCRIPTION = "Provides translations for the 'ktorrent' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "ktorrent-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "ac1b31d597f76df19070485117e0c1c2668ea454eb473ec5c4c4e808024fb2f6dabc0442eb144620b17133d9bc770a2a5b313ff45c07aad7a4e7ab702b40cf19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktorrent-lang \
ktorrent-lang-all \
locale-ktorrent-ar \
locale-ktorrent-be \
locale-ktorrent-bg \
locale-ktorrent-bs \
locale-ktorrent-ca \
locale-ktorrent-ca@valencia \
locale-ktorrent-cs \
locale-ktorrent-da \
locale-ktorrent-de \
locale-ktorrent-el \
locale-ktorrent-en-GB \
locale-ktorrent-eo \
locale-ktorrent-es \
locale-ktorrent-et \
locale-ktorrent-eu \
locale-ktorrent-fi \
locale-ktorrent-fr \
locale-ktorrent-ga \
locale-ktorrent-gl \
locale-ktorrent-he \
locale-ktorrent-hi \
locale-ktorrent-hr \
locale-ktorrent-hu \
locale-ktorrent-ia \
locale-ktorrent-is \
locale-ktorrent-it \
locale-ktorrent-ja \
locale-ktorrent-ka \
locale-ktorrent-kk \
locale-ktorrent-km \
locale-ktorrent-ko \
locale-ktorrent-lt \
locale-ktorrent-lv \
locale-ktorrent-mr \
locale-ktorrent-ms \
locale-ktorrent-nb \
locale-ktorrent-nds \
locale-ktorrent-nl \
locale-ktorrent-nn \
locale-ktorrent-oc \
locale-ktorrent-pl \
locale-ktorrent-pt \
locale-ktorrent-pt-BR \
locale-ktorrent-ro \
locale-ktorrent-ru \
locale-ktorrent-si \
locale-ktorrent-sk \
locale-ktorrent-sl \
locale-ktorrent-sq \
locale-ktorrent-sr \
locale-ktorrent-sr@ijekavian \
locale-ktorrent-sr@ijekavianlatin \
locale-ktorrent-sr@latin \
locale-ktorrent-sv \
locale-ktorrent-tr \
locale-ktorrent-ug \
locale-ktorrent-uk \
locale-ktorrent-zh-CN \
locale-ktorrent-zh-TW"

RDEPENDS:${PN} += "ktorrent"

inherit rpm
