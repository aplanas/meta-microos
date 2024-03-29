SUMMARY = "Translations for package gnome-initial-setup"
DESCRIPTION = "Provides translations for the 'gnome-initial-setup' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-initial-setup-lang-44.0-2.3.noarch.rpm"
RPM_HASH = "0eb49cd14cd0bb9367e86b6a8970462b30b4a82d136ba712bdb894a7f3cf0cbbc20c5291f5b8ca4410fe5e9594e3feea51c7fde53fba79151fb65950c5e39359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-initial-setup-lang \
gnome-initial-setup-lang-all \
locale-gnome-initial-setup-af \
locale-gnome-initial-setup-ar \
locale-gnome-initial-setup-as \
locale-gnome-initial-setup-be \
locale-gnome-initial-setup-bg \
locale-gnome-initial-setup-bn-IN \
locale-gnome-initial-setup-bs \
locale-gnome-initial-setup-ca \
locale-gnome-initial-setup-ca@valencia \
locale-gnome-initial-setup-cs \
locale-gnome-initial-setup-da \
locale-gnome-initial-setup-de \
locale-gnome-initial-setup-el \
locale-gnome-initial-setup-en-GB \
locale-gnome-initial-setup-eo \
locale-gnome-initial-setup-es \
locale-gnome-initial-setup-et \
locale-gnome-initial-setup-eu \
locale-gnome-initial-setup-fa \
locale-gnome-initial-setup-fi \
locale-gnome-initial-setup-fr \
locale-gnome-initial-setup-fur \
locale-gnome-initial-setup-ga \
locale-gnome-initial-setup-gd \
locale-gnome-initial-setup-gl \
locale-gnome-initial-setup-gu \
locale-gnome-initial-setup-he \
locale-gnome-initial-setup-hi \
locale-gnome-initial-setup-hr \
locale-gnome-initial-setup-hu \
locale-gnome-initial-setup-ia \
locale-gnome-initial-setup-id \
locale-gnome-initial-setup-is \
locale-gnome-initial-setup-it \
locale-gnome-initial-setup-ja \
locale-gnome-initial-setup-ka \
locale-gnome-initial-setup-kk \
locale-gnome-initial-setup-kn \
locale-gnome-initial-setup-ko \
locale-gnome-initial-setup-lt \
locale-gnome-initial-setup-lv \
locale-gnome-initial-setup-ml \
locale-gnome-initial-setup-mr \
locale-gnome-initial-setup-ms \
locale-gnome-initial-setup-nb \
locale-gnome-initial-setup-ne \
locale-gnome-initial-setup-nl \
locale-gnome-initial-setup-oc \
locale-gnome-initial-setup-or \
locale-gnome-initial-setup-pa \
locale-gnome-initial-setup-pl \
locale-gnome-initial-setup-pt \
locale-gnome-initial-setup-pt-BR \
locale-gnome-initial-setup-ro \
locale-gnome-initial-setup-ru \
locale-gnome-initial-setup-sk \
locale-gnome-initial-setup-sl \
locale-gnome-initial-setup-sr \
locale-gnome-initial-setup-sr@latin \
locale-gnome-initial-setup-sv \
locale-gnome-initial-setup-ta \
locale-gnome-initial-setup-te \
locale-gnome-initial-setup-th \
locale-gnome-initial-setup-tr \
locale-gnome-initial-setup-ug \
locale-gnome-initial-setup-uk \
locale-gnome-initial-setup-vi \
locale-gnome-initial-setup-zh-CN \
locale-gnome-initial-setup-zh-HK \
locale-gnome-initial-setup-zh-TW"

RDEPENDS:${PN} += "gnome-initial-setup"

inherit rpm
