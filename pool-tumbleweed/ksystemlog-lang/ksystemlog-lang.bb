SUMMARY = "Translations for package ksystemlog"
DESCRIPTION = "Provides translations for the 'ksystemlog' package."
LICENSE = "GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "ksystemlog-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "e3ef190ff70fd6d99d6ee4122e8cb40e871439ccd75975c8e7eb831c94baa8ff3b070c7a37f53ced156a6667207893048f75c8775f3c1c7eb425dd67ba7fa6e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksystemlog-lang \
ksystemlog-lang-all \
locale-ksystemlog-ar \
locale-ksystemlog-az \
locale-ksystemlog-be \
locale-ksystemlog-bg \
locale-ksystemlog-br \
locale-ksystemlog-bs \
locale-ksystemlog-ca \
locale-ksystemlog-ca@valencia \
locale-ksystemlog-cs \
locale-ksystemlog-cy \
locale-ksystemlog-da \
locale-ksystemlog-de \
locale-ksystemlog-el \
locale-ksystemlog-en-GB \
locale-ksystemlog-eo \
locale-ksystemlog-es \
locale-ksystemlog-et \
locale-ksystemlog-eu \
locale-ksystemlog-fi \
locale-ksystemlog-fr \
locale-ksystemlog-ga \
locale-ksystemlog-gl \
locale-ksystemlog-hr \
locale-ksystemlog-hu \
locale-ksystemlog-ia \
locale-ksystemlog-is \
locale-ksystemlog-it \
locale-ksystemlog-ja \
locale-ksystemlog-ka \
locale-ksystemlog-kk \
locale-ksystemlog-km \
locale-ksystemlog-ko \
locale-ksystemlog-lt \
locale-ksystemlog-lv \
locale-ksystemlog-mr \
locale-ksystemlog-nb \
locale-ksystemlog-nds \
locale-ksystemlog-nl \
locale-ksystemlog-nn \
locale-ksystemlog-oc \
locale-ksystemlog-pa \
locale-ksystemlog-pl \
locale-ksystemlog-pt \
locale-ksystemlog-pt-BR \
locale-ksystemlog-ro \
locale-ksystemlog-ru \
locale-ksystemlog-sk \
locale-ksystemlog-sl \
locale-ksystemlog-sr \
locale-ksystemlog-sr@ijekavian \
locale-ksystemlog-sr@ijekavianlatin \
locale-ksystemlog-sr@latin \
locale-ksystemlog-sv \
locale-ksystemlog-th \
locale-ksystemlog-tr \
locale-ksystemlog-ug \
locale-ksystemlog-uk \
locale-ksystemlog-zh-CN \
locale-ksystemlog-zh-TW"

RDEPENDS:${PN} += "ksystemlog"

inherit rpm
