SUMMARY = "Translations for package lightdm-gtk-greeter"
DESCRIPTION = "Provides translations for the 'lightdm-gtk-greeter' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.8"

RPM_NAME = "lightdm-gtk-greeter-lang-2.0.8-1.12.noarch.rpm"
RPM_HASH = "6ae9200624f80b4375bb129025ba3bd6654164c23df61ad5beca72cc816953c71b708cb5d9e0b654585ae7e4602f53ed885be6bed690e600a12af37fdf548dee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-gtk-greeter-lang \
lightdm-gtk-greeter-lang-all \
locale-lightdm-gtk-greeter-ar \
locale-lightdm-gtk-greeter-ast \
locale-lightdm-gtk-greeter-be \
locale-lightdm-gtk-greeter-bg \
locale-lightdm-gtk-greeter-bn \
locale-lightdm-gtk-greeter-br \
locale-lightdm-gtk-greeter-bs \
locale-lightdm-gtk-greeter-ca \
locale-lightdm-gtk-greeter-ca@valencia \
locale-lightdm-gtk-greeter-cs \
locale-lightdm-gtk-greeter-da \
locale-lightdm-gtk-greeter-de \
locale-lightdm-gtk-greeter-el \
locale-lightdm-gtk-greeter-en-AU \
locale-lightdm-gtk-greeter-en-CA \
locale-lightdm-gtk-greeter-en-GB \
locale-lightdm-gtk-greeter-eo \
locale-lightdm-gtk-greeter-es \
locale-lightdm-gtk-greeter-et \
locale-lightdm-gtk-greeter-eu \
locale-lightdm-gtk-greeter-fi \
locale-lightdm-gtk-greeter-fr \
locale-lightdm-gtk-greeter-gd \
locale-lightdm-gtk-greeter-gl \
locale-lightdm-gtk-greeter-he \
locale-lightdm-gtk-greeter-hi \
locale-lightdm-gtk-greeter-hr \
locale-lightdm-gtk-greeter-hu \
locale-lightdm-gtk-greeter-ia \
locale-lightdm-gtk-greeter-id \
locale-lightdm-gtk-greeter-is \
locale-lightdm-gtk-greeter-it \
locale-lightdm-gtk-greeter-ja \
locale-lightdm-gtk-greeter-kk \
locale-lightdm-gtk-greeter-km \
locale-lightdm-gtk-greeter-ko \
locale-lightdm-gtk-greeter-lt \
locale-lightdm-gtk-greeter-lv \
locale-lightdm-gtk-greeter-ml \
locale-lightdm-gtk-greeter-ms \
locale-lightdm-gtk-greeter-nb \
locale-lightdm-gtk-greeter-nl \
locale-lightdm-gtk-greeter-nn \
locale-lightdm-gtk-greeter-oc \
locale-lightdm-gtk-greeter-pl \
locale-lightdm-gtk-greeter-pt \
locale-lightdm-gtk-greeter-pt-BR \
locale-lightdm-gtk-greeter-ro \
locale-lightdm-gtk-greeter-ru \
locale-lightdm-gtk-greeter-si \
locale-lightdm-gtk-greeter-sk \
locale-lightdm-gtk-greeter-sl \
locale-lightdm-gtk-greeter-sq \
locale-lightdm-gtk-greeter-sr \
locale-lightdm-gtk-greeter-sv \
locale-lightdm-gtk-greeter-ta \
locale-lightdm-gtk-greeter-te \
locale-lightdm-gtk-greeter-th \
locale-lightdm-gtk-greeter-tr \
locale-lightdm-gtk-greeter-ug \
locale-lightdm-gtk-greeter-uk \
locale-lightdm-gtk-greeter-vi \
locale-lightdm-gtk-greeter-zh-CN \
locale-lightdm-gtk-greeter-zh-HK \
locale-lightdm-gtk-greeter-zh-TW"

RDEPENDS:${PN} += "lightdm-gtk-greeter"

inherit rpm
