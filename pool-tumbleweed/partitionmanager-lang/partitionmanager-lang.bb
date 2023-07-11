SUMMARY = "Translations for package partitionmanager"
DESCRIPTION = "Provides translations for the 'partitionmanager' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "partitionmanager-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "c66074741f50fc04024bd8947b32deaef1e5186ed4b419eaa9e40f9e19cacf11208fa464eb189f8a02436d8ed957ff14c82448ffa50267cc9f5dae563abd83fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-partitionmanager-ar \
locale-partitionmanager-az \
locale-partitionmanager-bg \
locale-partitionmanager-bs \
locale-partitionmanager-ca \
locale-partitionmanager-ca@valencia \
locale-partitionmanager-cs \
locale-partitionmanager-da \
locale-partitionmanager-de \
locale-partitionmanager-el \
locale-partitionmanager-en-GB \
locale-partitionmanager-eo \
locale-partitionmanager-es \
locale-partitionmanager-et \
locale-partitionmanager-eu \
locale-partitionmanager-fi \
locale-partitionmanager-fr \
locale-partitionmanager-ga \
locale-partitionmanager-gl \
locale-partitionmanager-hr \
locale-partitionmanager-hu \
locale-partitionmanager-ia \
locale-partitionmanager-id \
locale-partitionmanager-is \
locale-partitionmanager-it \
locale-partitionmanager-ja \
locale-partitionmanager-ka \
locale-partitionmanager-ko \
locale-partitionmanager-lt \
locale-partitionmanager-lv \
locale-partitionmanager-mai \
locale-partitionmanager-mr \
locale-partitionmanager-nb \
locale-partitionmanager-nds \
locale-partitionmanager-nl \
locale-partitionmanager-nn \
locale-partitionmanager-pa \
locale-partitionmanager-pl \
locale-partitionmanager-pt \
locale-partitionmanager-pt-BR \
locale-partitionmanager-ro \
locale-partitionmanager-ru \
locale-partitionmanager-sk \
locale-partitionmanager-sl \
locale-partitionmanager-sr \
locale-partitionmanager-sr@ijekavian \
locale-partitionmanager-sr@ijekavianlatin \
locale-partitionmanager-sr@latin \
locale-partitionmanager-sv \
locale-partitionmanager-th \
locale-partitionmanager-tr \
locale-partitionmanager-ug \
locale-partitionmanager-uk \
locale-partitionmanager-zh-CN \
locale-partitionmanager-zh-TW \
partitionmanager-lang \
partitionmanager-lang-all"

RDEPENDS:${PN} += "partitionmanager"

inherit rpm
