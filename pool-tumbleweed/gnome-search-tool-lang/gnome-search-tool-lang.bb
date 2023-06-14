SUMMARY = "Translations for package gnome-search-tool"
DESCRIPTION = "Provides translations for the 'gnome-search-tool' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "gnome-search-tool-lang-3.6.0-11.9.noarch.rpm"
RPM_HASH = "6827afccec2c99f30f7830a239282e72e6fa04756481e6f9c2775a8e34e2afc82b3d3bba42bb85357d3dee430a67dfd6a9b4b0bb824b1b950d865677ed117e21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-search-tool-lang \
gnome-search-tool-lang-all \
locale-gnome-search-tool-af \
locale-gnome-search-tool-ar \
locale-gnome-search-tool-as \
locale-gnome-search-tool-ast \
locale-gnome-search-tool-az \
locale-gnome-search-tool-be \
locale-gnome-search-tool-be@latin \
locale-gnome-search-tool-bg \
locale-gnome-search-tool-bn \
locale-gnome-search-tool-bn-IN \
locale-gnome-search-tool-br \
locale-gnome-search-tool-bs \
locale-gnome-search-tool-ca \
locale-gnome-search-tool-ca@valencia \
locale-gnome-search-tool-cs \
locale-gnome-search-tool-cy \
locale-gnome-search-tool-da \
locale-gnome-search-tool-de \
locale-gnome-search-tool-dz \
locale-gnome-search-tool-el \
locale-gnome-search-tool-en-CA \
locale-gnome-search-tool-en-GB \
locale-gnome-search-tool-en@shaw \
locale-gnome-search-tool-eo \
locale-gnome-search-tool-es \
locale-gnome-search-tool-et \
locale-gnome-search-tool-eu \
locale-gnome-search-tool-fa \
locale-gnome-search-tool-fi \
locale-gnome-search-tool-fr \
locale-gnome-search-tool-ga \
locale-gnome-search-tool-gl \
locale-gnome-search-tool-gu \
locale-gnome-search-tool-he \
locale-gnome-search-tool-hi \
locale-gnome-search-tool-hr \
locale-gnome-search-tool-hu \
locale-gnome-search-tool-id \
locale-gnome-search-tool-it \
locale-gnome-search-tool-ja \
locale-gnome-search-tool-ka \
locale-gnome-search-tool-kn \
locale-gnome-search-tool-ko \
locale-gnome-search-tool-lt \
locale-gnome-search-tool-lv \
locale-gnome-search-tool-mai \
locale-gnome-search-tool-mk \
locale-gnome-search-tool-ml \
locale-gnome-search-tool-mr \
locale-gnome-search-tool-ms \
locale-gnome-search-tool-nb \
locale-gnome-search-tool-nds \
locale-gnome-search-tool-ne \
locale-gnome-search-tool-nl \
locale-gnome-search-tool-nn \
locale-gnome-search-tool-oc \
locale-gnome-search-tool-or \
locale-gnome-search-tool-pa \
locale-gnome-search-tool-pl \
locale-gnome-search-tool-pt \
locale-gnome-search-tool-pt-BR \
locale-gnome-search-tool-ro \
locale-gnome-search-tool-ru \
locale-gnome-search-tool-si \
locale-gnome-search-tool-sk \
locale-gnome-search-tool-sl \
locale-gnome-search-tool-sq \
locale-gnome-search-tool-sr \
locale-gnome-search-tool-sr@latin \
locale-gnome-search-tool-sv \
locale-gnome-search-tool-ta \
locale-gnome-search-tool-te \
locale-gnome-search-tool-th \
locale-gnome-search-tool-tr \
locale-gnome-search-tool-ug \
locale-gnome-search-tool-uk \
locale-gnome-search-tool-vi \
locale-gnome-search-tool-wa \
locale-gnome-search-tool-zh-CN \
locale-gnome-search-tool-zh-HK \
locale-gnome-search-tool-zh-TW"

RDEPENDS:${PN} += "gnome-search-tool"

inherit rpm
