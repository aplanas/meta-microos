SUMMARY = "Translations for package akonadi-server"
DESCRIPTION = "Provides translations for the 'akonadi-server' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-server-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "f095054f0c06473adc2ebe8e84edd35328c2073b78b5e30c11fd4426284f576c5edb7ec17dfdedb3f0cf05d305ea1b55040a85831538d6c6ac03dc24cdf35e82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadi-server-lang \
akonadi-server-lang-all \
locale-akonadi-server-ar \
locale-akonadi-server-az \
locale-akonadi-server-be \
locale-akonadi-server-bg \
locale-akonadi-server-bs \
locale-akonadi-server-ca \
locale-akonadi-server-ca@valencia \
locale-akonadi-server-cs \
locale-akonadi-server-da \
locale-akonadi-server-de \
locale-akonadi-server-el \
locale-akonadi-server-en-GB \
locale-akonadi-server-eo \
locale-akonadi-server-es \
locale-akonadi-server-et \
locale-akonadi-server-eu \
locale-akonadi-server-fi \
locale-akonadi-server-fr \
locale-akonadi-server-ga \
locale-akonadi-server-gl \
locale-akonadi-server-hu \
locale-akonadi-server-ia \
locale-akonadi-server-id \
locale-akonadi-server-it \
locale-akonadi-server-ja \
locale-akonadi-server-ka \
locale-akonadi-server-kk \
locale-akonadi-server-km \
locale-akonadi-server-ko \
locale-akonadi-server-lt \
locale-akonadi-server-lv \
locale-akonadi-server-mai \
locale-akonadi-server-mr \
locale-akonadi-server-nb \
locale-akonadi-server-nds \
locale-akonadi-server-nl \
locale-akonadi-server-nn \
locale-akonadi-server-pa \
locale-akonadi-server-pl \
locale-akonadi-server-pt \
locale-akonadi-server-pt-BR \
locale-akonadi-server-ro \
locale-akonadi-server-ru \
locale-akonadi-server-sk \
locale-akonadi-server-sl \
locale-akonadi-server-sq \
locale-akonadi-server-sr \
locale-akonadi-server-sr@ijekavian \
locale-akonadi-server-sr@ijekavianlatin \
locale-akonadi-server-sr@latin \
locale-akonadi-server-sv \
locale-akonadi-server-th \
locale-akonadi-server-tr \
locale-akonadi-server-ug \
locale-akonadi-server-uk \
locale-akonadi-server-zh-CN \
locale-akonadi-server-zh-TW"

RDEPENDS:${PN} += "akonadi-server"

inherit rpm
