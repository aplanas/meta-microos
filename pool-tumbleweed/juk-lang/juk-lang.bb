SUMMARY = "Translations for package juk"
DESCRIPTION = "Provides translations for the 'juk' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "juk-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "459259370657c37c24c13aa180c4605d26389add192f85d6c316ea255e7354b412ba4117e7fe6c565cae61b5c2deee2c7ba8642bc3d966c97be7747b3aa2cd77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "juk-lang \
juk-lang-all \
locale-juk-ar \
locale-juk-be \
locale-juk-bg \
locale-juk-bn \
locale-juk-br \
locale-juk-bs \
locale-juk-ca \
locale-juk-ca@valencia \
locale-juk-cs \
locale-juk-cy \
locale-juk-da \
locale-juk-de \
locale-juk-el \
locale-juk-en-GB \
locale-juk-eo \
locale-juk-es \
locale-juk-et \
locale-juk-eu \
locale-juk-fa \
locale-juk-fi \
locale-juk-fr \
locale-juk-ga \
locale-juk-gl \
locale-juk-he \
locale-juk-hi \
locale-juk-hr \
locale-juk-hu \
locale-juk-ia \
locale-juk-id \
locale-juk-is \
locale-juk-it \
locale-juk-ja \
locale-juk-ka \
locale-juk-kk \
locale-juk-km \
locale-juk-ko \
locale-juk-lt \
locale-juk-lv \
locale-juk-mk \
locale-juk-mr \
locale-juk-ms \
locale-juk-nb \
locale-juk-nds \
locale-juk-ne \
locale-juk-nl \
locale-juk-nn \
locale-juk-oc \
locale-juk-pa \
locale-juk-pl \
locale-juk-pt \
locale-juk-pt-BR \
locale-juk-ro \
locale-juk-ru \
locale-juk-sk \
locale-juk-sl \
locale-juk-sq \
locale-juk-sr \
locale-juk-sr@ijekavian \
locale-juk-sr@ijekavianlatin \
locale-juk-sr@latin \
locale-juk-sv \
locale-juk-ta \
locale-juk-th \
locale-juk-tr \
locale-juk-ug \
locale-juk-uk \
locale-juk-zh-CN \
locale-juk-zh-TW"

RDEPENDS:${PN} += "juk"

inherit rpm
