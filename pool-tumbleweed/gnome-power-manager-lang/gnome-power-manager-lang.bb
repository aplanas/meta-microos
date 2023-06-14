SUMMARY = "Translations for package gnome-power-manager"
DESCRIPTION = "Provides translations for the 'gnome-power-manager' package."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "gnome-power-manager-lang-43.0-1.3.noarch.rpm"
RPM_HASH = "870d4a77cf6edd9d37c35a1b53fdd4109acae12b9a45465a71dd68fcfd805c23cecbafe34f1e30cf34a006b9f71c68118e1759029f6af12f40d9c5fef85d78a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-power-manager-lang \
gnome-power-manager-lang-all \
locale-gnome-power-manager-af \
locale-gnome-power-manager-ar \
locale-gnome-power-manager-as \
locale-gnome-power-manager-ast \
locale-gnome-power-manager-be \
locale-gnome-power-manager-be@latin \
locale-gnome-power-manager-bg \
locale-gnome-power-manager-bn \
locale-gnome-power-manager-bn-IN \
locale-gnome-power-manager-bs \
locale-gnome-power-manager-ca \
locale-gnome-power-manager-ca@valencia \
locale-gnome-power-manager-cs \
locale-gnome-power-manager-cy \
locale-gnome-power-manager-da \
locale-gnome-power-manager-de \
locale-gnome-power-manager-dz \
locale-gnome-power-manager-el \
locale-gnome-power-manager-en-CA \
locale-gnome-power-manager-en-GB \
locale-gnome-power-manager-en@shaw \
locale-gnome-power-manager-eo \
locale-gnome-power-manager-es \
locale-gnome-power-manager-et \
locale-gnome-power-manager-eu \
locale-gnome-power-manager-fa \
locale-gnome-power-manager-fi \
locale-gnome-power-manager-fr \
locale-gnome-power-manager-fur \
locale-gnome-power-manager-ga \
locale-gnome-power-manager-gd \
locale-gnome-power-manager-gl \
locale-gnome-power-manager-gu \
locale-gnome-power-manager-he \
locale-gnome-power-manager-hi \
locale-gnome-power-manager-hr \
locale-gnome-power-manager-hu \
locale-gnome-power-manager-id \
locale-gnome-power-manager-is \
locale-gnome-power-manager-it \
locale-gnome-power-manager-ja \
locale-gnome-power-manager-ka \
locale-gnome-power-manager-km \
locale-gnome-power-manager-kn \
locale-gnome-power-manager-ko \
locale-gnome-power-manager-lt \
locale-gnome-power-manager-lv \
locale-gnome-power-manager-mai \
locale-gnome-power-manager-mk \
locale-gnome-power-manager-ml \
locale-gnome-power-manager-mr \
locale-gnome-power-manager-nb \
locale-gnome-power-manager-nl \
locale-gnome-power-manager-nn \
locale-gnome-power-manager-oc \
locale-gnome-power-manager-or \
locale-gnome-power-manager-pa \
locale-gnome-power-manager-pl \
locale-gnome-power-manager-pt \
locale-gnome-power-manager-pt-BR \
locale-gnome-power-manager-ro \
locale-gnome-power-manager-ru \
locale-gnome-power-manager-si \
locale-gnome-power-manager-sk \
locale-gnome-power-manager-sl \
locale-gnome-power-manager-sr \
locale-gnome-power-manager-sr@latin \
locale-gnome-power-manager-sv \
locale-gnome-power-manager-ta \
locale-gnome-power-manager-te \
locale-gnome-power-manager-th \
locale-gnome-power-manager-tr \
locale-gnome-power-manager-ug \
locale-gnome-power-manager-uk \
locale-gnome-power-manager-vi \
locale-gnome-power-manager-zh-CN \
locale-gnome-power-manager-zh-HK \
locale-gnome-power-manager-zh-TW"

RDEPENDS:${PN} += "gnome-power-manager"

inherit rpm
