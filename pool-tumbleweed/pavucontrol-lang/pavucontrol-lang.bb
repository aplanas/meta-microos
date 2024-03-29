SUMMARY = "Translations for package pavucontrol"
DESCRIPTION = "Provides translations for the 'pavucontrol' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.0"

RPM_NAME = "pavucontrol-lang-5.0-1.10.noarch.rpm"
RPM_HASH = "29fe935f9c941c40acd33425098e56e639f5fb1b6c1156cf94859367a6a28769d7c9a1dfbf9dd11551328486641d34fbb71ecc36195939e8b2d86dd71a8fe144"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pavucontrol-as \
locale-pavucontrol-ast \
locale-pavucontrol-be \
locale-pavucontrol-bn-IN \
locale-pavucontrol-ca \
locale-pavucontrol-ca@valencia \
locale-pavucontrol-cs \
locale-pavucontrol-da \
locale-pavucontrol-de \
locale-pavucontrol-el \
locale-pavucontrol-es \
locale-pavucontrol-eu \
locale-pavucontrol-fi \
locale-pavucontrol-fr \
locale-pavucontrol-gl \
locale-pavucontrol-gu \
locale-pavucontrol-he \
locale-pavucontrol-hi \
locale-pavucontrol-hr \
locale-pavucontrol-hu \
locale-pavucontrol-it \
locale-pavucontrol-ja \
locale-pavucontrol-kk \
locale-pavucontrol-kn \
locale-pavucontrol-ko \
locale-pavucontrol-lt \
locale-pavucontrol-ml \
locale-pavucontrol-mr \
locale-pavucontrol-nb-NO \
locale-pavucontrol-nl \
locale-pavucontrol-nn \
locale-pavucontrol-or \
locale-pavucontrol-pa \
locale-pavucontrol-pl \
locale-pavucontrol-pt \
locale-pavucontrol-pt-BR \
locale-pavucontrol-ru \
locale-pavucontrol-si \
locale-pavucontrol-sk \
locale-pavucontrol-sl \
locale-pavucontrol-sr \
locale-pavucontrol-sr@latin \
locale-pavucontrol-sv \
locale-pavucontrol-ta \
locale-pavucontrol-te \
locale-pavucontrol-th \
locale-pavucontrol-tr \
locale-pavucontrol-uk \
locale-pavucontrol-zh-CN \
locale-pavucontrol-zh-TW \
pavucontrol-lang \
pavucontrol-lang-all"

RDEPENDS:${PN} += "pavucontrol"

inherit rpm
