SUMMARY = "Translations for package kspaceduel"
DESCRIPTION = "Provides translations for the 'kspaceduel' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kspaceduel-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "1087446b3d79e95d28cf4a87ebd97e4e9e709294b5d1a837e6f60bb0c20edc7057ac95aefc7fdfd59bd035bbb3cee55961bb6475f8892eb034458def8ac78180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kspaceduel-lang \
kspaceduel-lang-all \
locale-kspaceduel-af \
locale-kspaceduel-ar \
locale-kspaceduel-be \
locale-kspaceduel-bg \
locale-kspaceduel-br \
locale-kspaceduel-bs \
locale-kspaceduel-ca \
locale-kspaceduel-ca@valencia \
locale-kspaceduel-cs \
locale-kspaceduel-cy \
locale-kspaceduel-da \
locale-kspaceduel-de \
locale-kspaceduel-el \
locale-kspaceduel-en-GB \
locale-kspaceduel-eo \
locale-kspaceduel-es \
locale-kspaceduel-et \
locale-kspaceduel-eu \
locale-kspaceduel-fa \
locale-kspaceduel-fi \
locale-kspaceduel-fr \
locale-kspaceduel-ga \
locale-kspaceduel-gl \
locale-kspaceduel-he \
locale-kspaceduel-hi \
locale-kspaceduel-hr \
locale-kspaceduel-hu \
locale-kspaceduel-is \
locale-kspaceduel-it \
locale-kspaceduel-ja \
locale-kspaceduel-ka \
locale-kspaceduel-kk \
locale-kspaceduel-km \
locale-kspaceduel-ko \
locale-kspaceduel-lt \
locale-kspaceduel-lv \
locale-kspaceduel-mai \
locale-kspaceduel-mk \
locale-kspaceduel-ml \
locale-kspaceduel-mr \
locale-kspaceduel-nb \
locale-kspaceduel-nds \
locale-kspaceduel-ne \
locale-kspaceduel-nl \
locale-kspaceduel-nn \
locale-kspaceduel-oc \
locale-kspaceduel-pa \
locale-kspaceduel-pl \
locale-kspaceduel-pt \
locale-kspaceduel-pt-BR \
locale-kspaceduel-ro \
locale-kspaceduel-ru \
locale-kspaceduel-sk \
locale-kspaceduel-sl \
locale-kspaceduel-sq \
locale-kspaceduel-sr \
locale-kspaceduel-sr@ijekavian \
locale-kspaceduel-sr@ijekavianlatin \
locale-kspaceduel-sr@latin \
locale-kspaceduel-sv \
locale-kspaceduel-ta \
locale-kspaceduel-tr \
locale-kspaceduel-ug \
locale-kspaceduel-uk \
locale-kspaceduel-zh-CN \
locale-kspaceduel-zh-TW"

RDEPENDS:${PN} += "kspaceduel"

inherit rpm
