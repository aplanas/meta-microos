SUMMARY = "Translations for package blinken"
DESCRIPTION = "Provides translations for the 'blinken' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "blinken-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "afcdc4eae4216a3010c8bdfc4f5c30ceebaaf6ce640c748513167bf0d804a0d3cf06a2ea721f8420e4e92ee6d98568efad09d123057d1662510729873abe2b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blinken-lang \
blinken-lang-all \
locale-blinken-ar \
locale-blinken-be \
locale-blinken-bg \
locale-blinken-bn \
locale-blinken-br \
locale-blinken-bs \
locale-blinken-ca \
locale-blinken-ca@valencia \
locale-blinken-cs \
locale-blinken-cy \
locale-blinken-da \
locale-blinken-de \
locale-blinken-el \
locale-blinken-en-GB \
locale-blinken-eo \
locale-blinken-es \
locale-blinken-et \
locale-blinken-eu \
locale-blinken-fa \
locale-blinken-fi \
locale-blinken-fr \
locale-blinken-ga \
locale-blinken-gl \
locale-blinken-gu \
locale-blinken-he \
locale-blinken-hi \
locale-blinken-hr \
locale-blinken-hu \
locale-blinken-ia \
locale-blinken-is \
locale-blinken-it \
locale-blinken-ja \
locale-blinken-ka \
locale-blinken-kk \
locale-blinken-km \
locale-blinken-ko \
locale-blinken-lt \
locale-blinken-lv \
locale-blinken-mk \
locale-blinken-ml \
locale-blinken-mr \
locale-blinken-ms \
locale-blinken-nb \
locale-blinken-nds \
locale-blinken-ne \
locale-blinken-nl \
locale-blinken-nn \
locale-blinken-oc \
locale-blinken-pa \
locale-blinken-pl \
locale-blinken-pt \
locale-blinken-pt-BR \
locale-blinken-ro \
locale-blinken-ru \
locale-blinken-si \
locale-blinken-sk \
locale-blinken-sl \
locale-blinken-sq \
locale-blinken-sv \
locale-blinken-tr \
locale-blinken-ug \
locale-blinken-uk \
locale-blinken-vi \
locale-blinken-zh-CN \
locale-blinken-zh-TW"

RDEPENDS:${PN} += "blinken"

inherit rpm
