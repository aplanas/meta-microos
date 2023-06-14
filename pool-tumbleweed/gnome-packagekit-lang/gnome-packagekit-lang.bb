SUMMARY = "Translations for package gnome-packagekit"
DESCRIPTION = "Provides translations for the 'gnome-packagekit' package."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "gnome-packagekit-lang-43.0-1.3.noarch.rpm"
RPM_HASH = "5e413dc4b8e32d09cffc8f0266a2b703f73937cc33eca7e0777d248c5c024afe9c77dbc57d9fddcf31656ee02e3189f8df3250a2fb418519875b103e5d98ea56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-packagekit-lang \
gnome-packagekit-lang-all \
locale-gnome-packagekit-af \
locale-gnome-packagekit-ar \
locale-gnome-packagekit-as \
locale-gnome-packagekit-ast \
locale-gnome-packagekit-be \
locale-gnome-packagekit-bg \
locale-gnome-packagekit-bn \
locale-gnome-packagekit-bn-IN \
locale-gnome-packagekit-bs \
locale-gnome-packagekit-ca \
locale-gnome-packagekit-ca@valencia \
locale-gnome-packagekit-cs \
locale-gnome-packagekit-cy \
locale-gnome-packagekit-da \
locale-gnome-packagekit-de \
locale-gnome-packagekit-el \
locale-gnome-packagekit-en-GB \
locale-gnome-packagekit-en@shaw \
locale-gnome-packagekit-eo \
locale-gnome-packagekit-es \
locale-gnome-packagekit-et \
locale-gnome-packagekit-eu \
locale-gnome-packagekit-fa \
locale-gnome-packagekit-fi \
locale-gnome-packagekit-fr \
locale-gnome-packagekit-fur \
locale-gnome-packagekit-ga \
locale-gnome-packagekit-gl \
locale-gnome-packagekit-gu \
locale-gnome-packagekit-he \
locale-gnome-packagekit-hi \
locale-gnome-packagekit-hr \
locale-gnome-packagekit-hu \
locale-gnome-packagekit-id \
locale-gnome-packagekit-is \
locale-gnome-packagekit-it \
locale-gnome-packagekit-ja \
locale-gnome-packagekit-kk \
locale-gnome-packagekit-kn \
locale-gnome-packagekit-ko \
locale-gnome-packagekit-lt \
locale-gnome-packagekit-lv \
locale-gnome-packagekit-mk \
locale-gnome-packagekit-ml \
locale-gnome-packagekit-mr \
locale-gnome-packagekit-ms \
locale-gnome-packagekit-nb \
locale-gnome-packagekit-ne \
locale-gnome-packagekit-nl \
locale-gnome-packagekit-nn \
locale-gnome-packagekit-oc \
locale-gnome-packagekit-or \
locale-gnome-packagekit-pa \
locale-gnome-packagekit-pl \
locale-gnome-packagekit-pt \
locale-gnome-packagekit-pt-BR \
locale-gnome-packagekit-ro \
locale-gnome-packagekit-ru \
locale-gnome-packagekit-sk \
locale-gnome-packagekit-sl \
locale-gnome-packagekit-sr \
locale-gnome-packagekit-sr@latin \
locale-gnome-packagekit-sv \
locale-gnome-packagekit-ta \
locale-gnome-packagekit-te \
locale-gnome-packagekit-th \
locale-gnome-packagekit-tr \
locale-gnome-packagekit-ug \
locale-gnome-packagekit-uk \
locale-gnome-packagekit-vi \
locale-gnome-packagekit-zh-CN \
locale-gnome-packagekit-zh-HK \
locale-gnome-packagekit-zh-TW"

RDEPENDS:${PN} += "gnome-packagekit"

inherit rpm
