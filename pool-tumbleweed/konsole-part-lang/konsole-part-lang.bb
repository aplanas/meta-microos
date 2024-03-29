SUMMARY = "Translations for package konsole"
DESCRIPTION = "Provides translations for the 'konsole-part' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "konsole-part-lang-23.08.0-2.1.noarch.rpm"
RPM_HASH = "d963289a18b6b7c9e4dda35a6c61ee0eeb44ddcd23e29835ed2a206a80c9e8e945e9fcf6716afbe87c6453aba4a86670cc76a31e19645c9abdb4c7eeadf5fdaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "konsole-lang \
konsole-part-lang \
konsole-part-lang-all \
locale-konsole-part-af \
locale-konsole-part-ar \
locale-konsole-part-az \
locale-konsole-part-be \
locale-konsole-part-be@latin \
locale-konsole-part-bg \
locale-konsole-part-bn \
locale-konsole-part-bn-IN \
locale-konsole-part-br \
locale-konsole-part-bs \
locale-konsole-part-ca \
locale-konsole-part-ca@valencia \
locale-konsole-part-cs \
locale-konsole-part-cy \
locale-konsole-part-da \
locale-konsole-part-de \
locale-konsole-part-el \
locale-konsole-part-en-GB \
locale-konsole-part-eo \
locale-konsole-part-es \
locale-konsole-part-et \
locale-konsole-part-eu \
locale-konsole-part-fa \
locale-konsole-part-fi \
locale-konsole-part-fr \
locale-konsole-part-ga \
locale-konsole-part-gl \
locale-konsole-part-gu \
locale-konsole-part-he \
locale-konsole-part-hi \
locale-konsole-part-hr \
locale-konsole-part-hu \
locale-konsole-part-ia \
locale-konsole-part-id \
locale-konsole-part-is \
locale-konsole-part-it \
locale-konsole-part-ja \
locale-konsole-part-ka \
locale-konsole-part-kk \
locale-konsole-part-km \
locale-konsole-part-kn \
locale-konsole-part-ko \
locale-konsole-part-lt \
locale-konsole-part-lv \
locale-konsole-part-mai \
locale-konsole-part-mk \
locale-konsole-part-ml \
locale-konsole-part-mr \
locale-konsole-part-ms \
locale-konsole-part-nb \
locale-konsole-part-nds \
locale-konsole-part-ne \
locale-konsole-part-nl \
locale-konsole-part-nn \
locale-konsole-part-oc \
locale-konsole-part-or \
locale-konsole-part-pa \
locale-konsole-part-pl \
locale-konsole-part-pt \
locale-konsole-part-pt-BR \
locale-konsole-part-ro \
locale-konsole-part-ru \
locale-konsole-part-si \
locale-konsole-part-sk \
locale-konsole-part-sl \
locale-konsole-part-sq \
locale-konsole-part-sr \
locale-konsole-part-sr@ijekavian \
locale-konsole-part-sr@ijekavianlatin \
locale-konsole-part-sr@latin \
locale-konsole-part-sv \
locale-konsole-part-ta \
locale-konsole-part-te \
locale-konsole-part-th \
locale-konsole-part-tr \
locale-konsole-part-ug \
locale-konsole-part-uk \
locale-konsole-part-vi \
locale-konsole-part-wa \
locale-konsole-part-zh-CN \
locale-konsole-part-zh-TW"

RDEPENDS:${PN} += "konsole-part"

inherit rpm
