SUMMARY = "Translations for package xdg-user-dirs"
DESCRIPTION = "Provides translations for the 'xdg-user-dirs' package."
LICENSE = "GPL-2.0-only"

PV = "0.18"

RPM_NAME = "xdg-user-dirs-lang-0.18-2.2.noarch.rpm"
RPM_HASH = "5a4e85221a32d193e67ffb6a22052c6fbc02ffb347e4620ed11b563387fd93fa5d8bdf53d3ec62bb8c747087a837b110fe78d5ab76610bf9714b5d352cf789bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xdg-user-dirs-af \
locale-xdg-user-dirs-ar \
locale-xdg-user-dirs-as \
locale-xdg-user-dirs-ast \
locale-xdg-user-dirs-be \
locale-xdg-user-dirs-be@latin \
locale-xdg-user-dirs-bg \
locale-xdg-user-dirs-bn-IN \
locale-xdg-user-dirs-br \
locale-xdg-user-dirs-ca \
locale-xdg-user-dirs-cs \
locale-xdg-user-dirs-da \
locale-xdg-user-dirs-de \
locale-xdg-user-dirs-el \
locale-xdg-user-dirs-eo \
locale-xdg-user-dirs-es \
locale-xdg-user-dirs-et \
locale-xdg-user-dirs-eu \
locale-xdg-user-dirs-fa \
locale-xdg-user-dirs-fi \
locale-xdg-user-dirs-fr \
locale-xdg-user-dirs-fur \
locale-xdg-user-dirs-ga \
locale-xdg-user-dirs-gd \
locale-xdg-user-dirs-gl \
locale-xdg-user-dirs-gu \
locale-xdg-user-dirs-he \
locale-xdg-user-dirs-hi \
locale-xdg-user-dirs-hr \
locale-xdg-user-dirs-hu \
locale-xdg-user-dirs-ia \
locale-xdg-user-dirs-id \
locale-xdg-user-dirs-is \
locale-xdg-user-dirs-it \
locale-xdg-user-dirs-ja \
locale-xdg-user-dirs-kk \
locale-xdg-user-dirs-kn \
locale-xdg-user-dirs-ko \
locale-xdg-user-dirs-lt \
locale-xdg-user-dirs-lv \
locale-xdg-user-dirs-mk \
locale-xdg-user-dirs-ml \
locale-xdg-user-dirs-mr \
locale-xdg-user-dirs-nb \
locale-xdg-user-dirs-nds \
locale-xdg-user-dirs-nl \
locale-xdg-user-dirs-nn \
locale-xdg-user-dirs-or \
locale-xdg-user-dirs-pa \
locale-xdg-user-dirs-pl \
locale-xdg-user-dirs-pt \
locale-xdg-user-dirs-pt-BR \
locale-xdg-user-dirs-ro \
locale-xdg-user-dirs-ru \
locale-xdg-user-dirs-sk \
locale-xdg-user-dirs-sl \
locale-xdg-user-dirs-sq \
locale-xdg-user-dirs-sr \
locale-xdg-user-dirs-sr@latin \
locale-xdg-user-dirs-sv \
locale-xdg-user-dirs-ta \
locale-xdg-user-dirs-te \
locale-xdg-user-dirs-th \
locale-xdg-user-dirs-tr \
locale-xdg-user-dirs-uk \
locale-xdg-user-dirs-vi \
locale-xdg-user-dirs-zh-CN \
locale-xdg-user-dirs-zh-HK \
locale-xdg-user-dirs-zh-TW \
xdg-user-dirs-lang \
xdg-user-dirs-lang-all"

RDEPENDS:${PN} += "xdg-user-dirs"

inherit rpm
