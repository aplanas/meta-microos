SUMMARY = "Translations for package nautilus"
DESCRIPTION = "Provides translations for the 'nautilus' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "nautilus-lang-44.2-2.1.noarch.rpm"
RPM_HASH = "3b1ffa165952e3320dd348161fc022d8b8d03c881244607cc38a110e7726b1d086b7fc646486cffca8eece0935bb860d07faa93dd7b675abb4069e2172d7686a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-nautilus-af \
locale-nautilus-ar \
locale-nautilus-as \
locale-nautilus-ast \
locale-nautilus-az \
locale-nautilus-be \
locale-nautilus-be@latin \
locale-nautilus-bg \
locale-nautilus-bn \
locale-nautilus-bn-IN \
locale-nautilus-br \
locale-nautilus-bs \
locale-nautilus-ca \
locale-nautilus-ca@valencia \
locale-nautilus-cs \
locale-nautilus-cy \
locale-nautilus-da \
locale-nautilus-de \
locale-nautilus-dz \
locale-nautilus-el \
locale-nautilus-en-CA \
locale-nautilus-en-GB \
locale-nautilus-en@shaw \
locale-nautilus-eo \
locale-nautilus-es \
locale-nautilus-et \
locale-nautilus-eu \
locale-nautilus-fa \
locale-nautilus-fi \
locale-nautilus-fr \
locale-nautilus-fur \
locale-nautilus-ga \
locale-nautilus-gd \
locale-nautilus-gl \
locale-nautilus-gu \
locale-nautilus-he \
locale-nautilus-hi \
locale-nautilus-hr \
locale-nautilus-hu \
locale-nautilus-id \
locale-nautilus-is \
locale-nautilus-it \
locale-nautilus-ja \
locale-nautilus-ka \
locale-nautilus-kk \
locale-nautilus-km \
locale-nautilus-kn \
locale-nautilus-ko \
locale-nautilus-lt \
locale-nautilus-lv \
locale-nautilus-mai \
locale-nautilus-mk \
locale-nautilus-ml \
locale-nautilus-mr \
locale-nautilus-ms \
locale-nautilus-nb \
locale-nautilus-nds \
locale-nautilus-ne \
locale-nautilus-nl \
locale-nautilus-nn \
locale-nautilus-oc \
locale-nautilus-or \
locale-nautilus-pa \
locale-nautilus-pl \
locale-nautilus-pt \
locale-nautilus-pt-BR \
locale-nautilus-ro \
locale-nautilus-ru \
locale-nautilus-si \
locale-nautilus-sk \
locale-nautilus-sl \
locale-nautilus-sq \
locale-nautilus-sr \
locale-nautilus-sr@ije \
locale-nautilus-sr@latin \
locale-nautilus-sv \
locale-nautilus-ta \
locale-nautilus-te \
locale-nautilus-th \
locale-nautilus-tr \
locale-nautilus-ug \
locale-nautilus-uk \
locale-nautilus-vi \
locale-nautilus-wa \
locale-nautilus-zh-CN \
locale-nautilus-zh-HK \
locale-nautilus-zh-TW \
nautilus-lang \
nautilus-lang-all"

RDEPENDS:${PN} += "nautilus"

inherit rpm
