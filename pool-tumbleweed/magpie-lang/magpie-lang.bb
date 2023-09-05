SUMMARY = "Translations for package magpie"
DESCRIPTION = "Provides translations for the 'magpie' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.3+0"

RPM_NAME = "magpie-lang-0.9.3+0-2.1.noarch.rpm"
RPM_HASH = "b5f9e8b4e7545198cbe01615136012ae62abc873f83393f04316d10c0d23001b917d0de181b899639c33101f49d314d648830e9fac15ed4f8420c842d2e5e680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-magpie-ar \
locale-magpie-as \
locale-magpie-ast \
locale-magpie-az \
locale-magpie-be \
locale-magpie-be@latin \
locale-magpie-bg \
locale-magpie-bn \
locale-magpie-bn-IN \
locale-magpie-br \
locale-magpie-bs \
locale-magpie-ca \
locale-magpie-ca@valencia \
locale-magpie-cs \
locale-magpie-cy \
locale-magpie-da \
locale-magpie-de \
locale-magpie-dz \
locale-magpie-el \
locale-magpie-en-CA \
locale-magpie-en-GB \
locale-magpie-eo \
locale-magpie-es \
locale-magpie-et \
locale-magpie-eu \
locale-magpie-fa \
locale-magpie-fi \
locale-magpie-fr \
locale-magpie-fur \
locale-magpie-ga \
locale-magpie-gd \
locale-magpie-gl \
locale-magpie-gu \
locale-magpie-he \
locale-magpie-hi \
locale-magpie-hr \
locale-magpie-hu \
locale-magpie-id \
locale-magpie-is \
locale-magpie-it \
locale-magpie-ja \
locale-magpie-ka \
locale-magpie-kk \
locale-magpie-kn \
locale-magpie-ko \
locale-magpie-lt \
locale-magpie-lv \
locale-magpie-mai \
locale-magpie-mk \
locale-magpie-ml \
locale-magpie-mr \
locale-magpie-ms \
locale-magpie-nb \
locale-magpie-nds \
locale-magpie-ne \
locale-magpie-nl \
locale-magpie-nn \
locale-magpie-oc \
locale-magpie-or \
locale-magpie-pa \
locale-magpie-pl \
locale-magpie-pt \
locale-magpie-pt-BR \
locale-magpie-ro \
locale-magpie-ru \
locale-magpie-si \
locale-magpie-sk \
locale-magpie-sl \
locale-magpie-sq \
locale-magpie-sr \
locale-magpie-sr@latin \
locale-magpie-sv \
locale-magpie-ta \
locale-magpie-te \
locale-magpie-th \
locale-magpie-tr \
locale-magpie-ug \
locale-magpie-uk \
locale-magpie-vi \
locale-magpie-wa \
locale-magpie-zh-CN \
locale-magpie-zh-HK \
locale-magpie-zh-TW \
magpie-lang \
magpie-lang-all"

RDEPENDS:${PN} += "magpie"

inherit rpm
