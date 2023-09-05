SUMMARY = "Translations for package sweeper"
DESCRIPTION = "Provides translations for the 'sweeper' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "sweeper-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "89b956352fad22a678e65542dbfa168798fe555c460484bc029c1979f815c98dca11c3b2c432be2ec00c161f27aaca941f91397dad33f5960cecd15dbc3c1220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-sweeper-af \
locale-sweeper-ar \
locale-sweeper-be \
locale-sweeper-bg \
locale-sweeper-bn \
locale-sweeper-br \
locale-sweeper-bs \
locale-sweeper-ca \
locale-sweeper-ca@valencia \
locale-sweeper-cs \
locale-sweeper-cy \
locale-sweeper-da \
locale-sweeper-de \
locale-sweeper-el \
locale-sweeper-en-GB \
locale-sweeper-eo \
locale-sweeper-es \
locale-sweeper-et \
locale-sweeper-eu \
locale-sweeper-fa \
locale-sweeper-fi \
locale-sweeper-fr \
locale-sweeper-ga \
locale-sweeper-gl \
locale-sweeper-he \
locale-sweeper-hi \
locale-sweeper-hr \
locale-sweeper-hu \
locale-sweeper-ia \
locale-sweeper-id \
locale-sweeper-is \
locale-sweeper-it \
locale-sweeper-ja \
locale-sweeper-ka \
locale-sweeper-kk \
locale-sweeper-km \
locale-sweeper-ko \
locale-sweeper-lt \
locale-sweeper-lv \
locale-sweeper-mk \
locale-sweeper-mr \
locale-sweeper-ms \
locale-sweeper-nb \
locale-sweeper-nds \
locale-sweeper-ne \
locale-sweeper-nl \
locale-sweeper-nn \
locale-sweeper-oc \
locale-sweeper-pa \
locale-sweeper-pl \
locale-sweeper-pt \
locale-sweeper-pt-BR \
locale-sweeper-ro \
locale-sweeper-ru \
locale-sweeper-sk \
locale-sweeper-sl \
locale-sweeper-sq \
locale-sweeper-sr \
locale-sweeper-sr@ijekavian \
locale-sweeper-sr@ijekavianlatin \
locale-sweeper-sr@latin \
locale-sweeper-sv \
locale-sweeper-ta \
locale-sweeper-te \
locale-sweeper-th \
locale-sweeper-tr \
locale-sweeper-ug \
locale-sweeper-uk \
locale-sweeper-zh-CN \
locale-sweeper-zh-TW \
sweeper-lang \
sweeper-lang-all"

RDEPENDS:${PN} += "sweeper"

inherit rpm
