SUMMARY = "Translations for package pim-data-exporter"
DESCRIPTION = "Provides translations for the 'pim-data-exporter' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "pim-data-exporter-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "13cb813ad58c4e8d72724e849114a794d8c008ced049c8c8011a4305a38a620c313b595acdcfea37c1f08b5d73a5ba27b3c20094cb0bf97ab6adfd923fbc5a01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pim-data-exporter-ar \
locale-pim-data-exporter-az \
locale-pim-data-exporter-bg \
locale-pim-data-exporter-bs \
locale-pim-data-exporter-ca \
locale-pim-data-exporter-ca@valencia \
locale-pim-data-exporter-cs \
locale-pim-data-exporter-da \
locale-pim-data-exporter-de \
locale-pim-data-exporter-el \
locale-pim-data-exporter-en-GB \
locale-pim-data-exporter-es \
locale-pim-data-exporter-et \
locale-pim-data-exporter-eu \
locale-pim-data-exporter-fi \
locale-pim-data-exporter-fr \
locale-pim-data-exporter-ga \
locale-pim-data-exporter-gl \
locale-pim-data-exporter-hu \
locale-pim-data-exporter-ia \
locale-pim-data-exporter-it \
locale-pim-data-exporter-ja \
locale-pim-data-exporter-ka \
locale-pim-data-exporter-kk \
locale-pim-data-exporter-km \
locale-pim-data-exporter-ko \
locale-pim-data-exporter-lt \
locale-pim-data-exporter-lv \
locale-pim-data-exporter-mr \
locale-pim-data-exporter-nb \
locale-pim-data-exporter-nds \
locale-pim-data-exporter-nl \
locale-pim-data-exporter-pl \
locale-pim-data-exporter-pt \
locale-pim-data-exporter-pt-BR \
locale-pim-data-exporter-ro \
locale-pim-data-exporter-ru \
locale-pim-data-exporter-sk \
locale-pim-data-exporter-sl \
locale-pim-data-exporter-sr \
locale-pim-data-exporter-sr@ijekavian \
locale-pim-data-exporter-sr@ijekavianlatin \
locale-pim-data-exporter-sr@latin \
locale-pim-data-exporter-sv \
locale-pim-data-exporter-tr \
locale-pim-data-exporter-ug \
locale-pim-data-exporter-uk \
locale-pim-data-exporter-zh-CN \
locale-pim-data-exporter-zh-TW \
pim-data-exporter-lang \
pim-data-exporter-lang-all"

RDEPENDS:${PN} += "pim-data-exporter"

inherit rpm
