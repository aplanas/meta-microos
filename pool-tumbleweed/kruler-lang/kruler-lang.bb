SUMMARY = "Translations for package kruler"
DESCRIPTION = "Provides translations for the 'kruler' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kruler-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "07419f2b5e56008d330909c75446addaa4cd8e8f44efe70fc7c76e70c6601ff59e0595626c72a2812a55e33c6e84830d45a645af18259b78d4394a9de2d3adaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kruler-lang \
kruler-lang-all \
locale-kruler-af \
locale-kruler-ar \
locale-kruler-be \
locale-kruler-bg \
locale-kruler-br \
locale-kruler-bs \
locale-kruler-ca \
locale-kruler-ca@valencia \
locale-kruler-cs \
locale-kruler-cy \
locale-kruler-da \
locale-kruler-de \
locale-kruler-el \
locale-kruler-en-GB \
locale-kruler-eo \
locale-kruler-es \
locale-kruler-et \
locale-kruler-eu \
locale-kruler-fa \
locale-kruler-fi \
locale-kruler-fr \
locale-kruler-ga \
locale-kruler-gl \
locale-kruler-he \
locale-kruler-hi \
locale-kruler-hr \
locale-kruler-hu \
locale-kruler-ia \
locale-kruler-id \
locale-kruler-is \
locale-kruler-it \
locale-kruler-ja \
locale-kruler-ka \
locale-kruler-kk \
locale-kruler-km \
locale-kruler-ko \
locale-kruler-lt \
locale-kruler-lv \
locale-kruler-mk \
locale-kruler-ml \
locale-kruler-mr \
locale-kruler-ms \
locale-kruler-nb \
locale-kruler-nds \
locale-kruler-ne \
locale-kruler-nl \
locale-kruler-nn \
locale-kruler-oc \
locale-kruler-pa \
locale-kruler-pl \
locale-kruler-pt \
locale-kruler-pt-BR \
locale-kruler-ro \
locale-kruler-ru \
locale-kruler-si \
locale-kruler-sk \
locale-kruler-sl \
locale-kruler-sq \
locale-kruler-sr \
locale-kruler-sr@ijekavian \
locale-kruler-sr@ijekavianlatin \
locale-kruler-sr@latin \
locale-kruler-sv \
locale-kruler-ta \
locale-kruler-th \
locale-kruler-tr \
locale-kruler-ug \
locale-kruler-uk \
locale-kruler-vi \
locale-kruler-zh-CN \
locale-kruler-zh-HK \
locale-kruler-zh-TW"

RDEPENDS:${PN} += "kruler"

inherit rpm
