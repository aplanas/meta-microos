SUMMARY = "Translations for package xfce4-docklike-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-docklike-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "xfce4-docklike-plugin-lang-0.4.1-1.2.noarch.rpm"
RPM_HASH = "1644afa888491204808aeaad92e67fc67421983df537cd3ca74816a821438adbd9cf421ed6c05cc95ee56ff857def644dd677362c8b5e916e97c5ae5e15b57bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-docklike-plugin-bg \
locale-xfce4-docklike-plugin-ca \
locale-xfce4-docklike-plugin-da \
locale-xfce4-docklike-plugin-de \
locale-xfce4-docklike-plugin-el \
locale-xfce4-docklike-plugin-es \
locale-xfce4-docklike-plugin-fi \
locale-xfce4-docklike-plugin-fr \
locale-xfce4-docklike-plugin-he \
locale-xfce4-docklike-plugin-hr \
locale-xfce4-docklike-plugin-id \
locale-xfce4-docklike-plugin-it \
locale-xfce4-docklike-plugin-ja \
locale-xfce4-docklike-plugin-ko \
locale-xfce4-docklike-plugin-lt \
locale-xfce4-docklike-plugin-nb \
locale-xfce4-docklike-plugin-nl \
locale-xfce4-docklike-plugin-pl \
locale-xfce4-docklike-plugin-pt \
locale-xfce4-docklike-plugin-pt-BR \
locale-xfce4-docklike-plugin-ru \
locale-xfce4-docklike-plugin-sk \
locale-xfce4-docklike-plugin-sl \
locale-xfce4-docklike-plugin-sq \
locale-xfce4-docklike-plugin-sr \
locale-xfce4-docklike-plugin-sv \
locale-xfce4-docklike-plugin-tr \
locale-xfce4-docklike-plugin-uk \
locale-xfce4-docklike-plugin-zh-CN \
locale-xfce4-docklike-plugin-zh-TW \
xfce4-docklike-plugin-lang \
xfce4-docklike-plugin-lang-all"

RDEPENDS:${PN} += "xfce4-docklike-plugin"

inherit rpm
