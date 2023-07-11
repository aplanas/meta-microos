SUMMARY = "Translations for package kuiviewer"
DESCRIPTION = "Provides translations for the 'kuiviewer' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only & LGPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "kuiviewer-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "fded02ba1c35bf16f55034d22a627c6929a0f1b785736609dcc5e386ac3e9699aaaeed17d11bdc83899515391d799b6b2d5b7b7d8fb2d4496634fd5c445f2d34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kuiviewer-lang \
kuiviewer-lang-all \
locale-kuiviewer-ar \
locale-kuiviewer-az \
locale-kuiviewer-be \
locale-kuiviewer-bg \
locale-kuiviewer-br \
locale-kuiviewer-bs \
locale-kuiviewer-ca \
locale-kuiviewer-ca@valencia \
locale-kuiviewer-cs \
locale-kuiviewer-cy \
locale-kuiviewer-da \
locale-kuiviewer-de \
locale-kuiviewer-el \
locale-kuiviewer-en-GB \
locale-kuiviewer-eo \
locale-kuiviewer-es \
locale-kuiviewer-et \
locale-kuiviewer-eu \
locale-kuiviewer-fa \
locale-kuiviewer-fi \
locale-kuiviewer-fr \
locale-kuiviewer-ga \
locale-kuiviewer-gl \
locale-kuiviewer-hi \
locale-kuiviewer-hu \
locale-kuiviewer-id \
locale-kuiviewer-is \
locale-kuiviewer-it \
locale-kuiviewer-ja \
locale-kuiviewer-ka \
locale-kuiviewer-kk \
locale-kuiviewer-km \
locale-kuiviewer-ko \
locale-kuiviewer-lt \
locale-kuiviewer-lv \
locale-kuiviewer-mk \
locale-kuiviewer-mr \
locale-kuiviewer-ms \
locale-kuiviewer-nb \
locale-kuiviewer-nds \
locale-kuiviewer-ne \
locale-kuiviewer-nl \
locale-kuiviewer-nn \
locale-kuiviewer-oc \
locale-kuiviewer-pa \
locale-kuiviewer-pl \
locale-kuiviewer-pt \
locale-kuiviewer-pt-BR \
locale-kuiviewer-ro \
locale-kuiviewer-ru \
locale-kuiviewer-sk \
locale-kuiviewer-sl \
locale-kuiviewer-sq \
locale-kuiviewer-sv \
locale-kuiviewer-ta \
locale-kuiviewer-th \
locale-kuiviewer-tr \
locale-kuiviewer-ug \
locale-kuiviewer-uk \
locale-kuiviewer-zh-CN \
locale-kuiviewer-zh-TW"

RDEPENDS:${PN} += "kuiviewer"

inherit rpm
