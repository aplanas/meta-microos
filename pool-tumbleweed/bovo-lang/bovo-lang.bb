SUMMARY = "Translations for package bovo"
DESCRIPTION = "Provides translations for the 'bovo' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "bovo-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "a2c7f0b8b56b955e9658f5b4fa8ac8b59d02cc849688ab67384376daa64b295a520c547de3143825565325b2cf3734d03f9c066356d3f10ac73da6a4d57571b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bovo-lang \
bovo-lang-all \
locale-bovo-ar \
locale-bovo-be \
locale-bovo-bg \
locale-bovo-bs \
locale-bovo-ca \
locale-bovo-ca@valencia \
locale-bovo-cs \
locale-bovo-da \
locale-bovo-de \
locale-bovo-el \
locale-bovo-en-GB \
locale-bovo-eo \
locale-bovo-es \
locale-bovo-et \
locale-bovo-eu \
locale-bovo-fi \
locale-bovo-fr \
locale-bovo-ga \
locale-bovo-gl \
locale-bovo-hi \
locale-bovo-hr \
locale-bovo-hu \
locale-bovo-id \
locale-bovo-is \
locale-bovo-it \
locale-bovo-ja \
locale-bovo-ka \
locale-bovo-kk \
locale-bovo-km \
locale-bovo-ko \
locale-bovo-lt \
locale-bovo-lv \
locale-bovo-mai \
locale-bovo-ml \
locale-bovo-mr \
locale-bovo-nb \
locale-bovo-nds \
locale-bovo-nl \
locale-bovo-nn \
locale-bovo-oc \
locale-bovo-pa \
locale-bovo-pl \
locale-bovo-pt \
locale-bovo-pt-BR \
locale-bovo-ro \
locale-bovo-ru \
locale-bovo-sk \
locale-bovo-sl \
locale-bovo-sq \
locale-bovo-sr \
locale-bovo-sr@ijekavian \
locale-bovo-sr@ijekavianlatin \
locale-bovo-sr@latin \
locale-bovo-sv \
locale-bovo-tr \
locale-bovo-ug \
locale-bovo-uk \
locale-bovo-zh-CN \
locale-bovo-zh-TW"

RDEPENDS:${PN} += "bovo"

inherit rpm
