SUMMARY = "Translations for package duplicity"
DESCRIPTION = "Provides translations for the 'duplicity' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.3"

RPM_NAME = "duplicity-lang-1.2.3-1.1.noarch.rpm"
RPM_HASH = "4550f991904a35c65bac4f28a819fadc949025bf7c561890f2ccb6d601a70e63f5226388b67de4c752ea7ef9f29126f4874dd47d39fa0abf9593647d7d27476c"
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
