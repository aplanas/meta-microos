SUMMARY = "Translations for package gdm"
DESCRIPTION = "Provides translations for the 'gdm' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdm-lang-44.1-2.1.noarch.rpm"
RPM_HASH = "4b6428a9c330d262fbe2116ed6f21cf91c78ec7f48ff6943669d48d2d085c598ed0c37ec83f0e0330368b77e428ded85d5b613327a2d43392da0461757bc5005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdm-lang \
gdm-lang-all \
locale-gdm-af \
locale-gdm-ar \
locale-gdm-as \
locale-gdm-ast \
locale-gdm-az \
locale-gdm-be \
locale-gdm-be@latin \
locale-gdm-bg \
locale-gdm-bn \
locale-gdm-bn-IN \
locale-gdm-br \
locale-gdm-bs \
locale-gdm-ca \
locale-gdm-ca@valencia \
locale-gdm-cs \
locale-gdm-cy \
locale-gdm-da \
locale-gdm-de \
locale-gdm-dz \
locale-gdm-el \
locale-gdm-en-CA \
locale-gdm-en-GB \
locale-gdm-en@shaw \
locale-gdm-eo \
locale-gdm-es \
locale-gdm-et \
locale-gdm-eu \
locale-gdm-fa \
locale-gdm-fi \
locale-gdm-fr \
locale-gdm-fur \
locale-gdm-ga \
locale-gdm-gd \
locale-gdm-gl \
locale-gdm-gu \
locale-gdm-he \
locale-gdm-hi \
locale-gdm-hr \
locale-gdm-hu \
locale-gdm-id \
locale-gdm-is \
locale-gdm-it \
locale-gdm-ja \
locale-gdm-ka \
locale-gdm-kk \
locale-gdm-km \
locale-gdm-kn \
locale-gdm-ko \
locale-gdm-lt \
locale-gdm-lv \
locale-gdm-mai \
locale-gdm-mk \
locale-gdm-ml \
locale-gdm-mr \
locale-gdm-ms \
locale-gdm-nb \
locale-gdm-nds \
locale-gdm-ne \
locale-gdm-nl \
locale-gdm-nn \
locale-gdm-oc \
locale-gdm-or \
locale-gdm-pa \
locale-gdm-pl \
locale-gdm-pt \
locale-gdm-pt-BR \
locale-gdm-ro \
locale-gdm-ru \
locale-gdm-si \
locale-gdm-sk \
locale-gdm-sl \
locale-gdm-sq \
locale-gdm-sr \
locale-gdm-sr@latin \
locale-gdm-sv \
locale-gdm-ta \
locale-gdm-te \
locale-gdm-th \
locale-gdm-tr \
locale-gdm-ug \
locale-gdm-uk \
locale-gdm-vi \
locale-gdm-wa \
locale-gdm-zh-CN \
locale-gdm-zh-HK \
locale-gdm-zh-TW"

RDEPENDS:${PN} += "gdm"

inherit rpm
