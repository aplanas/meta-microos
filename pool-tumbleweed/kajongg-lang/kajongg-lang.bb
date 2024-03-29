SUMMARY = "Translations for package kajongg"
DESCRIPTION = "Provides translations for the 'kajongg' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kajongg-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "2456670bc8d6211211406a6e526036ec2072ae28863c4c1fe66e16e0fa24f2818ba0c4fae056ac98c1237c53b05a713cf6ab43fb29dbf6b720e7900542056adf"
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
