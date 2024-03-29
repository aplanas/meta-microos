SUMMARY = "Translations for package systemsettings5"
DESCRIPTION = "Provides translations for the 'systemsettings5' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "systemsettings5-lang-5.27.7-1.1.noarch.rpm"
RPM_HASH = "ff37d481835af93dc471b4d31353fa85e37fe9cf04b21eb2f9106af3efac2dbe807c0eb62df5eabab5a8c472730fedbd797e315e0557ad8e131d9c606a925904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-systemsettings5-ar \
locale-systemsettings5-az \
locale-systemsettings5-be \
locale-systemsettings5-be@latin \
locale-systemsettings5-bg \
locale-systemsettings5-bn-IN \
locale-systemsettings5-bs \
locale-systemsettings5-ca \
locale-systemsettings5-ca@valencia \
locale-systemsettings5-cs \
locale-systemsettings5-da \
locale-systemsettings5-de \
locale-systemsettings5-el \
locale-systemsettings5-en-GB \
locale-systemsettings5-eo \
locale-systemsettings5-es \
locale-systemsettings5-et \
locale-systemsettings5-eu \
locale-systemsettings5-fa \
locale-systemsettings5-fi \
locale-systemsettings5-fr \
locale-systemsettings5-ga \
locale-systemsettings5-gl \
locale-systemsettings5-gu \
locale-systemsettings5-he \
locale-systemsettings5-hi \
locale-systemsettings5-hr \
locale-systemsettings5-hu \
locale-systemsettings5-ia \
locale-systemsettings5-id \
locale-systemsettings5-is \
locale-systemsettings5-it \
locale-systemsettings5-ja \
locale-systemsettings5-ka \
locale-systemsettings5-kk \
locale-systemsettings5-km \
locale-systemsettings5-ko \
locale-systemsettings5-lt \
locale-systemsettings5-lv \
locale-systemsettings5-mai \
locale-systemsettings5-mk \
locale-systemsettings5-ml \
locale-systemsettings5-mr \
locale-systemsettings5-ms \
locale-systemsettings5-nb \
locale-systemsettings5-nds \
locale-systemsettings5-ne \
locale-systemsettings5-nl \
locale-systemsettings5-nn \
locale-systemsettings5-oc \
locale-systemsettings5-or \
locale-systemsettings5-pa \
locale-systemsettings5-pl \
locale-systemsettings5-pt \
locale-systemsettings5-pt-BR \
locale-systemsettings5-ro \
locale-systemsettings5-ru \
locale-systemsettings5-si \
locale-systemsettings5-sk \
locale-systemsettings5-sl \
locale-systemsettings5-sq \
locale-systemsettings5-sr \
locale-systemsettings5-sr@ijekavian \
locale-systemsettings5-sr@ijekavianlatin \
locale-systemsettings5-sr@latin \
locale-systemsettings5-sv \
locale-systemsettings5-ta \
locale-systemsettings5-te \
locale-systemsettings5-th \
locale-systemsettings5-tr \
locale-systemsettings5-ug \
locale-systemsettings5-uk \
locale-systemsettings5-vi \
locale-systemsettings5-wa \
locale-systemsettings5-zh-CN \
locale-systemsettings5-zh-TW \
systemsettings5-lang \
systemsettings5-lang-all"

RDEPENDS:${PN} += "systemsettings5"

inherit rpm
