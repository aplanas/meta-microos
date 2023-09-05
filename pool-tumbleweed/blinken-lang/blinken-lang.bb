SUMMARY = "Translations for package blinken"
DESCRIPTION = "Provides translations for the 'blinken' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "blinken-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "82831684c6875b9c70b876018bdf4a23a1f061a86915a4741e077b3d08f6450a623db5ab165d09057dcf9ff8215fb859f6e0e4522bfa0687b48dc4d2e6029dd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blinken-lang \
blinken-lang-all \
locale-blinken-ar \
locale-blinken-be \
locale-blinken-bg \
locale-blinken-bn \
locale-blinken-br \
locale-blinken-bs \
locale-blinken-ca \
locale-blinken-ca@valencia \
locale-blinken-cs \
locale-blinken-cy \
locale-blinken-da \
locale-blinken-de \
locale-blinken-el \
locale-blinken-en-GB \
locale-blinken-eo \
locale-blinken-es \
locale-blinken-et \
locale-blinken-eu \
locale-blinken-fa \
locale-blinken-fi \
locale-blinken-fr \
locale-blinken-ga \
locale-blinken-gl \
locale-blinken-gu \
locale-blinken-he \
locale-blinken-hi \
locale-blinken-hr \
locale-blinken-hu \
locale-blinken-ia \
locale-blinken-is \
locale-blinken-it \
locale-blinken-ja \
locale-blinken-ka \
locale-blinken-kk \
locale-blinken-km \
locale-blinken-ko \
locale-blinken-lt \
locale-blinken-lv \
locale-blinken-mk \
locale-blinken-ml \
locale-blinken-mr \
locale-blinken-ms \
locale-blinken-nb \
locale-blinken-nds \
locale-blinken-ne \
locale-blinken-nl \
locale-blinken-nn \
locale-blinken-oc \
locale-blinken-pa \
locale-blinken-pl \
locale-blinken-pt \
locale-blinken-pt-BR \
locale-blinken-ro \
locale-blinken-ru \
locale-blinken-si \
locale-blinken-sk \
locale-blinken-sl \
locale-blinken-sq \
locale-blinken-sv \
locale-blinken-tr \
locale-blinken-ug \
locale-blinken-uk \
locale-blinken-vi \
locale-blinken-zh-CN \
locale-blinken-zh-TW"

RDEPENDS:${PN} += "blinken"

inherit rpm
