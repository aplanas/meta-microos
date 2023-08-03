SUMMARY = "Translations for package rhythmbox-plugin-alternative-toolbar"
DESCRIPTION = "Provides translations for the 'rhythmbox-plugin-alternative-toolbar' package."
LICENSE = "GPL-3.0-only"

PV = "0.20.3"

RPM_NAME = "rhythmbox-plugin-alternative-toolbar-lang-0.20.3-1.1.noarch.rpm"
RPM_HASH = "091dcc95f80fe133116a85954eb56c2d6b3a07e4ec6e6f65ea1de640abc568d8f6e8c724785d8db781f896ce24e310082fdd5ded2af3b5778807431454562781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rhythmbox-plugin-alternative-toolbar-af \
locale-rhythmbox-plugin-alternative-toolbar-ast \
locale-rhythmbox-plugin-alternative-toolbar-bg \
locale-rhythmbox-plugin-alternative-toolbar-bs \
locale-rhythmbox-plugin-alternative-toolbar-ca \
locale-rhythmbox-plugin-alternative-toolbar-cs \
locale-rhythmbox-plugin-alternative-toolbar-da \
locale-rhythmbox-plugin-alternative-toolbar-de \
locale-rhythmbox-plugin-alternative-toolbar-el \
locale-rhythmbox-plugin-alternative-toolbar-en-AU \
locale-rhythmbox-plugin-alternative-toolbar-en-CA \
locale-rhythmbox-plugin-alternative-toolbar-en-GB \
locale-rhythmbox-plugin-alternative-toolbar-en-US \
locale-rhythmbox-plugin-alternative-toolbar-eo \
locale-rhythmbox-plugin-alternative-toolbar-es \
locale-rhythmbox-plugin-alternative-toolbar-eu \
locale-rhythmbox-plugin-alternative-toolbar-fa \
locale-rhythmbox-plugin-alternative-toolbar-fi \
locale-rhythmbox-plugin-alternative-toolbar-fr \
locale-rhythmbox-plugin-alternative-toolbar-gl \
locale-rhythmbox-plugin-alternative-toolbar-he \
locale-rhythmbox-plugin-alternative-toolbar-hr \
locale-rhythmbox-plugin-alternative-toolbar-id \
locale-rhythmbox-plugin-alternative-toolbar-it \
locale-rhythmbox-plugin-alternative-toolbar-ja \
locale-rhythmbox-plugin-alternative-toolbar-ko \
locale-rhythmbox-plugin-alternative-toolbar-lv \
locale-rhythmbox-plugin-alternative-toolbar-ms \
locale-rhythmbox-plugin-alternative-toolbar-oc \
locale-rhythmbox-plugin-alternative-toolbar-pl \
locale-rhythmbox-plugin-alternative-toolbar-pt \
locale-rhythmbox-plugin-alternative-toolbar-pt-BR \
locale-rhythmbox-plugin-alternative-toolbar-ru \
locale-rhythmbox-plugin-alternative-toolbar-sk \
locale-rhythmbox-plugin-alternative-toolbar-sl \
locale-rhythmbox-plugin-alternative-toolbar-sq \
locale-rhythmbox-plugin-alternative-toolbar-sr \
locale-rhythmbox-plugin-alternative-toolbar-sr@latin \
locale-rhythmbox-plugin-alternative-toolbar-sv \
locale-rhythmbox-plugin-alternative-toolbar-th \
locale-rhythmbox-plugin-alternative-toolbar-tr \
locale-rhythmbox-plugin-alternative-toolbar-ug \
locale-rhythmbox-plugin-alternative-toolbar-uk \
locale-rhythmbox-plugin-alternative-toolbar-zh-CN \
locale-rhythmbox-plugin-alternative-toolbar-zh-TW \
rhythmbox-plugin-alternative-toolbar-lang \
rhythmbox-plugin-alternative-toolbar-lang-all"

RDEPENDS:${PN} += "rhythmbox-plugin-alternative-toolbar"

inherit rpm
