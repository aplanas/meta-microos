SUMMARY = "Translations for package gthumb"
DESCRIPTION = "Provides translations for the 'gthumb' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.3"

RPM_NAME = "gthumb-lang-3.12.3-1.1.noarch.rpm"
RPM_HASH = "dbd99dba480632e97cade68ca969816e6a89cda15f24bc55effdb36b4cc10c7724c6168a4de338d26a226de392749ba9912bb5933e669916b8ccfec92e44f60d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gthumb-lang \
gthumb-lang-all \
locale-gthumb-ar \
locale-gthumb-az \
locale-gthumb-bg \
locale-gthumb-bs \
locale-gthumb-ca \
locale-gthumb-ca@valencia \
locale-gthumb-cs \
locale-gthumb-da \
locale-gthumb-de \
locale-gthumb-dz \
locale-gthumb-el \
locale-gthumb-en-CA \
locale-gthumb-en-GB \
locale-gthumb-eo \
locale-gthumb-es \
locale-gthumb-et \
locale-gthumb-eu \
locale-gthumb-fa \
locale-gthumb-fi \
locale-gthumb-fr \
locale-gthumb-ga \
locale-gthumb-gl \
locale-gthumb-gu \
locale-gthumb-he \
locale-gthumb-hi \
locale-gthumb-hr \
locale-gthumb-hu \
locale-gthumb-id \
locale-gthumb-is \
locale-gthumb-it \
locale-gthumb-ja \
locale-gthumb-ka \
locale-gthumb-kn \
locale-gthumb-ko \
locale-gthumb-lt \
locale-gthumb-lv \
locale-gthumb-mk \
locale-gthumb-ml \
locale-gthumb-ms \
locale-gthumb-nb \
locale-gthumb-nds \
locale-gthumb-ne \
locale-gthumb-nl \
locale-gthumb-nn \
locale-gthumb-oc \
locale-gthumb-pa \
locale-gthumb-pl \
locale-gthumb-pt \
locale-gthumb-pt-BR \
locale-gthumb-ro \
locale-gthumb-ru \
locale-gthumb-sk \
locale-gthumb-sl \
locale-gthumb-sq \
locale-gthumb-sr \
locale-gthumb-sr@latin \
locale-gthumb-sv \
locale-gthumb-th \
locale-gthumb-tr \
locale-gthumb-uk \
locale-gthumb-vi \
locale-gthumb-zh-CN \
locale-gthumb-zh-HK \
locale-gthumb-zh-TW"

RDEPENDS:${PN} += "gthumb"

inherit rpm
