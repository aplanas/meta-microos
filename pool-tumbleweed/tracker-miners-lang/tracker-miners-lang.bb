SUMMARY = "Translations for package tracker-miners"
DESCRIPTION = "Provides translations for the 'tracker-miners' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.2"

RPM_NAME = "tracker-miners-lang-3.5.2-1.3.noarch.rpm"
RPM_HASH = "419a41a2b6df2d5e09d113e584504f563971da716f9fe41a81e9213efcff2bb3ee31b302e90faf9e1d6c0c04e9785d05a58761e78cf2c92346c62315da970e21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tracker-miners-ar \
locale-tracker-miners-as \
locale-tracker-miners-be \
locale-tracker-miners-be@latin \
locale-tracker-miners-bg \
locale-tracker-miners-bs \
locale-tracker-miners-ca \
locale-tracker-miners-ca@valencia \
locale-tracker-miners-cs \
locale-tracker-miners-da \
locale-tracker-miners-de \
locale-tracker-miners-dz \
locale-tracker-miners-el \
locale-tracker-miners-en-GB \
locale-tracker-miners-eo \
locale-tracker-miners-es \
locale-tracker-miners-et \
locale-tracker-miners-eu \
locale-tracker-miners-fi \
locale-tracker-miners-fr \
locale-tracker-miners-fur \
locale-tracker-miners-gl \
locale-tracker-miners-he \
locale-tracker-miners-hr \
locale-tracker-miners-hu \
locale-tracker-miners-id \
locale-tracker-miners-it \
locale-tracker-miners-ja \
locale-tracker-miners-ka \
locale-tracker-miners-kk \
locale-tracker-miners-ko \
locale-tracker-miners-lt \
locale-tracker-miners-lv \
locale-tracker-miners-mk \
locale-tracker-miners-ml \
locale-tracker-miners-ms \
locale-tracker-miners-nb \
locale-tracker-miners-nds \
locale-tracker-miners-ne \
locale-tracker-miners-nl \
locale-tracker-miners-oc \
locale-tracker-miners-pa \
locale-tracker-miners-pl \
locale-tracker-miners-pt \
locale-tracker-miners-pt-BR \
locale-tracker-miners-ro \
locale-tracker-miners-ru \
locale-tracker-miners-sk \
locale-tracker-miners-sl \
locale-tracker-miners-sr \
locale-tracker-miners-sr@latin \
locale-tracker-miners-sv \
locale-tracker-miners-te \
locale-tracker-miners-th \
locale-tracker-miners-tr \
locale-tracker-miners-uk \
locale-tracker-miners-vi \
locale-tracker-miners-zh-CN \
locale-tracker-miners-zh-HK \
locale-tracker-miners-zh-TW \
tracker-miners-lang \
tracker-miners-lang-all"

RDEPENDS:${PN} += "tracker-miners"

inherit rpm
