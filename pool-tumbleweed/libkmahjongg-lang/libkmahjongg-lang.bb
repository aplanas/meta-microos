SUMMARY = "Translations for package libkmahjongg"
DESCRIPTION = "Provides translations for the 'libkmahjongg' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libkmahjongg-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "1a2d65c8c72e3e1f6b3372e69643a93f3e93044a92549ced78a9f7897448559e7b2055b0eb69ff589a486af22c55bc71c1649c53dffe29de986a3a1b75fc731d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkmahjongg-lang \
libkmahjongg-lang-all \
locale-libkmahjongg-ar \
locale-libkmahjongg-be \
locale-libkmahjongg-bg \
locale-libkmahjongg-bs \
locale-libkmahjongg-ca \
locale-libkmahjongg-ca@valencia \
locale-libkmahjongg-cs \
locale-libkmahjongg-da \
locale-libkmahjongg-de \
locale-libkmahjongg-el \
locale-libkmahjongg-en-GB \
locale-libkmahjongg-eo \
locale-libkmahjongg-es \
locale-libkmahjongg-et \
locale-libkmahjongg-eu \
locale-libkmahjongg-fi \
locale-libkmahjongg-fr \
locale-libkmahjongg-ga \
locale-libkmahjongg-gl \
locale-libkmahjongg-gu \
locale-libkmahjongg-hi \
locale-libkmahjongg-hr \
locale-libkmahjongg-hu \
locale-libkmahjongg-id \
locale-libkmahjongg-is \
locale-libkmahjongg-it \
locale-libkmahjongg-ja \
locale-libkmahjongg-ka \
locale-libkmahjongg-kk \
locale-libkmahjongg-km \
locale-libkmahjongg-ko \
locale-libkmahjongg-lt \
locale-libkmahjongg-lv \
locale-libkmahjongg-mai \
locale-libkmahjongg-ml \
locale-libkmahjongg-mr \
locale-libkmahjongg-nb \
locale-libkmahjongg-nds \
locale-libkmahjongg-nl \
locale-libkmahjongg-nn \
locale-libkmahjongg-oc \
locale-libkmahjongg-pl \
locale-libkmahjongg-pt \
locale-libkmahjongg-pt-BR \
locale-libkmahjongg-ro \
locale-libkmahjongg-ru \
locale-libkmahjongg-sk \
locale-libkmahjongg-sl \
locale-libkmahjongg-sq \
locale-libkmahjongg-sr \
locale-libkmahjongg-sr@ijekavian \
locale-libkmahjongg-sr@ijekavianlatin \
locale-libkmahjongg-sr@latin \
locale-libkmahjongg-sv \
locale-libkmahjongg-th \
locale-libkmahjongg-tr \
locale-libkmahjongg-ug \
locale-libkmahjongg-uk \
locale-libkmahjongg-wa \
locale-libkmahjongg-zh-CN \
locale-libkmahjongg-zh-TW"

RDEPENDS:${PN} += "libkmahjongg"

inherit rpm
