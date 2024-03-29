SUMMARY = "Translations for package konquest"
DESCRIPTION = "Provides translations for the 'konquest' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "konquest-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "410f5592aa2d97f1e01ed962a20aeffef9de54dde53ce015c463171435c80d0cf9abb433959ec36439c4df8547ef7a30e5fdd06d50f42efebbc3cfdd46009399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "konquest-lang \
konquest-lang-all \
locale-konquest-af \
locale-konquest-ar \
locale-konquest-be \
locale-konquest-bg \
locale-konquest-br \
locale-konquest-bs \
locale-konquest-ca \
locale-konquest-ca@valencia \
locale-konquest-cs \
locale-konquest-cy \
locale-konquest-da \
locale-konquest-de \
locale-konquest-el \
locale-konquest-en-GB \
locale-konquest-eo \
locale-konquest-es \
locale-konquest-et \
locale-konquest-eu \
locale-konquest-fa \
locale-konquest-fi \
locale-konquest-fr \
locale-konquest-ga \
locale-konquest-gl \
locale-konquest-he \
locale-konquest-hi \
locale-konquest-hr \
locale-konquest-hu \
locale-konquest-is \
locale-konquest-it \
locale-konquest-ja \
locale-konquest-ka \
locale-konquest-kk \
locale-konquest-km \
locale-konquest-ko \
locale-konquest-lt \
locale-konquest-lv \
locale-konquest-mai \
locale-konquest-mk \
locale-konquest-ml \
locale-konquest-mr \
locale-konquest-nb \
locale-konquest-nds \
locale-konquest-ne \
locale-konquest-nl \
locale-konquest-nn \
locale-konquest-oc \
locale-konquest-pa \
locale-konquest-pl \
locale-konquest-pt \
locale-konquest-pt-BR \
locale-konquest-ro \
locale-konquest-ru \
locale-konquest-sk \
locale-konquest-sl \
locale-konquest-sq \
locale-konquest-sr \
locale-konquest-sr@ijekavian \
locale-konquest-sr@ijekavianlatin \
locale-konquest-sr@latin \
locale-konquest-sv \
locale-konquest-ta \
locale-konquest-tr \
locale-konquest-ug \
locale-konquest-uk \
locale-konquest-zh-CN \
locale-konquest-zh-TW"

RDEPENDS:${PN} += "konquest"

inherit rpm
