SUMMARY = "Translations for package xfce4-panel"
DESCRIPTION = "Provides translations for the 'xfce4-panel' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.4"

RPM_NAME = "xfce4-panel-lang-4.18.4-1.1.noarch.rpm"
RPM_HASH = "1830b7806181f172a3e10981801f0babb3cd9fd461f8c35fd0e2d1aed1ec18b1ea80052ab009efa47fc020d38208f1245f03619c327d89352bcd0b21a000f071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-panel-ar \
locale-xfce4-panel-be \
locale-xfce4-panel-bg \
locale-xfce4-panel-bn \
locale-xfce4-panel-ca \
locale-xfce4-panel-cs \
locale-xfce4-panel-da \
locale-xfce4-panel-de \
locale-xfce4-panel-el \
locale-xfce4-panel-en-AU \
locale-xfce4-panel-en-GB \
locale-xfce4-panel-eo \
locale-xfce4-panel-es \
locale-xfce4-panel-et \
locale-xfce4-panel-eu \
locale-xfce4-panel-fi \
locale-xfce4-panel-fr \
locale-xfce4-panel-gl \
locale-xfce4-panel-he \
locale-xfce4-panel-hr \
locale-xfce4-panel-hu \
locale-xfce4-panel-id \
locale-xfce4-panel-is \
locale-xfce4-panel-it \
locale-xfce4-panel-ja \
locale-xfce4-panel-ka \
locale-xfce4-panel-ko \
locale-xfce4-panel-lt \
locale-xfce4-panel-lv \
locale-xfce4-panel-ms \
locale-xfce4-panel-nb \
locale-xfce4-panel-nl \
locale-xfce4-panel-nn \
locale-xfce4-panel-oc \
locale-xfce4-panel-pa \
locale-xfce4-panel-pl \
locale-xfce4-panel-pt \
locale-xfce4-panel-pt-BR \
locale-xfce4-panel-ro \
locale-xfce4-panel-ru \
locale-xfce4-panel-si \
locale-xfce4-panel-sk \
locale-xfce4-panel-sl \
locale-xfce4-panel-sq \
locale-xfce4-panel-sr \
locale-xfce4-panel-sv \
locale-xfce4-panel-te \
locale-xfce4-panel-th \
locale-xfce4-panel-tr \
locale-xfce4-panel-ug \
locale-xfce4-panel-uk \
locale-xfce4-panel-vi \
locale-xfce4-panel-zh-CN \
locale-xfce4-panel-zh-HK \
locale-xfce4-panel-zh-TW \
xfce4-panel-lang \
xfce4-panel-lang-all"

RDEPENDS:${PN} += "xfce4-panel"

inherit rpm
