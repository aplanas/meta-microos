SUMMARY = "Translations for package cervisia"
DESCRIPTION = "Provides translations for the 'cervisia' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only & LGPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "cervisia-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "ca165e95289b19ee3fe70d043965283614df734a8c842334ab6a3eab088b3274943f9805650820c73d4925a61fb66969f2060ec30b92ba3c3c6f4e9ee5510933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cervisia-lang \
cervisia-lang-all \
locale-cervisia-af \
locale-cervisia-ar \
locale-cervisia-be \
locale-cervisia-bg \
locale-cervisia-br \
locale-cervisia-bs \
locale-cervisia-ca \
locale-cervisia-ca@valencia \
locale-cervisia-cs \
locale-cervisia-cy \
locale-cervisia-da \
locale-cervisia-de \
locale-cervisia-el \
locale-cervisia-en-GB \
locale-cervisia-eo \
locale-cervisia-es \
locale-cervisia-et \
locale-cervisia-eu \
locale-cervisia-fa \
locale-cervisia-fi \
locale-cervisia-fr \
locale-cervisia-ga \
locale-cervisia-gl \
locale-cervisia-he \
locale-cervisia-hi \
locale-cervisia-hr \
locale-cervisia-hu \
locale-cervisia-is \
locale-cervisia-it \
locale-cervisia-ja \
locale-cervisia-ka \
locale-cervisia-kk \
locale-cervisia-km \
locale-cervisia-ko \
locale-cervisia-lt \
locale-cervisia-lv \
locale-cervisia-mai \
locale-cervisia-mk \
locale-cervisia-mr \
locale-cervisia-ms \
locale-cervisia-nb \
locale-cervisia-nds \
locale-cervisia-ne \
locale-cervisia-nl \
locale-cervisia-nn \
locale-cervisia-oc \
locale-cervisia-pa \
locale-cervisia-pl \
locale-cervisia-pt \
locale-cervisia-pt-BR \
locale-cervisia-ro \
locale-cervisia-ru \
locale-cervisia-sk \
locale-cervisia-sl \
locale-cervisia-sq \
locale-cervisia-sv \
locale-cervisia-ta \
locale-cervisia-tr \
locale-cervisia-ug \
locale-cervisia-uk \
locale-cervisia-zh-CN \
locale-cervisia-zh-TW"

RDEPENDS:${PN} += "cervisia"

inherit rpm
