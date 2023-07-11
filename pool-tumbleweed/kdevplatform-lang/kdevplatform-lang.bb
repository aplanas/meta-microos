SUMMARY = "Translations for package kdevplatform"
DESCRIPTION = "Provides translations for the 'kdevplatform' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdevplatform-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "8a2affa673fa8c4b3863a45e706215f18b328b9d65e3b9cc7cfa3ffbff549d6930c266809d637316239fbc4ff1eb8c88bc2347d008fb42c6320de30dccbc35c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdevplatform-lang \
kdevplatform-lang-all \
locale-kdevplatform-ar \
locale-kdevplatform-az \
locale-kdevplatform-bg \
locale-kdevplatform-bs \
locale-kdevplatform-ca \
locale-kdevplatform-ca@valencia \
locale-kdevplatform-cs \
locale-kdevplatform-da \
locale-kdevplatform-de \
locale-kdevplatform-el \
locale-kdevplatform-en-GB \
locale-kdevplatform-eo \
locale-kdevplatform-es \
locale-kdevplatform-et \
locale-kdevplatform-eu \
locale-kdevplatform-fi \
locale-kdevplatform-fr \
locale-kdevplatform-ga \
locale-kdevplatform-gl \
locale-kdevplatform-hr \
locale-kdevplatform-hu \
locale-kdevplatform-it \
locale-kdevplatform-ja \
locale-kdevplatform-ka \
locale-kdevplatform-kk \
locale-kdevplatform-ko \
locale-kdevplatform-lt \
locale-kdevplatform-mr \
locale-kdevplatform-ms \
locale-kdevplatform-nb \
locale-kdevplatform-nds \
locale-kdevplatform-nl \
locale-kdevplatform-nn \
locale-kdevplatform-pa \
locale-kdevplatform-pl \
locale-kdevplatform-pt \
locale-kdevplatform-pt-BR \
locale-kdevplatform-ro \
locale-kdevplatform-ru \
locale-kdevplatform-sk \
locale-kdevplatform-sl \
locale-kdevplatform-sv \
locale-kdevplatform-tr \
locale-kdevplatform-ug \
locale-kdevplatform-uk \
locale-kdevplatform-zh-CN \
locale-kdevplatform-zh-TW"

RDEPENDS:${PN} += "kdevplatform"

inherit rpm
