SUMMARY = "Translations for package kgoldrunner"
DESCRIPTION = "Provides translations for the 'kgoldrunner' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kgoldrunner-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "14e4439fe63310a393a4402c128c962392d8e60aa43b594b5445feec44e8532f1a845762369b15a6d87f8c1f28d164e3e4ddb9844b979f497405dd50070083b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kgoldrunner-lang \
kgoldrunner-lang-all \
locale-kgoldrunner-ar \
locale-kgoldrunner-be \
locale-kgoldrunner-bg \
locale-kgoldrunner-bn \
locale-kgoldrunner-br \
locale-kgoldrunner-bs \
locale-kgoldrunner-ca \
locale-kgoldrunner-ca@valencia \
locale-kgoldrunner-cs \
locale-kgoldrunner-cy \
locale-kgoldrunner-da \
locale-kgoldrunner-de \
locale-kgoldrunner-el \
locale-kgoldrunner-en-GB \
locale-kgoldrunner-eo \
locale-kgoldrunner-es \
locale-kgoldrunner-et \
locale-kgoldrunner-eu \
locale-kgoldrunner-fa \
locale-kgoldrunner-fi \
locale-kgoldrunner-fr \
locale-kgoldrunner-ga \
locale-kgoldrunner-gl \
locale-kgoldrunner-hi \
locale-kgoldrunner-hr \
locale-kgoldrunner-hu \
locale-kgoldrunner-id \
locale-kgoldrunner-is \
locale-kgoldrunner-it \
locale-kgoldrunner-ja \
locale-kgoldrunner-kk \
locale-kgoldrunner-km \
locale-kgoldrunner-ko \
locale-kgoldrunner-lt \
locale-kgoldrunner-lv \
locale-kgoldrunner-mai \
locale-kgoldrunner-mk \
locale-kgoldrunner-ml \
locale-kgoldrunner-mr \
locale-kgoldrunner-nb \
locale-kgoldrunner-nds \
locale-kgoldrunner-ne \
locale-kgoldrunner-nl \
locale-kgoldrunner-nn \
locale-kgoldrunner-oc \
locale-kgoldrunner-pa \
locale-kgoldrunner-pl \
locale-kgoldrunner-pt \
locale-kgoldrunner-pt-BR \
locale-kgoldrunner-ro \
locale-kgoldrunner-ru \
locale-kgoldrunner-sk \
locale-kgoldrunner-sl \
locale-kgoldrunner-sq \
locale-kgoldrunner-sr \
locale-kgoldrunner-sr@ijekavian \
locale-kgoldrunner-sr@ijekavianlatin \
locale-kgoldrunner-sr@latin \
locale-kgoldrunner-sv \
locale-kgoldrunner-ta \
locale-kgoldrunner-te \
locale-kgoldrunner-tr \
locale-kgoldrunner-ug \
locale-kgoldrunner-uk \
locale-kgoldrunner-zh-CN \
locale-kgoldrunner-zh-TW"

RDEPENDS:${PN} += "kgoldrunner"

inherit rpm
