SUMMARY = "Translations for package gnome-software"
DESCRIPTION = "Provides translations for the 'gnome-software' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.4"

RPM_NAME = "gnome-software-lang-44.4-1.1.noarch.rpm"
RPM_HASH = "71dd8af85233fd36b1d6e8641109be232eefade4ad1461376322244b29d66857a0268c6e1645af564fde4e26fe08cacf4a3198b69393667c2b663e14ebe5abf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-software-lang \
gnome-software-lang-all \
locale-gnome-software-af \
locale-gnome-software-ar \
locale-gnome-software-as \
locale-gnome-software-be \
locale-gnome-software-bg \
locale-gnome-software-bn \
locale-gnome-software-bs \
locale-gnome-software-ca \
locale-gnome-software-ca@valencia \
locale-gnome-software-cs \
locale-gnome-software-da \
locale-gnome-software-de \
locale-gnome-software-el \
locale-gnome-software-en-GB \
locale-gnome-software-eo \
locale-gnome-software-es \
locale-gnome-software-eu \
locale-gnome-software-fa \
locale-gnome-software-fi \
locale-gnome-software-fr \
locale-gnome-software-fur \
locale-gnome-software-ga \
locale-gnome-software-gd \
locale-gnome-software-gl \
locale-gnome-software-he \
locale-gnome-software-hi \
locale-gnome-software-hr \
locale-gnome-software-hu \
locale-gnome-software-id \
locale-gnome-software-is \
locale-gnome-software-it \
locale-gnome-software-ja \
locale-gnome-software-ka \
locale-gnome-software-kk \
locale-gnome-software-km \
locale-gnome-software-ko \
locale-gnome-software-lt \
locale-gnome-software-lv \
locale-gnome-software-ml \
locale-gnome-software-mr \
locale-gnome-software-ms \
locale-gnome-software-nb \
locale-gnome-software-ne \
locale-gnome-software-nl \
locale-gnome-software-oc \
locale-gnome-software-pa \
locale-gnome-software-pl \
locale-gnome-software-pt \
locale-gnome-software-pt-BR \
locale-gnome-software-ro \
locale-gnome-software-ru \
locale-gnome-software-sk \
locale-gnome-software-sl \
locale-gnome-software-sr \
locale-gnome-software-sr@latin \
locale-gnome-software-sv \
locale-gnome-software-te \
locale-gnome-software-th \
locale-gnome-software-tr \
locale-gnome-software-uk \
locale-gnome-software-vi \
locale-gnome-software-zh-CN \
locale-gnome-software-zh-HK \
locale-gnome-software-zh-TW"

RDEPENDS:${PN} += "gnome-software"

inherit rpm
