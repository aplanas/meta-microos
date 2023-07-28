SUMMARY = "Translations for package colord"
DESCRIPTION = "Provides translations for the 'colord' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "colord-lang-1.4.6-3.1.noarch.rpm"
RPM_HASH = "2a3a8e60c344165738b852b7b6a23d5106fb64d6d1828ff3e27216779481ce638980bd911d6f30b33df2156eafa9f4dbe3a1e218e08e41444305faea64e40a93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colord-lang \
colord-lang-all \
locale-colord-as \
locale-colord-bn-IN \
locale-colord-ca \
locale-colord-cs \
locale-colord-da \
locale-colord-de \
locale-colord-el \
locale-colord-en-GB \
locale-colord-eo \
locale-colord-es \
locale-colord-eu \
locale-colord-fi \
locale-colord-fr \
locale-colord-fur \
locale-colord-gl \
locale-colord-gu \
locale-colord-he \
locale-colord-hi \
locale-colord-hr \
locale-colord-hu \
locale-colord-id \
locale-colord-is \
locale-colord-it \
locale-colord-ja \
locale-colord-kk \
locale-colord-kn \
locale-colord-ko \
locale-colord-lt \
locale-colord-lv \
locale-colord-ml \
locale-colord-mr \
locale-colord-nb \
locale-colord-nl \
locale-colord-oc \
locale-colord-or \
locale-colord-pa \
locale-colord-pl \
locale-colord-pt \
locale-colord-pt-BR \
locale-colord-ro \
locale-colord-ru \
locale-colord-sk \
locale-colord-sl \
locale-colord-sr \
locale-colord-sr@latin \
locale-colord-sv \
locale-colord-ta \
locale-colord-th \
locale-colord-tr \
locale-colord-uk \
locale-colord-zh-CN \
locale-colord-zh-TW"

RDEPENDS:${PN} += "colord"

inherit rpm
