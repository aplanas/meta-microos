SUMMARY = "Translations for package kdiff3"
DESCRIPTION = "Provides translations for the 'kdiff3' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.5"

RPM_NAME = "kdiff3-lang-1.10.5-1.1.noarch.rpm"
RPM_HASH = "6c9e8bb556a29a9bb71621f3ee33c666492d8449d2ab02ddc30a8340237ba7b669025042b27ed22e9647d2cee0b5b6aea7ebbcca5cb58dfcf6f8abe623291d1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdiff3-lang \
kdiff3-lang-all \
locale-kdiff3-ar \
locale-kdiff3-bg \
locale-kdiff3-br \
locale-kdiff3-bs \
locale-kdiff3-ca \
locale-kdiff3-ca@valencia \
locale-kdiff3-cs \
locale-kdiff3-cy \
locale-kdiff3-da \
locale-kdiff3-de \
locale-kdiff3-el \
locale-kdiff3-en-GB \
locale-kdiff3-eo \
locale-kdiff3-es \
locale-kdiff3-et \
locale-kdiff3-eu \
locale-kdiff3-fi \
locale-kdiff3-fr \
locale-kdiff3-ga \
locale-kdiff3-gl \
locale-kdiff3-hi \
locale-kdiff3-hu \
locale-kdiff3-ia \
locale-kdiff3-id \
locale-kdiff3-it \
locale-kdiff3-ja \
locale-kdiff3-ka \
locale-kdiff3-ko \
locale-kdiff3-lt \
locale-kdiff3-mai \
locale-kdiff3-ml \
locale-kdiff3-mr \
locale-kdiff3-nb \
locale-kdiff3-nds \
locale-kdiff3-nl \
locale-kdiff3-nn \
locale-kdiff3-pl \
locale-kdiff3-pt \
locale-kdiff3-pt-BR \
locale-kdiff3-ro \
locale-kdiff3-ru \
locale-kdiff3-sk \
locale-kdiff3-sl \
locale-kdiff3-sr \
locale-kdiff3-sr@ijekavian \
locale-kdiff3-sr@ijekavianlatin \
locale-kdiff3-sr@latin \
locale-kdiff3-sv \
locale-kdiff3-ta \
locale-kdiff3-tr \
locale-kdiff3-ug \
locale-kdiff3-uk \
locale-kdiff3-zh-CN \
locale-kdiff3-zh-TW"

RDEPENDS:${PN} += "kdiff3"

inherit rpm
