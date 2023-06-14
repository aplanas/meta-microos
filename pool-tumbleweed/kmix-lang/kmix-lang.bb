SUMMARY = "Translations for package kmix"
DESCRIPTION = "Provides translations for the 'kmix' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kmix-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "be101b5cb6285cdd81fdc373b6803cf2ecd4108b961e929b41f4309474c684b3460397341b08d3e5dc5b91cdc34ca98fea82a84bf795f98c22cf7afbb8896155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmix-lang \
kmix-lang-all \
locale-kmix-af \
locale-kmix-ar \
locale-kmix-be \
locale-kmix-bg \
locale-kmix-br \
locale-kmix-bs \
locale-kmix-ca \
locale-kmix-ca@valencia \
locale-kmix-cs \
locale-kmix-cy \
locale-kmix-da \
locale-kmix-de \
locale-kmix-el \
locale-kmix-en-GB \
locale-kmix-eo \
locale-kmix-es \
locale-kmix-et \
locale-kmix-eu \
locale-kmix-fa \
locale-kmix-fi \
locale-kmix-fr \
locale-kmix-ga \
locale-kmix-gl \
locale-kmix-he \
locale-kmix-hi \
locale-kmix-hr \
locale-kmix-hu \
locale-kmix-ia \
locale-kmix-id \
locale-kmix-is \
locale-kmix-it \
locale-kmix-ja \
locale-kmix-ka \
locale-kmix-kk \
locale-kmix-km \
locale-kmix-ko \
locale-kmix-lt \
locale-kmix-lv \
locale-kmix-mk \
locale-kmix-mr \
locale-kmix-ms \
locale-kmix-nb \
locale-kmix-nds \
locale-kmix-ne \
locale-kmix-nl \
locale-kmix-nn \
locale-kmix-oc \
locale-kmix-pa \
locale-kmix-pl \
locale-kmix-pt \
locale-kmix-pt-BR \
locale-kmix-ro \
locale-kmix-ru \
locale-kmix-sk \
locale-kmix-sl \
locale-kmix-sq \
locale-kmix-sr \
locale-kmix-sr@ijekavian \
locale-kmix-sr@ijekavianlatin \
locale-kmix-sr@latin \
locale-kmix-sv \
locale-kmix-ta \
locale-kmix-th \
locale-kmix-tr \
locale-kmix-ug \
locale-kmix-uk \
locale-kmix-zh-CN \
locale-kmix-zh-HK \
locale-kmix-zh-TW"

RDEPENDS:${PN} += "kmix"

inherit rpm
