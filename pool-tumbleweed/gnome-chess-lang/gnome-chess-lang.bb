SUMMARY = "Translations for package gnome-chess"
DESCRIPTION = "Provides translations for the 'gnome-chess' package."
LICENSE = "GPL-3.0-or-later"

PV = "43.2"

RPM_NAME = "gnome-chess-lang-43.2-1.2.noarch.rpm"
RPM_HASH = "71cb305df522016e2ef5a6344501c6e5c6b8d9390350914b355e2d8d88df3213e358cc6682a198e2bed753b73ef4e67681e11b9561a2a5bd3904b9ab5c9d3d80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-chess-lang \
gnome-chess-lang-all \
locale-gnome-chess-af \
locale-gnome-chess-ar \
locale-gnome-chess-as \
locale-gnome-chess-ast \
locale-gnome-chess-az \
locale-gnome-chess-be \
locale-gnome-chess-bg \
locale-gnome-chess-bn \
locale-gnome-chess-bn-IN \
locale-gnome-chess-br \
locale-gnome-chess-bs \
locale-gnome-chess-ca \
locale-gnome-chess-ca@valencia \
locale-gnome-chess-cs \
locale-gnome-chess-cy \
locale-gnome-chess-da \
locale-gnome-chess-de \
locale-gnome-chess-dz \
locale-gnome-chess-el \
locale-gnome-chess-en-CA \
locale-gnome-chess-en-GB \
locale-gnome-chess-en@shaw \
locale-gnome-chess-eo \
locale-gnome-chess-es \
locale-gnome-chess-et \
locale-gnome-chess-eu \
locale-gnome-chess-fa \
locale-gnome-chess-fi \
locale-gnome-chess-fr \
locale-gnome-chess-fur \
locale-gnome-chess-ga \
locale-gnome-chess-gl \
locale-gnome-chess-gu \
locale-gnome-chess-he \
locale-gnome-chess-hi \
locale-gnome-chess-hr \
locale-gnome-chess-hu \
locale-gnome-chess-id \
locale-gnome-chess-is \
locale-gnome-chess-it \
locale-gnome-chess-ja \
locale-gnome-chess-ka \
locale-gnome-chess-kk \
locale-gnome-chess-km \
locale-gnome-chess-kn \
locale-gnome-chess-ko \
locale-gnome-chess-lt \
locale-gnome-chess-lv \
locale-gnome-chess-mai \
locale-gnome-chess-mk \
locale-gnome-chess-ml \
locale-gnome-chess-mr \
locale-gnome-chess-ms \
locale-gnome-chess-nb \
locale-gnome-chess-ne \
locale-gnome-chess-nl \
locale-gnome-chess-nn \
locale-gnome-chess-oc \
locale-gnome-chess-or \
locale-gnome-chess-pa \
locale-gnome-chess-pl \
locale-gnome-chess-pt \
locale-gnome-chess-pt-BR \
locale-gnome-chess-ro \
locale-gnome-chess-ru \
locale-gnome-chess-si \
locale-gnome-chess-sk \
locale-gnome-chess-sl \
locale-gnome-chess-sq \
locale-gnome-chess-sr \
locale-gnome-chess-sr@latin \
locale-gnome-chess-sv \
locale-gnome-chess-ta \
locale-gnome-chess-te \
locale-gnome-chess-th \
locale-gnome-chess-tr \
locale-gnome-chess-ug \
locale-gnome-chess-uk \
locale-gnome-chess-vi \
locale-gnome-chess-wa \
locale-gnome-chess-zh-CN \
locale-gnome-chess-zh-HK \
locale-gnome-chess-zh-TW"

RDEPENDS:${PN} += "gnome-chess"

inherit rpm
