SUMMARY = "Translations for package zenity"
DESCRIPTION = "Provides translations for the 'zenity' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.99.0"

RPM_NAME = "zenity-lang-3.99.0-1.1.noarch.rpm"
RPM_HASH = "83359b633336b8b23d4a48e473dab74f91f930f7b6181b04213f6b8cba3d7d47a727c888586f4cdcc89dbb84c18b56614f7b6970d786b5b1c39015047988f10d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-zenity-af \
locale-zenity-ar \
locale-zenity-as \
locale-zenity-ast \
locale-zenity-az \
locale-zenity-be \
locale-zenity-be@latin \
locale-zenity-bg \
locale-zenity-bn \
locale-zenity-bn-IN \
locale-zenity-bs \
locale-zenity-ca \
locale-zenity-ca@valencia \
locale-zenity-cs \
locale-zenity-cy \
locale-zenity-da \
locale-zenity-de \
locale-zenity-dz \
locale-zenity-el \
locale-zenity-en-CA \
locale-zenity-en-GB \
locale-zenity-en@shaw \
locale-zenity-eo \
locale-zenity-es \
locale-zenity-et \
locale-zenity-eu \
locale-zenity-fa \
locale-zenity-fi \
locale-zenity-fr \
locale-zenity-fur \
locale-zenity-ga \
locale-zenity-gl \
locale-zenity-gu \
locale-zenity-he \
locale-zenity-hi \
locale-zenity-hr \
locale-zenity-hu \
locale-zenity-id \
locale-zenity-is \
locale-zenity-it \
locale-zenity-ja \
locale-zenity-ka \
locale-zenity-kk \
locale-zenity-kn \
locale-zenity-ko \
locale-zenity-lt \
locale-zenity-lv \
locale-zenity-mai \
locale-zenity-mk \
locale-zenity-ml \
locale-zenity-mr \
locale-zenity-ms \
locale-zenity-nb \
locale-zenity-ne \
locale-zenity-nl \
locale-zenity-nn \
locale-zenity-oc \
locale-zenity-or \
locale-zenity-pa \
locale-zenity-pl \
locale-zenity-pt \
locale-zenity-pt-BR \
locale-zenity-ro \
locale-zenity-ru \
locale-zenity-si \
locale-zenity-sk \
locale-zenity-sl \
locale-zenity-sq \
locale-zenity-sr \
locale-zenity-sr@latin \
locale-zenity-sv \
locale-zenity-ta \
locale-zenity-te \
locale-zenity-th \
locale-zenity-tr \
locale-zenity-ug \
locale-zenity-uk \
locale-zenity-vi \
locale-zenity-zh-CN \
locale-zenity-zh-HK \
locale-zenity-zh-TW \
zenity-lang \
zenity-lang-all"

RDEPENDS:${PN} += "zenity"

inherit rpm
