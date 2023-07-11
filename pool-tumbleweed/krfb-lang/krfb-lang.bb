SUMMARY = "Translations for package krfb"
DESCRIPTION = "Provides translations for the 'krfb' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "krfb-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "33957b2d8b4847159f6780ea79c7eef266420bde16d2c11127f7e1b6e8071047206b9f66d192dae18997097c984c0160e2d4b73d10f87c079d47a534a46a5bb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krfb-lang \
krfb-lang-all \
locale-krfb-af \
locale-krfb-ar \
locale-krfb-be \
locale-krfb-bg \
locale-krfb-br \
locale-krfb-bs \
locale-krfb-ca \
locale-krfb-ca@valencia \
locale-krfb-cs \
locale-krfb-cy \
locale-krfb-da \
locale-krfb-de \
locale-krfb-el \
locale-krfb-en-GB \
locale-krfb-eo \
locale-krfb-es \
locale-krfb-et \
locale-krfb-eu \
locale-krfb-fa \
locale-krfb-fi \
locale-krfb-fr \
locale-krfb-ga \
locale-krfb-gl \
locale-krfb-he \
locale-krfb-hi \
locale-krfb-hr \
locale-krfb-hu \
locale-krfb-ia \
locale-krfb-id \
locale-krfb-is \
locale-krfb-it \
locale-krfb-ja \
locale-krfb-ka \
locale-krfb-kk \
locale-krfb-km \
locale-krfb-ko \
locale-krfb-lt \
locale-krfb-lv \
locale-krfb-mai \
locale-krfb-mk \
locale-krfb-ml \
locale-krfb-mr \
locale-krfb-ms \
locale-krfb-nb \
locale-krfb-nds \
locale-krfb-ne \
locale-krfb-nl \
locale-krfb-nn \
locale-krfb-oc \
locale-krfb-pa \
locale-krfb-pl \
locale-krfb-pt \
locale-krfb-pt-BR \
locale-krfb-ro \
locale-krfb-ru \
locale-krfb-sk \
locale-krfb-sl \
locale-krfb-sq \
locale-krfb-sr \
locale-krfb-sr@ijekavian \
locale-krfb-sr@ijekavianlatin \
locale-krfb-sr@latin \
locale-krfb-sv \
locale-krfb-ta \
locale-krfb-th \
locale-krfb-tr \
locale-krfb-ug \
locale-krfb-uk \
locale-krfb-vi \
locale-krfb-zh-CN \
locale-krfb-zh-TW"

RDEPENDS:${PN} += "krfb"

inherit rpm
