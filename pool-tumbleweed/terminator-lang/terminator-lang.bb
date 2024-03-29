SUMMARY = "Translations for package terminator"
DESCRIPTION = "Provides translations for the 'terminator' package."
LICENSE = "GPL-2.0-only"

PV = "2.1.3"

RPM_NAME = "terminator-lang-2.1.3-1.3.noarch.rpm"
RPM_HASH = "3d619ca69e03744a0414f5ac62d43194bc7a288b9ea0a79a1ee363d21624aded9d45b06c3a4755d94f8f3368e25ec9704ea131a87d791ed2ad07a30012a5adc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-terminator-af \
locale-terminator-ar \
locale-terminator-ast \
locale-terminator-az \
locale-terminator-be \
locale-terminator-bg \
locale-terminator-bn \
locale-terminator-bs \
locale-terminator-ca \
locale-terminator-ca@valencia \
locale-terminator-cs \
locale-terminator-da \
locale-terminator-de \
locale-terminator-el \
locale-terminator-en-AU \
locale-terminator-en-CA \
locale-terminator-en-GB \
locale-terminator-eo \
locale-terminator-es \
locale-terminator-et \
locale-terminator-eu \
locale-terminator-fa \
locale-terminator-fi \
locale-terminator-fr \
locale-terminator-ga \
locale-terminator-gl \
locale-terminator-he \
locale-terminator-hi \
locale-terminator-hr \
locale-terminator-hu \
locale-terminator-ia \
locale-terminator-id \
locale-terminator-is \
locale-terminator-it \
locale-terminator-ja \
locale-terminator-ka \
locale-terminator-kk \
locale-terminator-ko \
locale-terminator-lt \
locale-terminator-lv \
locale-terminator-mk \
locale-terminator-ml \
locale-terminator-mr \
locale-terminator-ms \
locale-terminator-nb \
locale-terminator-nl \
locale-terminator-nn \
locale-terminator-oc \
locale-terminator-pl \
locale-terminator-pt \
locale-terminator-pt-BR \
locale-terminator-ro \
locale-terminator-ru \
locale-terminator-ru-RU \
locale-terminator-si \
locale-terminator-sk \
locale-terminator-sl \
locale-terminator-sq \
locale-terminator-sr \
locale-terminator-sv \
locale-terminator-ta \
locale-terminator-te \
locale-terminator-th \
locale-terminator-tr \
locale-terminator-ug \
locale-terminator-uk \
locale-terminator-vi \
locale-terminator-wa \
locale-terminator-zh-CN \
locale-terminator-zh-HK \
locale-terminator-zh-TW \
terminator-lang \
terminator-lang-all"

RDEPENDS:${PN} += "terminator"

inherit rpm
