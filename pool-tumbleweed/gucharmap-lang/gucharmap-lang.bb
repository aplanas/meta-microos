SUMMARY = "Translations for package gucharmap"
DESCRIPTION = "Provides translations for the 'gucharmap' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "15.0.4"

RPM_NAME = "gucharmap-lang-15.0.4-1.1.noarch.rpm"
RPM_HASH = "0b5c1d1f3e6bbcc99fa84c1a50023551920fbb086301d579150bb2ef578c5bed10fd34648540af24e70682866fa4d8ca09204d70f6444d37a2abf239cea0bb69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gucharmap-lang \
gucharmap-lang-all \
locale-gucharmap-af \
locale-gucharmap-ar \
locale-gucharmap-as \
locale-gucharmap-ast \
locale-gucharmap-az \
locale-gucharmap-be \
locale-gucharmap-be@latin \
locale-gucharmap-bg \
locale-gucharmap-bn \
locale-gucharmap-bn-IN \
locale-gucharmap-br \
locale-gucharmap-bs \
locale-gucharmap-ca \
locale-gucharmap-ca@valencia \
locale-gucharmap-cs \
locale-gucharmap-cy \
locale-gucharmap-da \
locale-gucharmap-de \
locale-gucharmap-dz \
locale-gucharmap-el \
locale-gucharmap-en-CA \
locale-gucharmap-en-GB \
locale-gucharmap-en@shaw \
locale-gucharmap-eo \
locale-gucharmap-es \
locale-gucharmap-et \
locale-gucharmap-eu \
locale-gucharmap-fa \
locale-gucharmap-fi \
locale-gucharmap-fr \
locale-gucharmap-ga \
locale-gucharmap-gl \
locale-gucharmap-gu \
locale-gucharmap-he \
locale-gucharmap-hi \
locale-gucharmap-hr \
locale-gucharmap-hu \
locale-gucharmap-id \
locale-gucharmap-is \
locale-gucharmap-it \
locale-gucharmap-ja \
locale-gucharmap-ka \
locale-gucharmap-kk \
locale-gucharmap-kn \
locale-gucharmap-ko \
locale-gucharmap-lt \
locale-gucharmap-lv \
locale-gucharmap-mai \
locale-gucharmap-mk \
locale-gucharmap-ml \
locale-gucharmap-mr \
locale-gucharmap-ms \
locale-gucharmap-nb \
locale-gucharmap-ne \
locale-gucharmap-nl \
locale-gucharmap-nn \
locale-gucharmap-oc \
locale-gucharmap-or \
locale-gucharmap-pa \
locale-gucharmap-pl \
locale-gucharmap-pt \
locale-gucharmap-pt-BR \
locale-gucharmap-ro \
locale-gucharmap-ru \
locale-gucharmap-si \
locale-gucharmap-sk \
locale-gucharmap-sl \
locale-gucharmap-sq \
locale-gucharmap-sr \
locale-gucharmap-sr@latin \
locale-gucharmap-sv \
locale-gucharmap-ta \
locale-gucharmap-te \
locale-gucharmap-th \
locale-gucharmap-tr \
locale-gucharmap-ug \
locale-gucharmap-uk \
locale-gucharmap-vi \
locale-gucharmap-wa \
locale-gucharmap-zh-CN \
locale-gucharmap-zh-HK \
locale-gucharmap-zh-TW"

RDEPENDS:${PN} += "gucharmap"

inherit rpm
