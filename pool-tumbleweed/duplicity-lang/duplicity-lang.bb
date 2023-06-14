SUMMARY = "Translations for package duplicity"
DESCRIPTION = "Provides translations for the 'duplicity' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2"

RPM_NAME = "duplicity-lang-1.2.2-1.2.noarch.rpm"
RPM_HASH = "c146721703109c8c1ea75334d18303dae97b4e75da855a77cfb327fecdeff71fcb7443077e69470a7e4d376df2bee5b438320445d16e0b5e8248de6c654c866e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "duplicity-lang \
duplicity-lang-all \
locale-duplicity-cs-CZ \
locale-duplicity-de-AT \
locale-duplicity-de-DE \
locale-duplicity-el-GR \
locale-duplicity-en-AU \
locale-duplicity-en-GB \
locale-duplicity-en-US \
locale-duplicity-es-ES \
locale-duplicity-es-MX \
locale-duplicity-es-PR \
locale-duplicity-fi-FI \
locale-duplicity-fr-FR \
locale-duplicity-it-IT \
locale-duplicity-nl-BE \
locale-duplicity-pl-PL \
locale-duplicity-pt-BR \
locale-duplicity-pt-PT \
locale-duplicity-ru-RU \
locale-duplicity-tr-TR \
locale-duplicity-uk-UA \
locale-duplicity-zh-CN \
locale-duplicity-zh-HK \
locale-duplicity-zh-TW"

RDEPENDS:${PN} += "duplicity"

inherit rpm
