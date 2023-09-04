SUMMARY = "Translations for package kpackage"
DESCRIPTION = "Provides translations for the 'kpackage' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kpackage-lang-5.109.0-1.1.noarch.rpm"
RPM_HASH = "89de212ba297592bbc4e8ffa591b9120b7284033456586f1c36aeac6f98cb8a760016a4a8a88f77e9528315484a20943c00a5ad0591932468366653fe932427f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpackage-lang \
kpackage-lang-all \
locale-kpackage-ar \
locale-kpackage-az \
locale-kpackage-bs \
locale-kpackage-ca \
locale-kpackage-ca@valencia \
locale-kpackage-cs \
locale-kpackage-da \
locale-kpackage-de \
locale-kpackage-el \
locale-kpackage-en-GB \
locale-kpackage-es \
locale-kpackage-et \
locale-kpackage-eu \
locale-kpackage-fi \
locale-kpackage-fr \
locale-kpackage-gd \
locale-kpackage-gl \
locale-kpackage-he \
locale-kpackage-hu \
locale-kpackage-ia \
locale-kpackage-id \
locale-kpackage-it \
locale-kpackage-ja \
locale-kpackage-ka \
locale-kpackage-ko \
locale-kpackage-lt \
locale-kpackage-ml \
locale-kpackage-mr \
locale-kpackage-nb \
locale-kpackage-nds \
locale-kpackage-nl \
locale-kpackage-nn \
locale-kpackage-pa \
locale-kpackage-pl \
locale-kpackage-pt \
locale-kpackage-pt-BR \
locale-kpackage-ro \
locale-kpackage-ru \
locale-kpackage-sk \
locale-kpackage-sl \
locale-kpackage-sr \
locale-kpackage-sr@ijekavian \
locale-kpackage-sr@ijekavianlatin \
locale-kpackage-sr@latin \
locale-kpackage-sv \
locale-kpackage-tr \
locale-kpackage-ug \
locale-kpackage-uk \
locale-kpackage-zh-CN \
locale-kpackage-zh-TW"

RDEPENDS:${PN} += "kpackage"

inherit rpm
