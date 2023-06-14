SUMMARY = "Translations for package konqueror"
DESCRIPTION = "Provides translations for the 'konqueror' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "konqueror-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "f5d99b4aa861fabb800e002d7ad5f651e4f16b60dd3bcc6cde0f72cd9cbb1cd1daf40adeaacbfb598641a67e47fddb2bc72924323807c841e620310bdf678238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "konqueror-lang \
konqueror-lang-all \
locale-konqueror-af \
locale-konqueror-ar \
locale-konqueror-be \
locale-konqueror-be@latin \
locale-konqueror-bg \
locale-konqueror-bn \
locale-konqueror-bn-IN \
locale-konqueror-br \
locale-konqueror-bs \
locale-konqueror-ca \
locale-konqueror-ca@valencia \
locale-konqueror-cs \
locale-konqueror-cy \
locale-konqueror-da \
locale-konqueror-de \
locale-konqueror-el \
locale-konqueror-en-GB \
locale-konqueror-eo \
locale-konqueror-es \
locale-konqueror-et \
locale-konqueror-eu \
locale-konqueror-fa \
locale-konqueror-fi \
locale-konqueror-fr \
locale-konqueror-ga \
locale-konqueror-gl \
locale-konqueror-gu \
locale-konqueror-he \
locale-konqueror-hi \
locale-konqueror-hr \
locale-konqueror-hu \
locale-konqueror-ia \
locale-konqueror-id \
locale-konqueror-is \
locale-konqueror-it \
locale-konqueror-ja \
locale-konqueror-ka \
locale-konqueror-kk \
locale-konqueror-km \
locale-konqueror-kn \
locale-konqueror-ko \
locale-konqueror-lt \
locale-konqueror-lv \
locale-konqueror-mai \
locale-konqueror-mk \
locale-konqueror-ml \
locale-konqueror-mr \
locale-konqueror-ms \
locale-konqueror-nb \
locale-konqueror-nds \
locale-konqueror-ne \
locale-konqueror-nl \
locale-konqueror-nn \
locale-konqueror-oc \
locale-konqueror-or \
locale-konqueror-pa \
locale-konqueror-pl \
locale-konqueror-pt \
locale-konqueror-pt-BR \
locale-konqueror-ro \
locale-konqueror-ru \
locale-konqueror-si \
locale-konqueror-sk \
locale-konqueror-sl \
locale-konqueror-sq \
locale-konqueror-sr \
locale-konqueror-sr@ijekavian \
locale-konqueror-sr@ijekavianlatin \
locale-konqueror-sr@latin \
locale-konqueror-sv \
locale-konqueror-ta \
locale-konqueror-te \
locale-konqueror-th \
locale-konqueror-tr \
locale-konqueror-ug \
locale-konqueror-uk \
locale-konqueror-vi \
locale-konqueror-wa \
locale-konqueror-zh-CN \
locale-konqueror-zh-HK \
locale-konqueror-zh-TW"

RDEPENDS:${PN} += "konqueror"

inherit rpm
