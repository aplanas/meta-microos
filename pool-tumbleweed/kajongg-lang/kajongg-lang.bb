SUMMARY = "Translations for package kajongg"
DESCRIPTION = "Provides translations for the 'kajongg' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kajongg-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "fb0ba90ad4b5c3d462c44be758e5851cdfce3459ae603c5a16a198e9d3b97064ed9ada9773648af8f693b2af1d2483591a7f66642a06e7111aff3e0bc01e2862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kajongg-lang \
kajongg-lang-all \
locale-kajongg-ar \
locale-kajongg-bg \
locale-kajongg-bs \
locale-kajongg-ca \
locale-kajongg-ca@valencia \
locale-kajongg-cs \
locale-kajongg-da \
locale-kajongg-de \
locale-kajongg-el \
locale-kajongg-en-GB \
locale-kajongg-eo \
locale-kajongg-es \
locale-kajongg-et \
locale-kajongg-eu \
locale-kajongg-fi \
locale-kajongg-fr \
locale-kajongg-ga \
locale-kajongg-gl \
locale-kajongg-hu \
locale-kajongg-is \
locale-kajongg-it \
locale-kajongg-ja \
locale-kajongg-ka \
locale-kajongg-kk \
locale-kajongg-km \
locale-kajongg-lt \
locale-kajongg-mai \
locale-kajongg-ml \
locale-kajongg-mr \
locale-kajongg-nb \
locale-kajongg-nds \
locale-kajongg-nl \
locale-kajongg-nn \
locale-kajongg-pl \
locale-kajongg-pt \
locale-kajongg-pt-BR \
locale-kajongg-ro \
locale-kajongg-ru \
locale-kajongg-sk \
locale-kajongg-sl \
locale-kajongg-sr \
locale-kajongg-sr@ijekavian \
locale-kajongg-sr@ijekavianlatin \
locale-kajongg-sr@latin \
locale-kajongg-sv \
locale-kajongg-tr \
locale-kajongg-ug \
locale-kajongg-uk \
locale-kajongg-zh-CN \
locale-kajongg-zh-TW"

RDEPENDS:${PN} += "kajongg"

inherit rpm
