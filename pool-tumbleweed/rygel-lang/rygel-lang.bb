SUMMARY = "Translations for package rygel"
DESCRIPTION = "Provides translations for the 'rygel' package."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "rygel-lang-0.42.3-2.1.noarch.rpm"
RPM_HASH = "4639d6546e03f114d47dd80b24233e9d250f7214546a2df56b2413d7d672c289dbbddcdc159d5d7c70a080f3cb940c50af6a1fc3ae17df34c8380bea739e5a2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rygel-af \
locale-rygel-ar \
locale-rygel-as \
locale-rygel-be \
locale-rygel-bg \
locale-rygel-bn-IN \
locale-rygel-bs \
locale-rygel-ca \
locale-rygel-ca@valencia \
locale-rygel-cs \
locale-rygel-da \
locale-rygel-de \
locale-rygel-el \
locale-rygel-en-GB \
locale-rygel-eo \
locale-rygel-es \
locale-rygel-et \
locale-rygel-eu \
locale-rygel-fa \
locale-rygel-fi \
locale-rygel-fr \
locale-rygel-fur \
locale-rygel-gl \
locale-rygel-gu \
locale-rygel-he \
locale-rygel-hi \
locale-rygel-hr \
locale-rygel-hu \
locale-rygel-id \
locale-rygel-it \
locale-rygel-ja \
locale-rygel-ka \
locale-rygel-kk \
locale-rygel-kn \
locale-rygel-ko \
locale-rygel-lt \
locale-rygel-lv \
locale-rygel-ml \
locale-rygel-ms \
locale-rygel-nb \
locale-rygel-ne \
locale-rygel-nl \
locale-rygel-oc \
locale-rygel-pa \
locale-rygel-pl \
locale-rygel-pt \
locale-rygel-pt-BR \
locale-rygel-ro \
locale-rygel-ru \
locale-rygel-sk \
locale-rygel-sl \
locale-rygel-sr \
locale-rygel-sr@latin \
locale-rygel-sv \
locale-rygel-ta \
locale-rygel-te \
locale-rygel-th \
locale-rygel-tr \
locale-rygel-ug \
locale-rygel-uk \
locale-rygel-vi \
locale-rygel-zh-CN \
locale-rygel-zh-HK \
locale-rygel-zh-TW \
rygel-lang \
rygel-lang-all"

RDEPENDS:${PN} += "rygel"

inherit rpm
