SUMMARY = "Translations for package polari"
DESCRIPTION = "Provides translations for the 'polari' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "polari-lang-43.0-1.4.noarch.rpm"
RPM_HASH = "2c7e42ea16b12ef96f39dfbcab8f7f541edcc00db26bc06f918bc2d2ec6c51c9f5cb65105c620116d6092baf8df82ee8494b12cf75d785f6d68c03aee11f0ce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-polari-af \
locale-polari-ar \
locale-polari-as \
locale-polari-be \
locale-polari-bs \
locale-polari-ca \
locale-polari-ca@valencia \
locale-polari-cs \
locale-polari-da \
locale-polari-de \
locale-polari-el \
locale-polari-en-GB \
locale-polari-eo \
locale-polari-es \
locale-polari-et \
locale-polari-eu \
locale-polari-fa \
locale-polari-fi \
locale-polari-fr \
locale-polari-fur \
locale-polari-gl \
locale-polari-he \
locale-polari-hr \
locale-polari-hu \
locale-polari-id \
locale-polari-it \
locale-polari-ja \
locale-polari-ka \
locale-polari-kk \
locale-polari-ko \
locale-polari-lt \
locale-polari-lv \
locale-polari-ml \
locale-polari-ms \
locale-polari-nb \
locale-polari-ne \
locale-polari-nl \
locale-polari-oc \
locale-polari-pa \
locale-polari-pl \
locale-polari-pt \
locale-polari-pt-BR \
locale-polari-ro \
locale-polari-ru \
locale-polari-sk \
locale-polari-sl \
locale-polari-sr \
locale-polari-sr@latin \
locale-polari-sv \
locale-polari-te \
locale-polari-tr \
locale-polari-uk \
locale-polari-vi \
locale-polari-zh-CN \
locale-polari-zh-HK \
locale-polari-zh-TW \
polari-lang \
polari-lang-all"

RDEPENDS:${PN} += "polari"

inherit rpm
