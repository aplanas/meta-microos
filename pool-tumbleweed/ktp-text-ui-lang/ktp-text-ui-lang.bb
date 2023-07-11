SUMMARY = "Translations for package ktp-text-ui"
DESCRIPTION = "Provides translations for the 'ktp-text-ui' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "ktp-text-ui-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "492aac30bd8cec03755fab831525715dba4d0a624bf9b3e17ca000dadf20106495a25e5f4fe64470ea5744cd51607f5907e13ebd71265080cb88aa59a119d74e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktp-text-ui-lang \
ktp-text-ui-lang-all \
locale-ktp-text-ui-ar \
locale-ktp-text-ui-bs \
locale-ktp-text-ui-ca \
locale-ktp-text-ui-ca@valencia \
locale-ktp-text-ui-cs \
locale-ktp-text-ui-da \
locale-ktp-text-ui-de \
locale-ktp-text-ui-el \
locale-ktp-text-ui-en-GB \
locale-ktp-text-ui-es \
locale-ktp-text-ui-et \
locale-ktp-text-ui-eu \
locale-ktp-text-ui-fi \
locale-ktp-text-ui-fr \
locale-ktp-text-ui-ga \
locale-ktp-text-ui-gl \
locale-ktp-text-ui-hu \
locale-ktp-text-ui-ia \
locale-ktp-text-ui-it \
locale-ktp-text-ui-ja \
locale-ktp-text-ui-ka \
locale-ktp-text-ui-kk \
locale-ktp-text-ui-km \
locale-ktp-text-ui-ko \
locale-ktp-text-ui-lt \
locale-ktp-text-ui-mr \
locale-ktp-text-ui-nb \
locale-ktp-text-ui-nds \
locale-ktp-text-ui-nl \
locale-ktp-text-ui-nn \
locale-ktp-text-ui-pa \
locale-ktp-text-ui-pl \
locale-ktp-text-ui-pt \
locale-ktp-text-ui-pt-BR \
locale-ktp-text-ui-ro \
locale-ktp-text-ui-ru \
locale-ktp-text-ui-sk \
locale-ktp-text-ui-sl \
locale-ktp-text-ui-sr \
locale-ktp-text-ui-sr@ijekavian \
locale-ktp-text-ui-sr@ijekavianlatin \
locale-ktp-text-ui-sr@latin \
locale-ktp-text-ui-sv \
locale-ktp-text-ui-tr \
locale-ktp-text-ui-ug \
locale-ktp-text-ui-uk \
locale-ktp-text-ui-vi \
locale-ktp-text-ui-wa \
locale-ktp-text-ui-zh-CN \
locale-ktp-text-ui-zh-TW"

RDEPENDS:${PN} += "ktp-text-ui"

inherit rpm
