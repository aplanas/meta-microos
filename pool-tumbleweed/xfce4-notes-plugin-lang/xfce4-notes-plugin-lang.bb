SUMMARY = "Translations for package xfce4-notes-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-notes-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.0"

RPM_NAME = "xfce4-notes-plugin-lang-1.10.0-1.1.noarch.rpm"
RPM_HASH = "282c5698de4003f3864ddcda4fcc8f234c35fd1fbe7580ef93bb216c99f821aac80d72187c5272ba1cdbbcf6a8aa6ab358025cb79200fc8fae6f86bcaffd690c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-notes-plugin-ar \
locale-xfce4-notes-plugin-ast \
locale-xfce4-notes-plugin-be \
locale-xfce4-notes-plugin-bg \
locale-xfce4-notes-plugin-ca \
locale-xfce4-notes-plugin-cs \
locale-xfce4-notes-plugin-da \
locale-xfce4-notes-plugin-de \
locale-xfce4-notes-plugin-el \
locale-xfce4-notes-plugin-en-AU \
locale-xfce4-notes-plugin-en-CA \
locale-xfce4-notes-plugin-en-GB \
locale-xfce4-notes-plugin-es \
locale-xfce4-notes-plugin-et \
locale-xfce4-notes-plugin-eu \
locale-xfce4-notes-plugin-fi \
locale-xfce4-notes-plugin-fr \
locale-xfce4-notes-plugin-gl \
locale-xfce4-notes-plugin-he \
locale-xfce4-notes-plugin-hr \
locale-xfce4-notes-plugin-hu \
locale-xfce4-notes-plugin-id \
locale-xfce4-notes-plugin-is \
locale-xfce4-notes-plugin-it \
locale-xfce4-notes-plugin-ja \
locale-xfce4-notes-plugin-kk \
locale-xfce4-notes-plugin-ko \
locale-xfce4-notes-plugin-lt \
locale-xfce4-notes-plugin-lv \
locale-xfce4-notes-plugin-ms \
locale-xfce4-notes-plugin-nb \
locale-xfce4-notes-plugin-nl \
locale-xfce4-notes-plugin-oc \
locale-xfce4-notes-plugin-pl \
locale-xfce4-notes-plugin-pt \
locale-xfce4-notes-plugin-pt-BR \
locale-xfce4-notes-plugin-ro \
locale-xfce4-notes-plugin-ru \
locale-xfce4-notes-plugin-sk \
locale-xfce4-notes-plugin-sl \
locale-xfce4-notes-plugin-sq \
locale-xfce4-notes-plugin-sr \
locale-xfce4-notes-plugin-sv \
locale-xfce4-notes-plugin-th \
locale-xfce4-notes-plugin-tr \
locale-xfce4-notes-plugin-ug \
locale-xfce4-notes-plugin-uk \
locale-xfce4-notes-plugin-vi \
locale-xfce4-notes-plugin-zh-CN \
locale-xfce4-notes-plugin-zh-TW \
xfce4-notes-plugin-lang \
xfce4-notes-plugin-lang-all \
xfce4-panel-plugin-notes-lang"

RDEPENDS:${PN} += "xfce4-notes-plugin"

inherit rpm
