SUMMARY = "Translations for package gnome-online-accounts"
DESCRIPTION = "Provides translations for the 'gnome-online-accounts' package."
LICENSE = "LGPL-2.0-or-later"

PV = "3.48.0"

RPM_NAME = "gnome-online-accounts-lang-3.48.0-1.2.noarch.rpm"
RPM_HASH = "ce1b42503e7223940f0069ba55f4e64bb84a93f9a6d813bc161ae8931d31584ef82b728410e47a5d7e8cb2d731cf874918b673e92df0286fa999f09f57bd84ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-online-accounts-lang \
gnome-online-accounts-lang-all \
locale-gnome-online-accounts-af \
locale-gnome-online-accounts-ar \
locale-gnome-online-accounts-as \
locale-gnome-online-accounts-ast \
locale-gnome-online-accounts-be \
locale-gnome-online-accounts-bg \
locale-gnome-online-accounts-bn-IN \
locale-gnome-online-accounts-bs \
locale-gnome-online-accounts-ca \
locale-gnome-online-accounts-ca@valencia \
locale-gnome-online-accounts-cs \
locale-gnome-online-accounts-da \
locale-gnome-online-accounts-de \
locale-gnome-online-accounts-el \
locale-gnome-online-accounts-en-GB \
locale-gnome-online-accounts-eo \
locale-gnome-online-accounts-es \
locale-gnome-online-accounts-et \
locale-gnome-online-accounts-eu \
locale-gnome-online-accounts-fa \
locale-gnome-online-accounts-fi \
locale-gnome-online-accounts-fr \
locale-gnome-online-accounts-fur \
locale-gnome-online-accounts-ga \
locale-gnome-online-accounts-gd \
locale-gnome-online-accounts-gl \
locale-gnome-online-accounts-gu \
locale-gnome-online-accounts-he \
locale-gnome-online-accounts-hi \
locale-gnome-online-accounts-hr \
locale-gnome-online-accounts-hu \
locale-gnome-online-accounts-id \
locale-gnome-online-accounts-is \
locale-gnome-online-accounts-it \
locale-gnome-online-accounts-ja \
locale-gnome-online-accounts-ka \
locale-gnome-online-accounts-kk \
locale-gnome-online-accounts-km \
locale-gnome-online-accounts-kn \
locale-gnome-online-accounts-ko \
locale-gnome-online-accounts-lt \
locale-gnome-online-accounts-lv \
locale-gnome-online-accounts-mk \
locale-gnome-online-accounts-ml \
locale-gnome-online-accounts-mr \
locale-gnome-online-accounts-ms \
locale-gnome-online-accounts-nb \
locale-gnome-online-accounts-ne \
locale-gnome-online-accounts-nl \
locale-gnome-online-accounts-oc \
locale-gnome-online-accounts-or \
locale-gnome-online-accounts-pa \
locale-gnome-online-accounts-pl \
locale-gnome-online-accounts-pt \
locale-gnome-online-accounts-pt-BR \
locale-gnome-online-accounts-ro \
locale-gnome-online-accounts-ru \
locale-gnome-online-accounts-sk \
locale-gnome-online-accounts-sl \
locale-gnome-online-accounts-sr \
locale-gnome-online-accounts-sr@latin \
locale-gnome-online-accounts-sv \
locale-gnome-online-accounts-ta \
locale-gnome-online-accounts-te \
locale-gnome-online-accounts-th \
locale-gnome-online-accounts-tr \
locale-gnome-online-accounts-ug \
locale-gnome-online-accounts-uk \
locale-gnome-online-accounts-vi \
locale-gnome-online-accounts-zh-CN \
locale-gnome-online-accounts-zh-HK \
locale-gnome-online-accounts-zh-TW"

RDEPENDS:${PN} += "gnome-online-accounts"

inherit rpm
