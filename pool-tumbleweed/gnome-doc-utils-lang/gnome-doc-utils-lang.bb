SUMMARY = "Translations for package gnome-doc-utils"
DESCRIPTION = "Provides translations for the 'gnome-doc-utils' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.10"

RPM_NAME = "gnome-doc-utils-lang-0.20.10-21.5.noarch.rpm"
RPM_HASH = "5744f07a41ad243a330c12a3d8919f0038ad9827a2e56c2cfdb0b5ad054b6b110bae771f3c1dcc1874ddee7ef3f135b89d4c92aebac65b24781a74aca74f004f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-doc-utils-lang \
gnome-doc-utils-lang-all \
locale-gnome-doc-utils-ar \
locale-gnome-doc-utils-as \
locale-gnome-doc-utils-ast \
locale-gnome-doc-utils-be \
locale-gnome-doc-utils-be@latin \
locale-gnome-doc-utils-bg \
locale-gnome-doc-utils-bn \
locale-gnome-doc-utils-bn-IN \
locale-gnome-doc-utils-ca \
locale-gnome-doc-utils-ca@valencia \
locale-gnome-doc-utils-cs \
locale-gnome-doc-utils-cy \
locale-gnome-doc-utils-da \
locale-gnome-doc-utils-de \
locale-gnome-doc-utils-dz \
locale-gnome-doc-utils-el \
locale-gnome-doc-utils-en-CA \
locale-gnome-doc-utils-en-GB \
locale-gnome-doc-utils-en@shaw \
locale-gnome-doc-utils-eo \
locale-gnome-doc-utils-es \
locale-gnome-doc-utils-et \
locale-gnome-doc-utils-eu \
locale-gnome-doc-utils-fa \
locale-gnome-doc-utils-fi \
locale-gnome-doc-utils-fr \
locale-gnome-doc-utils-ga \
locale-gnome-doc-utils-gl \
locale-gnome-doc-utils-gu \
locale-gnome-doc-utils-he \
locale-gnome-doc-utils-hi \
locale-gnome-doc-utils-hu \
locale-gnome-doc-utils-id \
locale-gnome-doc-utils-it \
locale-gnome-doc-utils-ja \
locale-gnome-doc-utils-ka \
locale-gnome-doc-utils-km \
locale-gnome-doc-utils-kn \
locale-gnome-doc-utils-ko \
locale-gnome-doc-utils-lt \
locale-gnome-doc-utils-lv \
locale-gnome-doc-utils-mai \
locale-gnome-doc-utils-mk \
locale-gnome-doc-utils-ml \
locale-gnome-doc-utils-mr \
locale-gnome-doc-utils-nb \
locale-gnome-doc-utils-ne \
locale-gnome-doc-utils-nl \
locale-gnome-doc-utils-nn \
locale-gnome-doc-utils-oc \
locale-gnome-doc-utils-or \
locale-gnome-doc-utils-pa \
locale-gnome-doc-utils-pl \
locale-gnome-doc-utils-pt \
locale-gnome-doc-utils-pt-BR \
locale-gnome-doc-utils-ro \
locale-gnome-doc-utils-ru \
locale-gnome-doc-utils-sk \
locale-gnome-doc-utils-sl \
locale-gnome-doc-utils-sq \
locale-gnome-doc-utils-sr \
locale-gnome-doc-utils-sr@latin \
locale-gnome-doc-utils-sv \
locale-gnome-doc-utils-ta \
locale-gnome-doc-utils-te \
locale-gnome-doc-utils-th \
locale-gnome-doc-utils-tr \
locale-gnome-doc-utils-ug \
locale-gnome-doc-utils-uk \
locale-gnome-doc-utils-vi \
locale-gnome-doc-utils-wa \
locale-gnome-doc-utils-zh-CN \
locale-gnome-doc-utils-zh-HK \
locale-gnome-doc-utils-zh-TW"

RDEPENDS:${PN} += "gnome-doc-utils"

inherit rpm
