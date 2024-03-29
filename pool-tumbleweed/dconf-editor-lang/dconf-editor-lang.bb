SUMMARY = "Translations for package dconf-editor"
DESCRIPTION = "Provides translations for the 'dconf-editor' package."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "dconf-editor-lang-43.0-1.4.noarch.rpm"
RPM_HASH = "d06d150d7cdd902db5869b7f0cb62a032eaa0fb884cdc248537933656f4d13c5b0edc15d9541e90ff0e1f0c589d60b62cf83b00b58b85d000c0db9c81ec1312d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dconf-editor-lang \
dconf-editor-lang-all \
locale-dconf-editor-af \
locale-dconf-editor-ar \
locale-dconf-editor-as \
locale-dconf-editor-be \
locale-dconf-editor-bg \
locale-dconf-editor-bn-IN \
locale-dconf-editor-bs \
locale-dconf-editor-ca \
locale-dconf-editor-ca@valencia \
locale-dconf-editor-cs \
locale-dconf-editor-da \
locale-dconf-editor-de \
locale-dconf-editor-el \
locale-dconf-editor-en-GB \
locale-dconf-editor-eo \
locale-dconf-editor-es \
locale-dconf-editor-et \
locale-dconf-editor-eu \
locale-dconf-editor-fa \
locale-dconf-editor-fi \
locale-dconf-editor-fr \
locale-dconf-editor-fur \
locale-dconf-editor-gl \
locale-dconf-editor-he \
locale-dconf-editor-hi \
locale-dconf-editor-hr \
locale-dconf-editor-hu \
locale-dconf-editor-id \
locale-dconf-editor-is \
locale-dconf-editor-it \
locale-dconf-editor-ja \
locale-dconf-editor-ka \
locale-dconf-editor-kk \
locale-dconf-editor-ko \
locale-dconf-editor-lt \
locale-dconf-editor-lv \
locale-dconf-editor-ml \
locale-dconf-editor-mr \
locale-dconf-editor-ms \
locale-dconf-editor-nb \
locale-dconf-editor-ne \
locale-dconf-editor-nl \
locale-dconf-editor-oc \
locale-dconf-editor-pa \
locale-dconf-editor-pl \
locale-dconf-editor-pt \
locale-dconf-editor-pt-BR \
locale-dconf-editor-ro \
locale-dconf-editor-ru \
locale-dconf-editor-sk \
locale-dconf-editor-sl \
locale-dconf-editor-sr \
locale-dconf-editor-sr@latin \
locale-dconf-editor-sv \
locale-dconf-editor-ta \
locale-dconf-editor-te \
locale-dconf-editor-th \
locale-dconf-editor-tr \
locale-dconf-editor-ug \
locale-dconf-editor-uk \
locale-dconf-editor-vi \
locale-dconf-editor-zh-CN \
locale-dconf-editor-zh-HK \
locale-dconf-editor-zh-TW"

RDEPENDS:${PN} += "dconf-editor"

inherit rpm
