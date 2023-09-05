SUMMARY = "Translations for package kturtle"
DESCRIPTION = "Provides translations for the 'kturtle' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kturtle-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "77909fba00d12431762d2b8fce98d2dd83d020015afec8f055c1c26c988f73bb75b9a865a28fbd151d450508b149829d7a5edb0ec16774a64253f85a0a1ec73e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kturtle-lang \
kturtle-lang-all \
locale-kturtle-ar \
locale-kturtle-be \
locale-kturtle-bg \
locale-kturtle-bn \
locale-kturtle-br \
locale-kturtle-bs \
locale-kturtle-ca \
locale-kturtle-ca@valencia \
locale-kturtle-cs \
locale-kturtle-cy \
locale-kturtle-da \
locale-kturtle-de \
locale-kturtle-el \
locale-kturtle-en-GB \
locale-kturtle-eo \
locale-kturtle-es \
locale-kturtle-et \
locale-kturtle-eu \
locale-kturtle-fa \
locale-kturtle-fi \
locale-kturtle-fr \
locale-kturtle-ga \
locale-kturtle-gl \
locale-kturtle-he \
locale-kturtle-hi \
locale-kturtle-hr \
locale-kturtle-hu \
locale-kturtle-is \
locale-kturtle-it \
locale-kturtle-ja \
locale-kturtle-ka \
locale-kturtle-kk \
locale-kturtle-km \
locale-kturtle-ko \
locale-kturtle-lt \
locale-kturtle-lv \
locale-kturtle-mk \
locale-kturtle-ml \
locale-kturtle-mr \
locale-kturtle-ms \
locale-kturtle-nb \
locale-kturtle-nds \
locale-kturtle-ne \
locale-kturtle-nl \
locale-kturtle-nn \
locale-kturtle-oc \
locale-kturtle-pa \
locale-kturtle-pl \
locale-kturtle-pt \
locale-kturtle-pt-BR \
locale-kturtle-ro \
locale-kturtle-ru \
locale-kturtle-si \
locale-kturtle-sk \
locale-kturtle-sl \
locale-kturtle-sq \
locale-kturtle-sv \
locale-kturtle-ta \
locale-kturtle-tr \
locale-kturtle-ug \
locale-kturtle-uk \
locale-kturtle-zh-CN \
locale-kturtle-zh-TW"

RDEPENDS:${PN} += "kturtle"

inherit rpm
