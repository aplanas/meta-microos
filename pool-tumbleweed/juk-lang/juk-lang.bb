SUMMARY = "Translations for package juk"
DESCRIPTION = "Provides translations for the 'juk' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "juk-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "e7bcbca7f48db4dd766ce5f4d36d65cabcbc99c925869bdb98e2d28691e867e201020f9b05efa46c941f1625b2c27d354c60652e9173fc5e31763e8e8b0514d2"
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
