SUMMARY = "Translations for package lightdm-gtk-greeter-settings"
DESCRIPTION = "Provides translations for the 'lightdm-gtk-greeter-settings' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2"

RPM_NAME = "lightdm-gtk-greeter-settings-lang-1.2.2-1.15.noarch.rpm"
RPM_HASH = "8feaba1bf36003aaaa7334bb2e1da9cb4c570e4aaa71ad4ddc6c2dceb4a08cb77286030b9a87465c52ead91681c86479281bc4d95df74dda23963e949be74000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-gtk-greeter-settings-lang \
lightdm-gtk-greeter-settings-lang-all \
locale-lightdm-gtk-greeter-settings-ar \
locale-lightdm-gtk-greeter-settings-br \
locale-lightdm-gtk-greeter-settings-ca \
locale-lightdm-gtk-greeter-settings-cs \
locale-lightdm-gtk-greeter-settings-da \
locale-lightdm-gtk-greeter-settings-de \
locale-lightdm-gtk-greeter-settings-el \
locale-lightdm-gtk-greeter-settings-es \
locale-lightdm-gtk-greeter-settings-fi \
locale-lightdm-gtk-greeter-settings-fr \
locale-lightdm-gtk-greeter-settings-hr \
locale-lightdm-gtk-greeter-settings-it \
locale-lightdm-gtk-greeter-settings-ja \
locale-lightdm-gtk-greeter-settings-kk \
locale-lightdm-gtk-greeter-settings-lt \
locale-lightdm-gtk-greeter-settings-nl \
locale-lightdm-gtk-greeter-settings-pl \
locale-lightdm-gtk-greeter-settings-pt \
locale-lightdm-gtk-greeter-settings-pt-BR \
locale-lightdm-gtk-greeter-settings-ru \
locale-lightdm-gtk-greeter-settings-sr \
locale-lightdm-gtk-greeter-settings-sv \
locale-lightdm-gtk-greeter-settings-zh-CN"

RDEPENDS:${PN} += "lightdm-gtk-greeter-settings"

inherit rpm
