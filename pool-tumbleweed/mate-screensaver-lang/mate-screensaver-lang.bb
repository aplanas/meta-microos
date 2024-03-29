SUMMARY = "Translations for package mate-screensaver"
DESCRIPTION = "Provides translations for the 'mate-screensaver' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.26.2"

RPM_NAME = "mate-screensaver-lang-1.26.2-1.1.noarch.rpm"
RPM_HASH = "1e5447462bc99b79523914da4657d5dc8f7e7fa2b2913d86c44aae82d850bea38f879932c512479967ed3706a0179c95c8d38d74f284652038e5c32ad65aba9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-screensaver-af \
locale-mate-screensaver-ar \
locale-mate-screensaver-as \
locale-mate-screensaver-ast \
locale-mate-screensaver-az \
locale-mate-screensaver-be \
locale-mate-screensaver-bg \
locale-mate-screensaver-bn \
locale-mate-screensaver-bn-IN \
locale-mate-screensaver-br \
locale-mate-screensaver-bs \
locale-mate-screensaver-ca \
locale-mate-screensaver-ca@valencia \
locale-mate-screensaver-cs \
locale-mate-screensaver-cy \
locale-mate-screensaver-da \
locale-mate-screensaver-de \
locale-mate-screensaver-dz \
locale-mate-screensaver-el \
locale-mate-screensaver-en-AU \
locale-mate-screensaver-en-CA \
locale-mate-screensaver-en-GB \
locale-mate-screensaver-en-US \
locale-mate-screensaver-eo \
locale-mate-screensaver-es \
locale-mate-screensaver-es-AR \
locale-mate-screensaver-es-CO \
locale-mate-screensaver-es-MX \
locale-mate-screensaver-et \
locale-mate-screensaver-eu \
locale-mate-screensaver-fa \
locale-mate-screensaver-fi \
locale-mate-screensaver-fr \
locale-mate-screensaver-fr-CA \
locale-mate-screensaver-fur \
locale-mate-screensaver-ga \
locale-mate-screensaver-gl \
locale-mate-screensaver-gu \
locale-mate-screensaver-he \
locale-mate-screensaver-hi \
locale-mate-screensaver-hr \
locale-mate-screensaver-hu \
locale-mate-screensaver-ia \
locale-mate-screensaver-id \
locale-mate-screensaver-is \
locale-mate-screensaver-it \
locale-mate-screensaver-ja \
locale-mate-screensaver-ka \
locale-mate-screensaver-kk \
locale-mate-screensaver-kn \
locale-mate-screensaver-ko \
locale-mate-screensaver-lt \
locale-mate-screensaver-lv \
locale-mate-screensaver-mai \
locale-mate-screensaver-mk \
locale-mate-screensaver-ml \
locale-mate-screensaver-mr \
locale-mate-screensaver-ms \
locale-mate-screensaver-nb \
locale-mate-screensaver-nds \
locale-mate-screensaver-ne \
locale-mate-screensaver-nl \
locale-mate-screensaver-nn \
locale-mate-screensaver-oc \
locale-mate-screensaver-or \
locale-mate-screensaver-pa \
locale-mate-screensaver-pl \
locale-mate-screensaver-pt \
locale-mate-screensaver-pt-BR \
locale-mate-screensaver-ro \
locale-mate-screensaver-ru \
locale-mate-screensaver-si \
locale-mate-screensaver-sk \
locale-mate-screensaver-sl \
locale-mate-screensaver-sq \
locale-mate-screensaver-sr \
locale-mate-screensaver-sr@latin \
locale-mate-screensaver-sv \
locale-mate-screensaver-ta \
locale-mate-screensaver-te \
locale-mate-screensaver-th \
locale-mate-screensaver-tr \
locale-mate-screensaver-ug \
locale-mate-screensaver-uk \
locale-mate-screensaver-vi \
locale-mate-screensaver-wa \
locale-mate-screensaver-zh-CN \
locale-mate-screensaver-zh-HK \
locale-mate-screensaver-zh-TW \
mate-screensaver-lang \
mate-screensaver-lang-all"

RDEPENDS:${PN} += "mate-screensaver"

inherit rpm
