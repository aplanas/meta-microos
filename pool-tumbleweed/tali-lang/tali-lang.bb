SUMMARY = "Translations for package tali"
DESCRIPTION = "Provides translations for the 'tali' package."
LICENSE = "GPL-2.0-or-later"

PV = "40.9"

RPM_NAME = "tali-lang-40.9-1.3.noarch.rpm"
RPM_HASH = "1f3e810871f9101d1d4c4dfee68a1c56e05fd2ab4ec04f8278d306a05ae255ebe07c4b3d9105a48080e57f5ad001179f974ed4f521103c8413a9ac028dd1788e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tali-af \
locale-tali-ar \
locale-tali-as \
locale-tali-ast \
locale-tali-az \
locale-tali-be \
locale-tali-bg \
locale-tali-bn \
locale-tali-bn-IN \
locale-tali-br \
locale-tali-bs \
locale-tali-ca \
locale-tali-ca@valencia \
locale-tali-cs \
locale-tali-cy \
locale-tali-da \
locale-tali-de \
locale-tali-dz \
locale-tali-el \
locale-tali-en-CA \
locale-tali-en-GB \
locale-tali-en@shaw \
locale-tali-eo \
locale-tali-es \
locale-tali-et \
locale-tali-eu \
locale-tali-fa \
locale-tali-fi \
locale-tali-fr \
locale-tali-fur \
locale-tali-ga \
locale-tali-gl \
locale-tali-gu \
locale-tali-he \
locale-tali-hi \
locale-tali-hr \
locale-tali-hu \
locale-tali-id \
locale-tali-is \
locale-tali-it \
locale-tali-ja \
locale-tali-ka \
locale-tali-kk \
locale-tali-km \
locale-tali-kn \
locale-tali-ko \
locale-tali-lt \
locale-tali-lv \
locale-tali-mai \
locale-tali-mk \
locale-tali-ml \
locale-tali-mr \
locale-tali-ms \
locale-tali-nb \
locale-tali-ne \
locale-tali-nl \
locale-tali-nn \
locale-tali-oc \
locale-tali-or \
locale-tali-pa \
locale-tali-pl \
locale-tali-pt \
locale-tali-pt-BR \
locale-tali-ro \
locale-tali-ru \
locale-tali-si \
locale-tali-sk \
locale-tali-sl \
locale-tali-sq \
locale-tali-sr \
locale-tali-sr@latin \
locale-tali-sv \
locale-tali-ta \
locale-tali-te \
locale-tali-th \
locale-tali-tr \
locale-tali-ug \
locale-tali-uk \
locale-tali-vi \
locale-tali-wa \
locale-tali-zh-CN \
locale-tali-zh-HK \
locale-tali-zh-TW \
tali-lang \
tali-lang-all"

RDEPENDS:${PN} += "tali"

inherit rpm
