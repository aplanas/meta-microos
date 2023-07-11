SUMMARY = "Translations for package onboard"
DESCRIPTION = "Provides translations for the 'onboard' package."
LICENSE = "GPL-3.0-only"

PV = "1.4.1"

RPM_NAME = "onboard-lang-1.4.1-7.7.noarch.rpm"
RPM_HASH = "19d71e92f3350dc5f25c0c8cb8106088c46344ce43ce8ba8f4623ca92e16f8267b8d025a174e1009f2239a1e4b7ca2dcf53e755aa11493fc49b2ab64910fff2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-onboard-af \
locale-onboard-ar \
locale-onboard-ast \
locale-onboard-az \
locale-onboard-be \
locale-onboard-bg \
locale-onboard-bn \
locale-onboard-br \
locale-onboard-bs \
locale-onboard-ca \
locale-onboard-ca@valencia \
locale-onboard-cs \
locale-onboard-cy \
locale-onboard-da \
locale-onboard-de \
locale-onboard-el \
locale-onboard-en-AU \
locale-onboard-en-CA \
locale-onboard-en-GB \
locale-onboard-eo \
locale-onboard-es \
locale-onboard-et \
locale-onboard-eu \
locale-onboard-fa \
locale-onboard-fi \
locale-onboard-fr \
locale-onboard-fr-CA \
locale-onboard-ga \
locale-onboard-gd \
locale-onboard-gl \
locale-onboard-he \
locale-onboard-hi \
locale-onboard-hr \
locale-onboard-hu \
locale-onboard-ia \
locale-onboard-id \
locale-onboard-is \
locale-onboard-it \
locale-onboard-ja \
locale-onboard-kk \
locale-onboard-km \
locale-onboard-kn \
locale-onboard-ko \
locale-onboard-lt \
locale-onboard-lv \
locale-onboard-ml \
locale-onboard-mr \
locale-onboard-ms \
locale-onboard-nb \
locale-onboard-ne \
locale-onboard-nl \
locale-onboard-nn \
locale-onboard-oc \
locale-onboard-pa \
locale-onboard-pl \
locale-onboard-pt \
locale-onboard-pt-BR \
locale-onboard-ro \
locale-onboard-ru \
locale-onboard-si \
locale-onboard-sk \
locale-onboard-sl \
locale-onboard-sq \
locale-onboard-sr \
locale-onboard-sv \
locale-onboard-ta \
locale-onboard-te \
locale-onboard-th \
locale-onboard-tr \
locale-onboard-ug \
locale-onboard-uk \
locale-onboard-vi \
locale-onboard-zh-CN \
locale-onboard-zh-HK \
locale-onboard-zh-TW \
onboard-lang \
onboard-lang-all"

RDEPENDS:${PN} += "onboard"

inherit rpm
