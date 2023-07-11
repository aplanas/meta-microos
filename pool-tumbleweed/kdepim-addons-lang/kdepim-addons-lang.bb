SUMMARY = "Translations for package kdepim-addons"
DESCRIPTION = "Provides translations for the 'kdepim-addons' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "kdepim-addons-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "2356997a7dca645a1fb16e2aa9669f0fa0df03fd051420eabf6af5263dd0cab2d0858db90710e857544d6032aae17196e3a99d4b7c5733061f583dce7e6f242b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdepim-addons-lang \
kdepim-addons-lang-all \
locale-kdepim-addons-af \
locale-kdepim-addons-ar \
locale-kdepim-addons-az \
locale-kdepim-addons-be \
locale-kdepim-addons-bg \
locale-kdepim-addons-bn \
locale-kdepim-addons-br \
locale-kdepim-addons-bs \
locale-kdepim-addons-ca \
locale-kdepim-addons-ca@valencia \
locale-kdepim-addons-cs \
locale-kdepim-addons-cy \
locale-kdepim-addons-da \
locale-kdepim-addons-de \
locale-kdepim-addons-el \
locale-kdepim-addons-en-GB \
locale-kdepim-addons-eo \
locale-kdepim-addons-es \
locale-kdepim-addons-et \
locale-kdepim-addons-eu \
locale-kdepim-addons-fa \
locale-kdepim-addons-fi \
locale-kdepim-addons-fr \
locale-kdepim-addons-ga \
locale-kdepim-addons-gl \
locale-kdepim-addons-he \
locale-kdepim-addons-hi \
locale-kdepim-addons-hr \
locale-kdepim-addons-hu \
locale-kdepim-addons-ia \
locale-kdepim-addons-is \
locale-kdepim-addons-it \
locale-kdepim-addons-ja \
locale-kdepim-addons-ka \
locale-kdepim-addons-kk \
locale-kdepim-addons-km \
locale-kdepim-addons-ko \
locale-kdepim-addons-lt \
locale-kdepim-addons-lv \
locale-kdepim-addons-mai \
locale-kdepim-addons-mk \
locale-kdepim-addons-mr \
locale-kdepim-addons-ms \
locale-kdepim-addons-nb \
locale-kdepim-addons-nds \
locale-kdepim-addons-ne \
locale-kdepim-addons-nl \
locale-kdepim-addons-nn \
locale-kdepim-addons-pa \
locale-kdepim-addons-pl \
locale-kdepim-addons-pt \
locale-kdepim-addons-pt-BR \
locale-kdepim-addons-ro \
locale-kdepim-addons-ru \
locale-kdepim-addons-sk \
locale-kdepim-addons-sl \
locale-kdepim-addons-sq \
locale-kdepim-addons-sr \
locale-kdepim-addons-sr@ijekavian \
locale-kdepim-addons-sr@ijekavianlatin \
locale-kdepim-addons-sr@latin \
locale-kdepim-addons-sv \
locale-kdepim-addons-ta \
locale-kdepim-addons-th \
locale-kdepim-addons-tr \
locale-kdepim-addons-ug \
locale-kdepim-addons-uk \
locale-kdepim-addons-vi \
locale-kdepim-addons-wa \
locale-kdepim-addons-zh-CN \
locale-kdepim-addons-zh-TW"

RDEPENDS:${PN} += "kdepim-addons"

inherit rpm
