SUMMARY = "Translations for package kgpg"
DESCRIPTION = "Provides translations for the 'kgpg' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kgpg-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "e891b9dccf11acd03fac6fcd5f7475d8dac8927859c5b333808ade5d9262d33deb79d024483dbbaddc4ecb2dc4f64cb3b80810a36a2bc8c02430a87113b0fe52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kgpg-lang \
kgpg-lang-all \
locale-kgpg-ar \
locale-kgpg-be \
locale-kgpg-bg \
locale-kgpg-br \
locale-kgpg-bs \
locale-kgpg-ca \
locale-kgpg-ca@valencia \
locale-kgpg-cs \
locale-kgpg-cy \
locale-kgpg-da \
locale-kgpg-de \
locale-kgpg-el \
locale-kgpg-en-GB \
locale-kgpg-eo \
locale-kgpg-es \
locale-kgpg-et \
locale-kgpg-eu \
locale-kgpg-fa \
locale-kgpg-fi \
locale-kgpg-fr \
locale-kgpg-ga \
locale-kgpg-gl \
locale-kgpg-he \
locale-kgpg-hr \
locale-kgpg-hu \
locale-kgpg-ia \
locale-kgpg-id \
locale-kgpg-is \
locale-kgpg-it \
locale-kgpg-ja \
locale-kgpg-ka \
locale-kgpg-kk \
locale-kgpg-km \
locale-kgpg-ko \
locale-kgpg-lt \
locale-kgpg-lv \
locale-kgpg-mk \
locale-kgpg-mr \
locale-kgpg-ms \
locale-kgpg-nb \
locale-kgpg-nds \
locale-kgpg-ne \
locale-kgpg-nl \
locale-kgpg-nn \
locale-kgpg-oc \
locale-kgpg-pa \
locale-kgpg-pl \
locale-kgpg-pt \
locale-kgpg-pt-BR \
locale-kgpg-ro \
locale-kgpg-ru \
locale-kgpg-sk \
locale-kgpg-sl \
locale-kgpg-sq \
locale-kgpg-sr \
locale-kgpg-sr@ijekavian \
locale-kgpg-sr@ijekavianlatin \
locale-kgpg-sr@latin \
locale-kgpg-sv \
locale-kgpg-ta \
locale-kgpg-tr \
locale-kgpg-ug \
locale-kgpg-uk \
locale-kgpg-zh-CN \
locale-kgpg-zh-TW"

RDEPENDS:${PN} += "kgpg"

inherit rpm
