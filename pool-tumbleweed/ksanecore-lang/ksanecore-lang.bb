SUMMARY = "Translations for package ksanecore"
DESCRIPTION = "Provides translations for the 'ksanecore' package."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "ksanecore-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "57f9df3cb5825efb3f6ea9f0d0775c90febf57cfe24157b1768ae88255aab5e5055f139042c8c780cc065ba9f4e80527ee5148a200580c6aa4e52dc99c922ff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksanecore-lang \
ksanecore-lang-all \
locale-ksanecore-ar \
locale-ksanecore-bg \
locale-ksanecore-ca \
locale-ksanecore-ca@valencia \
locale-ksanecore-cs \
locale-ksanecore-de \
locale-ksanecore-en-GB \
locale-ksanecore-es \
locale-ksanecore-eu \
locale-ksanecore-fi \
locale-ksanecore-fr \
locale-ksanecore-gl \
locale-ksanecore-hi \
locale-ksanecore-it \
locale-ksanecore-ja \
locale-ksanecore-ka \
locale-ksanecore-ko \
locale-ksanecore-lt \
locale-ksanecore-nl \
locale-ksanecore-nn \
locale-ksanecore-pl \
locale-ksanecore-pt \
locale-ksanecore-pt-BR \
locale-ksanecore-ro \
locale-ksanecore-ru \
locale-ksanecore-sk \
locale-ksanecore-sl \
locale-ksanecore-sv \
locale-ksanecore-tr \
locale-ksanecore-uk \
locale-ksanecore-zh-CN \
locale-ksanecore-zh-TW"

RDEPENDS:${PN} += "ksanecore"

inherit rpm
