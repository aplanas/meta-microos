SUMMARY = "Translations for package gnome-nibbles"
DESCRIPTION = "Provides translations for the 'gnome-nibbles' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.3"

RPM_NAME = "gnome-nibbles-lang-3.38.3-1.2.noarch.rpm"
RPM_HASH = "c0557ae2e62b61f5ba758a1522aea2312df5fcb58ff9419f69ed629cc85b144b2432fef46077d49b56f2c242633d483197b1ab1cc6f2ed00a569e6c603c8af19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-nibbles-lang \
gnome-nibbles-lang-all \
locale-gnome-nibbles-af \
locale-gnome-nibbles-ar \
locale-gnome-nibbles-as \
locale-gnome-nibbles-ast \
locale-gnome-nibbles-az \
locale-gnome-nibbles-be \
locale-gnome-nibbles-bg \
locale-gnome-nibbles-bn \
locale-gnome-nibbles-bn-IN \
locale-gnome-nibbles-br \
locale-gnome-nibbles-bs \
locale-gnome-nibbles-ca \
locale-gnome-nibbles-ca@valencia \
locale-gnome-nibbles-cs \
locale-gnome-nibbles-cy \
locale-gnome-nibbles-da \
locale-gnome-nibbles-de \
locale-gnome-nibbles-dz \
locale-gnome-nibbles-el \
locale-gnome-nibbles-en-CA \
locale-gnome-nibbles-en-GB \
locale-gnome-nibbles-en@shaw \
locale-gnome-nibbles-eo \
locale-gnome-nibbles-es \
locale-gnome-nibbles-et \
locale-gnome-nibbles-eu \
locale-gnome-nibbles-fa \
locale-gnome-nibbles-fi \
locale-gnome-nibbles-fr \
locale-gnome-nibbles-fur \
locale-gnome-nibbles-ga \
locale-gnome-nibbles-gl \
locale-gnome-nibbles-gu \
locale-gnome-nibbles-he \
locale-gnome-nibbles-hi \
locale-gnome-nibbles-hr \
locale-gnome-nibbles-hu \
locale-gnome-nibbles-id \
locale-gnome-nibbles-is \
locale-gnome-nibbles-it \
locale-gnome-nibbles-ja \
locale-gnome-nibbles-ka \
locale-gnome-nibbles-kk \
locale-gnome-nibbles-km \
locale-gnome-nibbles-kn \
locale-gnome-nibbles-ko \
locale-gnome-nibbles-lt \
locale-gnome-nibbles-lv \
locale-gnome-nibbles-mai \
locale-gnome-nibbles-mk \
locale-gnome-nibbles-ml \
locale-gnome-nibbles-mr \
locale-gnome-nibbles-ms \
locale-gnome-nibbles-nb \
locale-gnome-nibbles-ne \
locale-gnome-nibbles-nl \
locale-gnome-nibbles-nn \
locale-gnome-nibbles-oc \
locale-gnome-nibbles-or \
locale-gnome-nibbles-pa \
locale-gnome-nibbles-pl \
locale-gnome-nibbles-pt \
locale-gnome-nibbles-pt-BR \
locale-gnome-nibbles-ro \
locale-gnome-nibbles-ru \
locale-gnome-nibbles-si \
locale-gnome-nibbles-sk \
locale-gnome-nibbles-sl \
locale-gnome-nibbles-sq \
locale-gnome-nibbles-sr \
locale-gnome-nibbles-sr@latin \
locale-gnome-nibbles-sv \
locale-gnome-nibbles-ta \
locale-gnome-nibbles-te \
locale-gnome-nibbles-th \
locale-gnome-nibbles-tr \
locale-gnome-nibbles-ug \
locale-gnome-nibbles-uk \
locale-gnome-nibbles-vi \
locale-gnome-nibbles-wa \
locale-gnome-nibbles-zh-CN \
locale-gnome-nibbles-zh-HK \
locale-gnome-nibbles-zh-TW"

RDEPENDS:${PN} += "gnome-nibbles"

inherit rpm
