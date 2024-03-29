SUMMARY = "Translations for package gnome-disk-utility"
DESCRIPTION = "Provides translations for the 'gnome-disk-utility' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-disk-utility-lang-44.0-2.1.noarch.rpm"
RPM_HASH = "ed88aaf7d370a6e83caff12b6ae49d7f75b58ba42d91717e4c52d12c97500a0883dcd9aff5e9a4dea58f41770600d99d01954872ebe2f67166c99f98a92b47ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-disk-utility-lang \
gnome-disk-utility-lang-all \
locale-gnome-disk-utility-ar \
locale-gnome-disk-utility-as \
locale-gnome-disk-utility-ast \
locale-gnome-disk-utility-be \
locale-gnome-disk-utility-bg \
locale-gnome-disk-utility-bn \
locale-gnome-disk-utility-bn-IN \
locale-gnome-disk-utility-bs \
locale-gnome-disk-utility-ca \
locale-gnome-disk-utility-ca@valencia \
locale-gnome-disk-utility-cs \
locale-gnome-disk-utility-da \
locale-gnome-disk-utility-de \
locale-gnome-disk-utility-el \
locale-gnome-disk-utility-en-GB \
locale-gnome-disk-utility-en@shaw \
locale-gnome-disk-utility-eo \
locale-gnome-disk-utility-es \
locale-gnome-disk-utility-et \
locale-gnome-disk-utility-eu \
locale-gnome-disk-utility-fa \
locale-gnome-disk-utility-fi \
locale-gnome-disk-utility-fr \
locale-gnome-disk-utility-fur \
locale-gnome-disk-utility-ga \
locale-gnome-disk-utility-gd \
locale-gnome-disk-utility-gl \
locale-gnome-disk-utility-gu \
locale-gnome-disk-utility-he \
locale-gnome-disk-utility-hi \
locale-gnome-disk-utility-hr \
locale-gnome-disk-utility-hu \
locale-gnome-disk-utility-id \
locale-gnome-disk-utility-is \
locale-gnome-disk-utility-it \
locale-gnome-disk-utility-ja \
locale-gnome-disk-utility-ka \
locale-gnome-disk-utility-kk \
locale-gnome-disk-utility-km \
locale-gnome-disk-utility-kn \
locale-gnome-disk-utility-ko \
locale-gnome-disk-utility-lt \
locale-gnome-disk-utility-lv \
locale-gnome-disk-utility-mai \
locale-gnome-disk-utility-mk \
locale-gnome-disk-utility-ml \
locale-gnome-disk-utility-mr \
locale-gnome-disk-utility-ms \
locale-gnome-disk-utility-nb \
locale-gnome-disk-utility-ne \
locale-gnome-disk-utility-nl \
locale-gnome-disk-utility-oc \
locale-gnome-disk-utility-or \
locale-gnome-disk-utility-pa \
locale-gnome-disk-utility-pl \
locale-gnome-disk-utility-pt \
locale-gnome-disk-utility-pt-BR \
locale-gnome-disk-utility-ro \
locale-gnome-disk-utility-ru \
locale-gnome-disk-utility-sk \
locale-gnome-disk-utility-sl \
locale-gnome-disk-utility-sr \
locale-gnome-disk-utility-sr@latin \
locale-gnome-disk-utility-sv \
locale-gnome-disk-utility-ta \
locale-gnome-disk-utility-te \
locale-gnome-disk-utility-th \
locale-gnome-disk-utility-tr \
locale-gnome-disk-utility-ug \
locale-gnome-disk-utility-uk \
locale-gnome-disk-utility-vi \
locale-gnome-disk-utility-zh-CN \
locale-gnome-disk-utility-zh-HK \
locale-gnome-disk-utility-zh-TW"

RDEPENDS:${PN} += "gnome-disk-utility"

inherit rpm
