SUMMARY = "Translations for package gdm"
DESCRIPTION = "Provides translations for the 'gdm' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdm-lang-44.1-3.1.noarch.rpm"
RPM_HASH = "54dc2b1f126b0b3851ce944438d916843a6b7b8db9c8d1ea9bd05da5679c92066ac580de3d9dce8b82fce10e85f7f1ab60d107990d853fa7c8ebaa97ac31ba8c"
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
