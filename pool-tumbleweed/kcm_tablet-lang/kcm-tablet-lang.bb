SUMMARY = "Translations for package kcm_tablet"
DESCRIPTION = "Provides translations for the 'kcm_tablet' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "kcm_tablet-lang-3.2.0-5.8.noarch.rpm"
RPM_HASH = "47e9dd708945fcf5eecd14d04a88db52d88ebfe83090ff9cd8f65061a664967e76ddfc12b6ba229ecf0a303d753da051e99a3a5842fbb8b7b52e40cf56701a1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcm-tablet-lang \
kcm-tablet-lang-all \
locale-kcm-tablet-ar \
locale-kcm-tablet-ast \
locale-kcm-tablet-bg \
locale-kcm-tablet-bs \
locale-kcm-tablet-ca \
locale-kcm-tablet-ca@valencia \
locale-kcm-tablet-cs \
locale-kcm-tablet-da \
locale-kcm-tablet-de \
locale-kcm-tablet-el \
locale-kcm-tablet-en-GB \
locale-kcm-tablet-eo \
locale-kcm-tablet-es \
locale-kcm-tablet-et \
locale-kcm-tablet-fi \
locale-kcm-tablet-fr \
locale-kcm-tablet-ga \
locale-kcm-tablet-gl \
locale-kcm-tablet-hu \
locale-kcm-tablet-ia \
locale-kcm-tablet-id \
locale-kcm-tablet-it \
locale-kcm-tablet-ja \
locale-kcm-tablet-kk \
locale-kcm-tablet-km \
locale-kcm-tablet-ko \
locale-kcm-tablet-lt \
locale-kcm-tablet-mai \
locale-kcm-tablet-mr \
locale-kcm-tablet-nb \
locale-kcm-tablet-nds \
locale-kcm-tablet-nl \
locale-kcm-tablet-nn \
locale-kcm-tablet-pa \
locale-kcm-tablet-pl \
locale-kcm-tablet-pt \
locale-kcm-tablet-pt-BR \
locale-kcm-tablet-ro \
locale-kcm-tablet-ru \
locale-kcm-tablet-sk \
locale-kcm-tablet-sl \
locale-kcm-tablet-sv \
locale-kcm-tablet-tr \
locale-kcm-tablet-ug \
locale-kcm-tablet-uk \
locale-kcm-tablet-zh-CN \
locale-kcm-tablet-zh-TW"

RDEPENDS:${PN} += "kcm-tablet"

inherit rpm
