SUMMARY = "Translations for package mailimporter"
DESCRIPTION = "Provides translations for the 'mailimporter' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "mailimporter-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "633f3dd2d98a6fdb4a29538ca2c55459b9949ae9df12194d547e5a207fcae35ec20fa065f5ab0a88bc9c3764c7b29cea4397bf23288ec6fd10980dd8a769c885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mailimporter-af \
locale-mailimporter-ar \
locale-mailimporter-be \
locale-mailimporter-bg \
locale-mailimporter-br \
locale-mailimporter-bs \
locale-mailimporter-ca \
locale-mailimporter-ca@valencia \
locale-mailimporter-cs \
locale-mailimporter-cy \
locale-mailimporter-da \
locale-mailimporter-de \
locale-mailimporter-el \
locale-mailimporter-en-GB \
locale-mailimporter-eo \
locale-mailimporter-es \
locale-mailimporter-et \
locale-mailimporter-eu \
locale-mailimporter-fa \
locale-mailimporter-fi \
locale-mailimporter-fr \
locale-mailimporter-ga \
locale-mailimporter-gl \
locale-mailimporter-he \
locale-mailimporter-hi \
locale-mailimporter-hr \
locale-mailimporter-hu \
locale-mailimporter-ia \
locale-mailimporter-is \
locale-mailimporter-it \
locale-mailimporter-ja \
locale-mailimporter-ka \
locale-mailimporter-kk \
locale-mailimporter-km \
locale-mailimporter-ko \
locale-mailimporter-lt \
locale-mailimporter-lv \
locale-mailimporter-mai \
locale-mailimporter-mk \
locale-mailimporter-mr \
locale-mailimporter-ms \
locale-mailimporter-nb \
locale-mailimporter-nds \
locale-mailimporter-ne \
locale-mailimporter-nl \
locale-mailimporter-nn \
locale-mailimporter-pa \
locale-mailimporter-pl \
locale-mailimporter-pt \
locale-mailimporter-pt-BR \
locale-mailimporter-ro \
locale-mailimporter-ru \
locale-mailimporter-sk \
locale-mailimporter-sl \
locale-mailimporter-sq \
locale-mailimporter-sr \
locale-mailimporter-sr@ijekavian \
locale-mailimporter-sr@ijekavianlatin \
locale-mailimporter-sr@latin \
locale-mailimporter-sv \
locale-mailimporter-ta \
locale-mailimporter-th \
locale-mailimporter-tr \
locale-mailimporter-ug \
locale-mailimporter-uk \
locale-mailimporter-zh-CN \
locale-mailimporter-zh-TW \
mailimporter-lang \
mailimporter-lang-all"

RDEPENDS:${PN} += "mailimporter"

inherit rpm
