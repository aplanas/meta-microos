SUMMARY = "Translations for package kmail"
DESCRIPTION = "Provides translations for the 'kmail' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kmail-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "086cc5e01ae9ba595b7e8fdd84965fea5f68fd49bf0cad4a0bed0737ae78d8887b49b89fe393b6895a71c1bc5cdd918f83463151ed51664c1868674c9dc7e156"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmail-lang \
kmail-lang-all \
locale-kmail-af \
locale-kmail-ar \
locale-kmail-az \
locale-kmail-be \
locale-kmail-bg \
locale-kmail-bn \
locale-kmail-br \
locale-kmail-bs \
locale-kmail-ca \
locale-kmail-ca@valencia \
locale-kmail-cs \
locale-kmail-cy \
locale-kmail-da \
locale-kmail-de \
locale-kmail-el \
locale-kmail-en-GB \
locale-kmail-eo \
locale-kmail-es \
locale-kmail-et \
locale-kmail-eu \
locale-kmail-fa \
locale-kmail-fi \
locale-kmail-fr \
locale-kmail-ga \
locale-kmail-gl \
locale-kmail-he \
locale-kmail-hi \
locale-kmail-hr \
locale-kmail-hu \
locale-kmail-ia \
locale-kmail-id \
locale-kmail-is \
locale-kmail-it \
locale-kmail-ja \
locale-kmail-ka \
locale-kmail-kk \
locale-kmail-km \
locale-kmail-ko \
locale-kmail-lt \
locale-kmail-lv \
locale-kmail-mk \
locale-kmail-mr \
locale-kmail-ms \
locale-kmail-nb \
locale-kmail-nds \
locale-kmail-ne \
locale-kmail-nl \
locale-kmail-nn \
locale-kmail-pa \
locale-kmail-pl \
locale-kmail-pt \
locale-kmail-pt-BR \
locale-kmail-ro \
locale-kmail-ru \
locale-kmail-si \
locale-kmail-sk \
locale-kmail-sl \
locale-kmail-sq \
locale-kmail-sr \
locale-kmail-sr@ijekavian \
locale-kmail-sr@ijekavianlatin \
locale-kmail-sr@latin \
locale-kmail-sv \
locale-kmail-ta \
locale-kmail-th \
locale-kmail-tr \
locale-kmail-ug \
locale-kmail-uk \
locale-kmail-wa \
locale-kmail-zh-CN \
locale-kmail-zh-TW"

RDEPENDS:${PN} += "kmail"

inherit rpm
