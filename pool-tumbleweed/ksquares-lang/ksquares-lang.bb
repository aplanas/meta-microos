SUMMARY = "Translations for package ksquares"
DESCRIPTION = "Provides translations for the 'ksquares' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ksquares-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "543e647c5d8423464e5ffd19be3a3c5fc05b06332de285c15c444e84e1858929f962102c0bfbcd658b5b04303691ee34214e399232eb140a1130d6b6c32e775e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksquares-lang \
ksquares-lang-all \
locale-ksquares-ar \
locale-ksquares-be \
locale-ksquares-bg \
locale-ksquares-bs \
locale-ksquares-ca \
locale-ksquares-ca@valencia \
locale-ksquares-cs \
locale-ksquares-da \
locale-ksquares-de \
locale-ksquares-el \
locale-ksquares-en-GB \
locale-ksquares-eo \
locale-ksquares-es \
locale-ksquares-et \
locale-ksquares-eu \
locale-ksquares-fi \
locale-ksquares-fr \
locale-ksquares-ga \
locale-ksquares-gl \
locale-ksquares-hi \
locale-ksquares-hr \
locale-ksquares-hu \
locale-ksquares-is \
locale-ksquares-it \
locale-ksquares-ja \
locale-ksquares-ka \
locale-ksquares-kk \
locale-ksquares-km \
locale-ksquares-ko \
locale-ksquares-lt \
locale-ksquares-lv \
locale-ksquares-mai \
locale-ksquares-ml \
locale-ksquares-mr \
locale-ksquares-nb \
locale-ksquares-nds \
locale-ksquares-nl \
locale-ksquares-nn \
locale-ksquares-oc \
locale-ksquares-pl \
locale-ksquares-pt \
locale-ksquares-pt-BR \
locale-ksquares-ro \
locale-ksquares-ru \
locale-ksquares-sk \
locale-ksquares-sl \
locale-ksquares-sq \
locale-ksquares-sr \
locale-ksquares-sr@ijekavian \
locale-ksquares-sr@ijekavianlatin \
locale-ksquares-sr@latin \
locale-ksquares-sv \
locale-ksquares-tr \
locale-ksquares-ug \
locale-ksquares-uk \
locale-ksquares-zh-CN \
locale-ksquares-zh-TW"

RDEPENDS:${PN} += "ksquares"

inherit rpm
